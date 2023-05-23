package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class GameServer implements Runnable {
    private ArrayList<ConnectionHandler> connections;
    private ServerSocket server;

    private ExecutorService pool;
    private boolean done = false;

    public GameServer() {
        connections = new ArrayList<ConnectionHandler>();
    }

    @Override
    public void run() {
        try {
            server = new ServerSocket(9999);
            pool = Executors.newCachedThreadPool();
            while (!done) {
               // server.bind(server.getLocalSocketAddress(),9999);
                Socket client = server.accept();
                ConnectionHandler handler = new ConnectionHandler(client);
                connections.add(handler);
                pool.execute(handler);

                // clientThread.start();
            }
        } catch (IOException e) {
            System.err.println("Communication error... " + e);
            shutdown();
        }
    }

    public void shutdown() {
        try {
            done=true;
            if (!server.isClosed()) {
                server.close();
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
    public void broadcast(String message) {
        for (ConnectionHandler it : connections) {
            if (it != null) {
                it.sendMessage(message);
            }
        }
    }

    class ConnectionHandler implements Runnable {
        private Socket client;
        private BufferedReader in;
        private PrintWriter out;

        private String message;

        @Override

        public void run() {
            try {
                out = new PrintWriter(client.getOutputStream(), true);
                in = new BufferedReader(new InputStreamReader(client.getInputStream()));
                System.out.println("PLease tell me something");
                message = in.readLine();
                broadcast("Joined the chat ");
                while ((message = in.readLine()) != null) {
                    if (message.startsWith("/quit")) {
                        broadcast("Left the Chat!");
                        shutdown();
                    } else {
                        broadcast(message);
                    }
                }
            } catch (IOException e) {
                System.out.println(e);
                shutdown();
            }
        }

        public ConnectionHandler(Socket client) {
            this.client = client;
        }

        public void sendMessage(String message) {
            System.out.println(message);
        }

    }

    public static void main(String args[])
    {
        GameServer server= new GameServer();
        server.run();
    }
}
