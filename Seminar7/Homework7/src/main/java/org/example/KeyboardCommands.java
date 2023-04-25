package org.example;

import java.util.List;
import java.util.Scanner;

public class KeyboardCommands extends Thread {

    List<Robot> robots;

    //read from terminal what a user write with the thread function
    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String name = new String();
           System.out.println(input);
        boolean sw = false;

        for(Robot robot:robots){
            if(input.contains(robot.getName())) {
                name = robot.getName();
                sw=true;
            }
        }

        if(sw == true)
        {
            System.out.println("Doesn't exist that robot");
        }

        while (!input.equals("exit")) {
            if (input.equals("pause")) {
                PauseAll();
            } else {
                if (input.equals("resume")) {
                    ResumeAll();
                } else {
                    if (input.equals("stop")) {
                        StopAll();
                    } else {
                        if (input.equals("pause" + " " + name)) {
                            PauseAll(name);
                        } else {
                            if (input.equals("resume" + " " + name)) {
                                ResumeAll(name);
                            } else {
                                System.out.println("Invalid command");
                            }
                        }

                    }
                }
            }
        }

    }


    public void StopAll() {
        for (Robot robot : robots) {
            robot.setRunning(false);
        }
    }

    public void ResumeAll() {
        for (Robot robot : robots) {
            robot.setWaiting(false);
        }
    }

    public void ResumeAll(String name) {
        for (Robot robot : robots) {
            if (robot.getName() == name)
                robot.setWaiting(false);
        }
    }

    public void PauseAll() {
        for (Robot robot : robots) {
            robot.setWaiting(true);
        }
    }

    public void PauseAll(String name) {
        for (Robot robot : robots) {
            if (robot.getName() == name) {
                robot.setWaiting(true);
            }
        }
    }

     public KeyboardCommands(List<Robot> robots) {
         this.robots = robots;
     }
}
