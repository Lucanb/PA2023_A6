package org.example;

public class TimeKeeper extends Thread{
    private int timeLimit; // Time limit in seconds
    private boolean timeIsUp;

    public TimeKeeper(int timeLimit) {
        this.timeLimit = timeLimit;
        this.timeIsUp = false;
        this.setDaemon(true); // Set this thread as a daemon thread
    }

    @Override
    public void run() {
        int elapsedSeconds = 0;
        while (!timeIsUp) {
            try {
                Thread.sleep(1000); // Wait for 1 second
                elapsedSeconds++;
                System.out.println("Elapsed time: " + elapsedSeconds + " seconds");
                if (elapsedSeconds >= timeLimit) {
                    timeIsUp = true;
                    System.out.println("Time is up!");
                }
            } catch (InterruptedException e) {
                System.out.println("Timekeeper thread interrupted");
                Thread.currentThread().interrupt();
            }
        }
    }

    public boolean isTimeUp() {
        return timeIsUp;
    }
}
