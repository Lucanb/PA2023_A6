package org.example;

import org.graph4j.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Graph graph = new GraphBuilder()
                .addVertex()
                .addVertex()
                .addVertex()
                .addVertex()
                .addVertex()
                .addVertex()
                .addEdge(0, 1)
                .addEdge(0, 2)
                .addEdge(1, 3)
                .addEdge(2, 3)
                .addEdge(2, 4)
                .addEdge(3, 5)
                .build();

        ConcurrentGraphExploration explorer = new ConcurrentGraphExploration(graph);
        explorer.explore();
    }
}