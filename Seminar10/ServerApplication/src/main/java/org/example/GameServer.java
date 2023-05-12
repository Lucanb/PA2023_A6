package org.example;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import static sun.nio.ch.Net.bind;


public class GameServer{
    public static final int PORT = 9999;
   public void MyServer() throws IOException {
       ServerSocket serverSocket = new ServerSocket(9999);
        try {
            while (true) {
                System.out.println("Waiting for a client ...");
                serverSocket.setSoTimeout(10000);
                serverSocket.bind(serverSocket.getLocalSocketAddress() , PORT);
                Socket socket = serverSocket.accept();
                // Execute the client's request in a new thread
                new ClientThread(socket).start();
            }
        }catch (IOException e) {
            System.err.println("Ooops... " + e);
        }
    }
    serverSocket.close();
}
