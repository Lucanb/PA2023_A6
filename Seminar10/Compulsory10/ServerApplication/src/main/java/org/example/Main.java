package org.example;

public class Main {
    public static void main(String[] args) {
        GameServer server = new GameServer();
        Thread thread = new Thread(server);
        thread.start();
    }
}
