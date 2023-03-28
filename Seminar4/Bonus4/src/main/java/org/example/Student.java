package org.example;

import java.util.ArrayList;
import java.util.List;

public class Student implements Element {
    private String name;
    private List<Project> projects;
    public Student(String name, List<Project> projects) {
        this.name = name;
        this.projects = new ArrayList<>(projects);
    }

    public List<Project> getProjects() {
        return projects;
    }

    @Override
    public int compareTo(Element o) {
        return this.name.compareTo(o.getName());
    }
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != getClass()) {
            return false;
        }
        Student student = (Student) obj;
        return this.name.equals(student.name);
    }

    @Override
    public String toString() {
        return this.name;
    }
}
