package classes;

import utils.Node;

import java.util.*;

public class Network {
    List<Node> nodes = new ArrayList<>();

    public void addNode(Node node){
        nodes.add(node);
    }

    public List<Node> getNodes() {
        return this.nodes;
    }

    public void printNodes(){
        this.nodes.sort(new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
                return Integer.compare(o1.getImportance(), o2.getImportance());
            }
        });
        for (Node node : nodes) {
            System.out.println(node.getName() + " " + node.getImportance());
        }
    }

    public Set<String> findArticulationPoints() {
        Set<String> articulationPoints = new HashSet<>();
        int n = nodes.size();
        boolean[] visited = new boolean[n];
        int[] depth = new int[n];
        int[] low = new int[n];
        int[] parent = new int[n];

        // initialize arrays
        Arrays.fill(visited, false);
        Arrays.fill(depth, -1);
        Arrays.fill(low, -1);
        Arrays.fill(parent, -1);

        // perform depth-first search from each node
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(i, visited, depth, low, parent, articulationPoints);
            }
        }

        return articulationPoints;
    }

    private void dfs(int u, boolean[] visited, int[] depth, int[] low, int[] parent, Set<String> articulationPoints) {
        visited[u] = true;
        depth[u] = low[u] = 0;
        int children = 0;
        boolean isArticulation = false;

        for (int i = 0; i < nodes.size(); i++) {
            Node v = nodes.get(i);

            if (!visited[i] && isConnected(u, v)) {
                children++;
                parent[i] = u;
                dfs(i, visited, depth, low, parent, articulationPoints);

                low[u] = Math.min(low[u], low[i]);

                // check if u is an articulation point
                if (parent[u] == -1 && children > 1 || parent[u] != -1 && low[i] >= depth[u]) {
                    isArticulation = true;
                }
            } else if (parent[u] != i) {
                low[u] = Math.min(low[u], depth[i]);
            }
        }

        System.out.println(nodes.get(u).getName());
        if (isArticulation) {
            articulationPoints.add(nodes.get(u).getName());
        }
    }

    private boolean isConnected(int u, Node v) {
        return nodes.get(u).hasRelation(v.getName()) || v.hasRelation(nodes.get(u).getName());
    }


    @Override
    public String toString() {
        return "Network{" +
                "nodes=" + nodes +
                '}';
    }
}
