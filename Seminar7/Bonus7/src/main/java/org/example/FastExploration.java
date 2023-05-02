package org.example;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import org.graph4j.Edge;
import org.graph4j.Graph;
import org.graph4j.GraphBuilder;

public class FastExploration {
    private AdjacencyListGraph graph;
    private ConcurrentMap<Vertex, Set<Integer>> visited;

    public FastExploration(GraphBuilder builder) {
        this.graph = builder.buildGraph();
        this.visited = new ConcurrentHashMap<>();
    }

    public void explore() {
        ExecutorService executor = Executors.newFixedThreadPool(graph.numVertices());

        for (Vertex v : graph.getVertex()) {
            executor.execute(new Explorer(v));
        }
        //Do the upper thing




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

                Set<Integer> visitedByOtherAgents = visited.getOrDefault(v, new HashSet<>());
                visitedByOtherAgents.add(Thread.currentThread().hashCode());
                visited.put(v, visitedByOtherAgents);

                if (visitedByOtherAgents.size() == Thread.activeCount()) {
                    // All agents have visited this vertex, continue exploration
                    if (!visited.containsKey(v)) {
                        visited.put(v, new HashSet<>());
                    }

                    if (!visited.get(v).contains(Thread.currentThread().hashCode())) {
                        visited.get(v).add(Thread.currentThread().hashCode());
                    }

                    // Explore neighbors
                    for (Edge e : graph.getEdges(v)) {
                        Vertex neighbor = e.getOppositeVertex(v);

                        if (!visited.containsKey(neighbor) || !visited.get(neighbor).contains(Thread.currentThread().hashCode())) {
                            stack.push(neighbor);
                        }
                    }
                }
            }
        }
    }
}