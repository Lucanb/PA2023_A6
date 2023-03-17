package org.example;

public class Projects implements Comparable<Projects> {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Projects(String name) {
        setName(name);
    }

    @Override
    public int compareTo(Projects o) {
        return 0;
    }
}
