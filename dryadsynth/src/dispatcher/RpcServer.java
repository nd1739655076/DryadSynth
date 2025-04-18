package dispatcher;

import sygus.Sygus;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public final class RpcServer {
    // private static byte[] solve(byte[] input) {
    //     return input; //alternate with the real solver algorithm
    // }

    public static void main(String[] args) throws Exception {
        int port = args.length > 0 ? Integer.parseInt(args[0]) : 24961;
        try (ServerSocket server = new ServerSocket(port)) {
            System.out.println("[DryadSynth] RPC server listening on " + port);
            while (true) {
                final Socket client = server.accept();
                new Thread(() -> handle(client)).start();
            }
        }
    }

    private static void handle(Socket client) {
        try (DataInputStream  din  = new DataInputStream(client.getInputStream());
             DataOutputStream dout = new DataOutputStream(client.getOutputStream())) {
            // Read the request
            int len = din.readInt();
            byte[] inBuf = new byte[len];
            din.readFully(inBuf);
            // Decode Protobuf
            Sygus.SygusProblem problem = Sygus.SygusProblem.parseFrom(inBuf);
            String logic = problem.getLogic();
            String program = problem.getProgram();
            System.out.println("[RPC Server] Received logic:" + logic);
            System.out.println("[RPC Server] Received program:" + program);

            //TODO Call server. Now is simple echo result
            String result = "(define-fun max2 ...)";
            boolean success = true;
            
            // Response
            Sygus.SygusSolution solution = Sygus.SygusSolution.newBuilder()
                                                .setSuccess(success)
                                                .setAnswer(result)
                                                .setErrorMsg("Error from SygusSolution")
                                                .build();
            byte[] outBuf = solution.toByteArray();
            dout.writeInt(outBuf.length);
            dout.write(outBuf);
            dout.flush();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
