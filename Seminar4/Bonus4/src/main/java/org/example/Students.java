package org.example;

public class Students implements Comparable<Students>{
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Students(String name) {
        setName(name);
    }

    @Override
    public int compareTo(Students o) {
        return 0;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                '}';
    }
}
