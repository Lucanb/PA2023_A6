package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exploration {
    private final SharedMemory mem = new SharedMemory(5);
    private final ExplorationMap map = new ExplorationMap(5);
    private final List<Robot> robots = new ArrayList<>();

    public ExplorationMap getMap() {
        return map;
    }

    public List<Robot> getRobots() {
        return robots;
    }

    public SharedMemory getMem() {
        return mem;
    }

    KeyboardCommands keyboardCommands = new KeyboardCommands(getRobots());
    public KeyboardCommands getKeyboardCommands() {
        return keyboardCommands;
    }

    public void start() {
        for (Robot robot : robots) {
            // start a new Thread representing the robot;
            robot.setRunning(true);
            robot.setExplore(this);
            new Thread(robot).start();
            new Thread(keyboardCommands).start();
        }
        new TimeKeeper(200).start();
    }

    public void addRobot(Robot toAdd) {
        robots.add(toAdd);
    }

    public static void main(String args[]) {
        var explore = new Exploration();
        explore.addRobot(new Robot("Wall-E"));
        explore.addRobot(new Robot("R2D2"));
        explore.addRobot(new Robot("Optimus Prime"));
        explore.start();
    }
}

