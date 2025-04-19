package dispatcher;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;

import sygus.Sygus.SygusProblem;
import sygus.Sygus.SygusSolution;

public class RpcServer {
    public static void main(String[] args) {
        try {
            //Read protobuf binary input
            byte[] inBuf = Files.readAllBytes(Paths.get("/tmp/input.pb"));
            SygusProblem problem = SygusProblem.parseFrom(inBuf);
            System.out.println("[RpcServer] Loaded problem.");

            // Write to temporary .sl file
            String tempSlPath = "/tmp/problem.sl";
            String logic = problem.getLogic();
            String program = problem.getProgram();

            String content = "(set-logic " + logic + ")\n" + program + "\n";
            Files.writeString(Path.of(tempSlPath), content);
            System.out.println("[RpcServer] Problem written to " + tempSlPath);

            // Call `java Run <problem.sl>` via ProcessBuilder
            ProcessBuilder pb = new ProcessBuilder("java",
                                                "-Djava.library.path=lib",
                                                "-cp", "lib/antlr.jar:lib/protobuf-java-3.25.3.jar:lib/com.microsoft.z3.jar:lib/jopt-simple.jar:classes",
                                                    "Run", tempSlPath);

            pb.inheritIO(); // show output directly can be deleted later
            Process p = pb.start();
            int exitCode = p.waitFor();

            // Handle success/failure
            if (exitCode != 0) {
                System.err.println("[RpcServer] Run.java failed with exit code " + exitCode);
                writeError("Failed to solve problem.");
                return;
            }

            // Read solution from stdout or parse file
            String answer = Files.readString(Paths.get("/tmp/result.sl"));
            SygusSolution solution = SygusSolution.newBuilder()
                                                  .setSuccess(true)
                                                  .setAnswer(answer)
                                                  .setErrorMsg("")
                                                  .build();
            Files.write(Paths.get("/tmp/output.pb"), solution.toByteArray());

            System.out.println("[RpcServer] Solution written to /tmp/output.pb");

        } catch (Exception e) {
            System.err.println("[RpcServer] Internal Error: " + e.getMessage());
            e.printStackTrace();
            try {
                writeError(e.toString());
            } catch (IOException ignored) {}
        }
    }

    private static void writeError(String msg) throws IOException {
        SygusSolution solution = SygusSolution.newBuilder()
                .setSuccess(false)
                .setAnswer("")
                .setErrorMsg(msg)
                .build();
        Files.write(Paths.get("/tmp/output.pb"), solution.toByteArray());
    }
}
