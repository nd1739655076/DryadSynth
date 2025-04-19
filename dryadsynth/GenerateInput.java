// Save as GenerateInput.java
import sygus.Sygus.SygusProblem;
import java.nio.file.*;

public class GenerateInput {
    public static void main(String[] args) throws Exception {
        SygusProblem problem = SygusProblem.newBuilder()
            .setLogic("LIA")
            .setProgram("(synth-fun f ((x Int)) Int\n" +
                        "  ((Start Int) (StartBool Bool))\n" +
                        "  ((Start Int (0 1 x (+ Start Start)))\n" +
                        "   (StartBool Bool ((and StartBool StartBool)\n" +
                        "                    (not StartBool)\n" +
                        "                    (> Start Start))))))\n" +
                        "(constraint (= (f 0) 1))\n" +
                        "(check-synth)")
            .build();

        Files.write(Paths.get("/tmp/input.pb"), problem.toByteArray());
        System.out.println("Written /tmp/input.pb");
    }
}
