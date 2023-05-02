package org.example;

import org.graph4j.*;

public class GraphEx {
    public static void main(String[] args) {
            Graph graph = AdjacencyListGraph.create().build();


            Vertex v1 = graph.addVertex();
            Vertex v2 = graph.addVertex();
            Vertex v3 = graph.addVertex();
            Vertex v4 = graph.addVertex();
            Vertex v5 = graph.addVertex();
            Vertex v6 = graph.addVertex();

            graph.addEdge(v1, v2);
            graph.addEdge(v1, v3);
            graph.addEdge(v2, v4);
            graph.addEdge(v3, v4);
            graph.addEdge(v3, v5);
            graph.addEdge(v4, v6);
        }
}
