package com.example.DataBase_Accounts.SpecialClasses;

import org.jgrapht.Graph;
import org.jgrapht.alg.util.Pair;
import org.jgrapht.graph.DefaultDirectedGraph;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.traverse.DepthFirstIterator;

import java.util.*;
import java.util.concurrent.*;

public class Graphic {
    private final List<Callable<List<String>>> road = new ArrayList<>();
    private final StringBuilder Myresult = new StringBuilder();
    private final Set<String> VizNode = new HashSet<>();
    Graph<String, DefaultEdge> graph = new DefaultDirectedGraph<>(DefaultEdge.class);
    public Graphic(List<Integer> Vertex, List<Pair<Integer, Integer>> edges) {
        for (int i = 0; i < Vertex.size(); i++) {
            graph.addVertex(Vertex.get(i).toString());
        }

        for (int j = 0; j < edges.size(); j++) {
            graph.addEdge(edges.get(j).getFirst().toString(), edges.get(j).getSecond().toString());
        }

    }
    public void DFS(String node) {
        DepthFirstIterator<String, DefaultEdge> actualNode = new DepthFirstIterator<>(graph, node);
        while (actualNode.hasNext()) {
            String vertex = actualNode.next();
            System.out.println(vertex);
        }
    }
    public void StartParalelDfs(Integer threadsNumber) {
        for (String vertex : graph.vertexSet()) {road.add(() -> {
                DepthFirstIterator<String, DefaultEdge> actualNode = new DepthFirstIterator<>(graph, vertex);
                List<String> traversalResult = new ArrayList<>();
                while (actualNode.hasNext()) {
                    String v = actualNode.next();
                    if (!VizNode.contains(v)) {
                        VizNode.add(v);
                        traversalResult.add(v);
                    }
                }
                return traversalResult;
            });
        }

        ExecutorService executorService = Executors.newFixedThreadPool(threadsNumber);
        try {
            List<Future<List<String>>> nextNode = executorService.invokeAll(road);
            for (Future<List<String>> next : nextNode) {
                List<String> traversalResult = next.get();
                Myresult.append(String.join(" ", traversalResult)).append(" ");
            }
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        executorService.shutdown();

        System.out.println(Myresult.toString());
    }

}
