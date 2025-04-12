package dispatcher;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public final class RpcServer {
    private static byte[] solve(byte[] input) {
        return input; //alternate with the real solver algorithm
    }

    public static void main(String[] args) throws Exception {
        int port = args.length > 0 ? Integer.parseInt(args[0]) : 7777;
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
            int len = din.readInt();
            byte[] inBuf = new byte[len];
            din.readFully(inBuf);
            byte[] outBuf = solve(inBuf);
            dout.writeInt(outBuf.length);
            dout.write(outBuf);
            dout.flush();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
