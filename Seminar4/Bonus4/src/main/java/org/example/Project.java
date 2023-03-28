package org.example;

public class Project implements Element {

    private String name;

    public Project(String name) {
        this.name = name;
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
        Project project = (Project) obj;
        return this.name.equals(project.name);
    }

    @Override
    public String toString() {
        return this.name;
    }
}
