package org.example;

import java.util.*;

public class Vertex {
    private final int id;
    private final Map<Vertex, Double> neighbors;

    public Vertex(int id) {
        this.id = id;
        this.neighbors = new HashMap<>();
    }

    public int getId() {
        return id;
    }

    public void addNeighbor(Vertex neighbor, double weight) {
        neighbors.put(neighbor, weight);
    }

    public Map<Vertex, Double> getNeighbors() {
        return Collections.unmodifiableMap(neighbors);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Vertex)) {
            return false;
        }

        Vertex other = (Vertex) obj;
        return id == other.id;
    }

    public int hashCode() {
        return Objects.hash(id);
    }

    public String toString() {
        return Integer.toString(id);
    }
}