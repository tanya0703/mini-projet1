package connecte;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Serveur {

    public static void main(String[] args) {

        ServerSocket socketserver;
        Socket socket1;
        try {  

            socketserver = new ServerSocket(2009);
            socket1 = socketserver.accept(); 
            System.out.println("Un client s'est connecte!");
            socketserver.close();
            socket1.close();

        }catch (IOException e) {
            e.printStackTrace();

        }
    }
}

