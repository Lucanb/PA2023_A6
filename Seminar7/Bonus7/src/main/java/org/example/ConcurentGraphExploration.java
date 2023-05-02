package org.example;

import java.util.*;
import java.util.concurrent.*;
import org.graph4j.*;

public class ConcurrentGraphExploration {
    private Graph graph;
    private Set<Vertex> visited;

    public ConcurrentGraphExploration(Graph graph) {
        this.graph = graph;
        this.visited = new HashSet<>();
    }

    public void explore() {
        ExecutorService executor = Executors.newFixedThreadPool(graph.getVertexCount());

        for (Vertex v : graph.get ) {
            executor.execute(new Explorer(v));
        }

        executor.shutdown();

        try {
            executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private class Explorer implements Runnable {
        private Vertex startVertex;

        public Explorer(Vertex startVertex) {
            this.startVertex = startVertex;
        }

        @Override
        public void run() {
            Stack<Vertex> stack = new Stack<>();
            stack.push(startVertex);

            while (!stack.empty()) {
                Vertex v = stack.pop();

                if (!visited.contains(v)) {
                    visited.add(v);

                    // Explore neighbors
                    for (Edge e : graph.getEdges(v)) {
                        Vertex neighbor = e.getOppositeVertex(v);
                        stack.push(neighbor);
                    }
                }
            }
        }
    }
}
