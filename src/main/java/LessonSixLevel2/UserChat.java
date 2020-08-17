package LessonSixLevel2;

import java.io.IOException;
import java.net.Socket;

public class UserChat {

    private final String SERVER_ADDR = "localhost";
    private final int SERVER_PORT = 8186;

    public UserChat() {
        try {
            Socket socket = new Socket(SERVER_ADDR, SERVER_PORT);
            System.out.println("Enter your message");
            new User(socket, "Client");
            while (true) {
                if (socket.isClosed()) {
                    break;
                }
            }
            System.exit(0);
        } catch (IOException e) {
            System.out.println("Server is not working");
        }
    }

    public static void main(String[] args) {
        new UserChat();
    }
}