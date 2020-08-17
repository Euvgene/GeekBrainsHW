package LessonSixLevel2;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class User {
    private Scanner in;
    private Scanner input;
    private PrintWriter output;
    private Thread threadIn;
    private Thread threadOut;

    public User(Socket socket, String name) {
        try {
            in = new Scanner(socket.getInputStream());
            input = new Scanner(System.in);
            output = new PrintWriter(socket.getOutputStream(),true);
        } catch (IOException e) {
            e.printStackTrace();
        }

        threadOut = new Thread(() -> {
            while (true) {
                if (input.hasNext()) {
                    String msg = input.next();
                    sendMsg(name + ": " + msg);
                    if (msg.equalsIgnoreCase("close")){
                        break;
                    }
                }
            }
            close(socket);
        });
        threadOut.start();
        threadIn = new Thread(() -> {
            while (true) {
                if (in.hasNext()) {
                    String msg = in.nextLine();
                    System.out.println(msg);
                    if (msg.contains("close")) {
                        break;
                    }
                }
            }
            close(socket);
        });
        threadIn.start();
    }

    private void sendMsg(String msg) {
        output.println(msg);
    }

    private void close(Socket socket) {
        threadIn.interrupt();
        threadOut.interrupt();
        try {
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}