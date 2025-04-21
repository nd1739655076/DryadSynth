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
            if (args.length < 1) {
                System.err.println("Usage: java dispatcher.RpcServer <input.sl or input.pb>");
                return;
            }

            String inputPath = args[0];
            SygusProblem problem;

            if (inputPath.endsWith(".sl")) {
                // .sl file, read the string and transform the format
                System.out.println("[RpcServer] Reading .sl input file...");

                String slContent = Files.readString(Path.of(inputPath));
                slContent = slContent.replace("\r\n", "\n").replace("\r", "\n");
                String logic = extractLogic(slContent);
                String cleaned = slContent.replaceAll("\\(set-logic\\s+[^\\)]+\\)", "").trim(); // 去掉重复 logic

                problem = SygusProblem.newBuilder()
                        .setLogic(logic)
                        .setProgram(cleaned)
                        .build();

                Files.write(Paths.get("/tmp/input.pb"), problem.toByteArray());
                System.out.println("[RpcServer] Converted .sl to protobuf at /tmp/input.pb");

            } else {
                // .pb file
                byte[] inBuf = Files.readAllBytes(Paths.get(inputPath));
                problem = SygusProblem.parseFrom(inBuf);
                System.out.println("[RpcServer] Loaded binary problem.");
            }

            // write to problem.sl for Run.java
            String tempSlPath = "/tmp/problem.sl";
            String content = "(set-logic " + problem.getLogic() + ")\n" + problem.getProgram() + "\n";
            Files.writeString(Path.of(tempSlPath), content);
            System.out.println("[RpcServer] Problem written to " + tempSlPath);

            // call Run.java
            ProcessBuilder pb = new ProcessBuilder("java",
                    "-Djava.library.path=lib",
                    "-cp", "lib/antlr.jar:lib/protobuf-java-3.25.3.jar:lib/com.microsoft.z3.jar:lib/jopt-simple.jar:classes",
                    "Run", tempSlPath);

            pb.inheritIO();
            Process p = pb.start();
            int exitCode = p.waitFor();

            if (exitCode != 0) {
                System.err.println("[RpcServer] Run.java failed with exit code " + exitCode);
                writeError("Failed to solve problem.");
                return;
            }

            // get output
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

    //set up the logic
    private static String extractLogic(String slContent) {
        for (String line : slContent.split("\n")) {
            line = line.trim();
            if (line.startsWith("(set-logic")) {
                int start = line.indexOf(" ") + 1;
                int end = line.indexOf(")", start);
                return line.substring(start, end).trim();
            }
        }
        return "LIA";
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
