package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import java.net.UnknownHostException;

public class GameClient implements Runnable{
    String serverAddress = "127.0.0.1"; // The server's IP address
    int PORT = 9999; // The server's port
    boolean done;
    private Socket client;
    private BufferedReader in;
    private PrintWriter out;


    @Override
    public void run() {
        try{
              client= new Socket(serverAddress,PORT);
            out= new PrintWriter(client.getOutputStream(),true);
            in= new BufferedReader(new InputStreamReader(client.getInputStream()));

            InputHandler inputHandler= new InputHandler(in);
            Thread thread= new Thread(inputHandler);
            thread.start();

            String inMessage = new String();
            while((inMessage=in.readLine())!=null){
                System.out.println(inMessage);
            }


        }catch (IOException e){
            System.err.println("Communication error..."+e);
            shutDown();
        }
    }

    public void shutDown(){
        done=true;
        try{
            in.close();
            out.close();
            if(!client.isClosed())
                client.close();

        }catch (IOException e){
            System.err.println(e);
        }
    }

    //Aici am facut o clasa speciala care se ocupa cu inputurile de la tastatura numita InputHandler
    class InputHandler implements Runnable{
        BufferedReader in;
        public InputHandler(BufferedReader in){
            this.in=in;
        }
        @Override
        public void run() {
            while(!done){
                try{
                    BufferedReader bufferedReader= new BufferedReader(new InputStreamReader(System.in));
                    String message = bufferedReader.readLine(); // Get message from the console
                    if(message =="/quit") {
                        System.out.println(message);
                        bufferedReader.close();
                        shutDown();
                    }
                    else {
                        out.println(message);
                    }
                }
                catch(IOException e){
                    System.err.println(e);
                }
            }
        }
    }
    public static void main(String[] args){
        GameClient gameClient= new GameClient();
        gameClient.run();
    }
}


