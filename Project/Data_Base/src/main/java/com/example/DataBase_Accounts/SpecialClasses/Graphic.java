package com.example.DataBase_Accounts.SpecialClasses;

import org.jgrapht.Graph;
import org.jgrapht.alg.util.Pair;
import org.jgrapht.graph.DefaultDirectedGraph;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.traverse.DepthFirstIterator;

import java.util.*;
import java.util.concurrent.*;

public class Graphic {
    private final List<Callable<List<String>>> tasks = new ArrayList<>();
    Graph<String, DefaultEdge> graph = new DefaultDirectedGraph<>(DefaultEdge.class);
    private final StringBuilder result = new StringBuilder();
    private final Set<String> visitedNodes = new HashSet<>();
    public Graphic(List<Integer> Vertex, List<Pair<Integer, Integer>> edges) {
        for (int i = 0; i < Vertex.size(); i++) {
            graph.addVertex(Vertex.get(i).toString());
        }
        for (int j = 0; j < edges.size(); j++) {
            graph.addEdge(edges.get(j).getFirst().toString(), edges.get(j).getSecond().toString());
        }

    }

    public void DFS(String node) {
        DepthFirstIterator<String, DefaultEdge> dfsIterator = new DepthFirstIterator<>(graph, node);
        while (dfsIterator.hasNext()) {
            String vertex = dfsIterator.next();
            System.out.println(vertex);
        }
    }

    public void StartParalelDfs(Integer threadsNumber) {
        for (String vertex : graph.vertexSet()) {
            tasks.add(() -> {
                DepthFirstIterator<String, DefaultEdge> dfsIterator = new DepthFirstIterator<>(graph, vertex);
                List<String> traversalResult = new ArrayList<>();
                while (dfsIterator.hasNext()) {
                    String v = dfsIterator.next();
                    if (!visitedNodes.contains(v)) {
                        visitedNodes.add(v);
                        traversalResult.add(v);
                    }
                }
                return traversalResult;
            });
        }

        ExecutorService executorService = Executors.newFixedThreadPool(threadsNumber);
        try {
            List<Future<List<String>>> futures = executorService.invokeAll(tasks);
            for (Future<List<String>> future : futures) {
                List<String> traversalResult = future.get();
                result.append(String.join(" ", traversalResult)).append(" ");
            }
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        executorService.shutdown();

        System.out.println(result.toString());
    }

}
