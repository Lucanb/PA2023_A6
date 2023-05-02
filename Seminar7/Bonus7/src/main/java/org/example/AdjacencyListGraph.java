package org.example;

import org.graph4j.*;
import org.graph4j.util.EdgeSet;
import org.graph4j.util.VertexSet;

import java.util.*;

public class AdjacencyListGraph implements Graph {
    private Map<Vertex, Set<Edge>> adjacencyList;

    public AdjacencyListGraph() {
        this.adjacencyList = new HashMap<>();
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void setName(String s) {

    }

    @Override
    public int numVertices() {
        return 0;
    }

    @Override
    public long numEdges() {
        return 0;
    }

    @Override
    public long maxEdges() {
        return 0;
    }

    @Override
    public int[] vertices() {
        return new int[0];
    }

    @Override
    public boolean isComplete() {
        return false;
    }

    @Override
    public int vertexAt(int i) {
        return 0;
    }

    @Override
    public VertexIterator vertexIterator() {
        return null;
    }

    @Override
    public int indexOf(int i) {
        return 0;
    }

    @Override
    public Edge[] edges() {
        return new Edge[0];
    }

    @Override
    public Edge[] edgesOf(int i) {
        return new Edge[0];
    }

    @Override
    public EdgeIterator edgeIterator() {
        return null;
    }

    @Override
    public Edge edge(int i, int i1) {
        return null;
    }

    @Override
    public boolean containsEdge(int i, int i1) {
        return false;
    }

    @Override
    public int[] neighbors(int i) {
        return new int[0];
    }

    @Override
    public NeighborIterator neighborIterator(int i, int i1) {
        return null;
    }

    @Override
    public int adjListPos(int i, int i1) {
        return 0;
    }

    @Override
    public int degree(int i) {
        return 0;
    }

    @Override
    public int[] degrees() {
        return new int[0];
    }

    @Override
    public int addEdge(int i, int i1) {
        return 0;
    }

    @Override
    public int addEdge(int i, int i1, double v, Object o) {
        return 0;
    }

    @Override
    public int addEdge(Edge edge) {
        return 0;
    }

    @Override
    public void removeEdge(int i, int i1) {

    }

    @Override
    public void removeAllEdges(int i) {

    }

    public Vertex addVertex() {
        Vertex v = new Vertex();
        adjacencyList.put(v, new HashSet<>());
        return v;
    }

    @Override
    public int addVertex(int i) {
        return 0;
    }

    @Override
    public void removeVertex(int i) {

    }

    @Override
    public int duplicateVertex(int i) {
        return 0;
    }

    @Override
    public int contractVertices(int... ints) {
        return 0;
    }

    @Override
    public int maxVertexNumber() {
        return 0;
    }

    @Override
    public int splitEdge(int i, int i1) {
        return 0;
    }

    @Override
    public void renumberAdding(int i) {

    }

    @Override
    public Graph copy() {
        return null;
    }

    @Override
    public Graph copy(boolean b, boolean b1, boolean b2, boolean b3, boolean b4) {
        return null;
    }

    @Override
    public Graph subgraph(int... ints) {
        return null;
    }

    @Override
    public Graph subgraph(EdgeSet edgeSet) {
        return null;
    }

    @Override
    public Graph complement() {
        return null;
    }

    @Override
    public int[][] adjacencyMatrix() {
        return new int[0][];
    }

    @Override
    public double[][] costMatrix() {
        return new double[0][];
    }

    @Override
    public int[][] incidenceMatrix() {
        return new int[0][];
    }

    @Override
    public boolean isDirected() {
        return false;
    }

    @Override
    public boolean isAllowingMultipleEdges() {
        return false;
    }

    @Override
    public boolean isAllowingSelfLoops() {
        return false;
    }

    @Override
    public void setSafeMode(boolean b) {

    }

    @Override
    public boolean isSafeMode() {
        return false;
    }

    public void removeVertex(Vertex v) {
        for (Vertex neighbor : getNeighbors(v)) {
            removeEdge(v, neighbor);
        }
        adjacencyList.remove(v);
    }

    public Set<Vertex> getVertices() {
        return adjacencyList.keySet();
    }

    public Edge addEdge(Vertex v1, Vertex v2) {
        Edge e = new Edge(v1.getId(), v2.getId());
        adjacencyList.get(v1).add(e);
        adjacencyList.get(v2).add(e);
        return e;
    }

    public void removeEdge(Vertex v1, Vertex v2) {
        Set<Edge> edges1 = adjacencyList.get(v1);
        Set<Edge> edges2 = adjacencyList.get(v2);

        Iterator<Edge> it1 = edges1.iterator();
        while (it1.hasNext()) {
            Edge e = it1.next();
            if (e.clone(v1, v2)) {
                it1.remove();
                edges2.remove(e);
                return;
            }
        }
    }

    public Set<Edge> getEdges(Vertex v) {
        return adjacencyList.getOrDefault(v, Collections.emptySet());
    }

    public Set<Vertex> getNeighbors(Vertex v) {
        Set<Vertex> neighbors = new HashSet<>();
        for (Edge e : getEdges(v)) {
            neighbors.add(e.getOppositeVertex(v));
        }
        return neighbors;
    }

    @Override
    public int addVertex(int i, Object o) {
        return 0;
    }

    @Override
    public int addVertex(Object o) {
        return 0;
    }

    @Override
    public int addEdge(int i, int i1, Object o) {
        return 0;
    }

    @Override
    public void setVertexLabel(int i, Object o) {

    }

    @Override
    public Object getVertexLabel(int i) {
        return null;
    }

    @Override
    public void setEdgeLabel(int i, int i1, Object o) {

    }

    @Override
    public Object getEdgeLabel(int i, int i1) {
        return null;
    }

    @Override
    public boolean isEdgeLabeled() {
        return false;
    }

    @Override
    public boolean isVertexLabeled() {
        return false;
    }

    @Override
    public int findVertex(Object o) {
        return 0;
    }

    @Override
    public VertexSet findAllVertices(Object o) {
        return null;
    }

    @Override
    public Edge findEdge(Object o) {
        return null;
    }

    @Override
    public EdgeSet findAllEdges(Object o) {
        return null;
    }

    @Override
    public int addVertex(int i, double v) {
        return 0;
    }

    @Override
    public int addVertex(double v) {
        return 0;
    }

    @Override
    public int addEdge(int i, int i1, double v) {
        return 0;
    }

    @Override
    public void setVertexWeight(int i, double v) {

    }

    @Override
    public double getVertexWeight(int i) {
        return 0;
    }

    @Override
    public void setEdgeWeight(int i, int i1, double v) {

    }

    @Override
    public double getEdgeWeight(int i, int i1) {
        return 0;
    }

    @Override
    public boolean isEdgeWeighted() {
        return false;
    }

    @Override
    public boolean isVertexWeighted() {
        return false;
    }
}