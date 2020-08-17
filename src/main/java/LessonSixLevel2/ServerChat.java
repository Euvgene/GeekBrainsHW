package LessonSixLevel2;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerChat {

    public ServerChat() {
        Socket socket = null;
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(8186);
            System.out.println("Server is run. Waiting for connection");
            socket = serverSocket.accept();
            System.out.println("Client is connected");
            new User(socket, "Сервер");
           while (true) {
               if (socket.isClosed()) {
                   break;
               }
           }
            serverSocket.close();
            System.exit(0);
        } catch (IOException e) {
            System.out.println("Port is not empty");
        }
    }

    public static void main(String[] args) {
        new ServerChat();
    }
}