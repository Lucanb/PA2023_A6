package org.example;

import java.util.List;
import java.util.Stack;
import java.util.concurrent.ThreadLocalRandom;

import javafx.util.Pair;

public class Robot implements Runnable {
    private String name;

    //List of pairs declare in Exploration class
    private Stack<Pair> path = new Stack<Pair>();

    private volatile boolean waiting = false;

    private int contor = 0;
    private boolean running;
    Exploration explore;

    public void setContor(int contor) {
        this.contor = contor;
    }

    public int getContor() {
        return contor;
    }

    public void setWaiting(boolean waiting) {
        this.waiting = waiting;
    }

    public boolean getWaiting() {
        return waiting;
    }

    public void setExplore(Exploration explore) {
        this.explore = explore;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

    public Exploration getExplore() {
        return explore;
    }

    public String getName() {
        return name;
    }

    public Robot(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        while (running) {
            if (waiting) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                //pick a cell;
                if (path.isEmpty()) {
                    int row = ThreadLocalRandom.current().nextInt(0, explore.getMap().getMatrix().length);
                    int col = ThreadLocalRandom.current().nextInt(0, explore.getMap().getMatrix().length);
                    path.push(new Pair(row, col));
                } else {
                    Pair a = path.pop();
                    int row = (int) a.getKey();
                    int col = (int) a.getValue();

                    int v[] = {1, -1};

                    for (int i = 0; i < v.length; i++) {
                        if (row + v[i] >= 0 && row + v[i] < explore.getMap().getMatrix().length)
                            path.push(new Pair(row + v[i], col));
                        if (col + v[i] >= 0 && col + v[i] < explore.getMap().getMatrix().length)
                            path.push(new Pair(row, col + v[i]));
                    }
/////////////////////VERIFICA REZULTAT
                    boolean verify = explore.getMap().visit(row, col, this);

                    if (verify) {
                        contor++;
                    }

                    try {
                        Thread.sleep(4000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    if (explore.getMap().isFull() == true) {
                        running = false;
                        System.out.println("A fost parcursa toata mapa!");
                        System.out.println(getContor());
                    }
                }
            }

        }
    }
}