package dsa.treesgraph.graph;

import java.util.*;

public class DijkstraAlgorithm {

    static class Pair {
        int node, distance;

        Pair(int node, int distance) {
            this.node = node;
            this.distance = distance;
        }
    }

    public static int[] dijkstra(int vertices, int[][] edges, int source) {
        List<List<Pair>> adj = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            adj.get(edge[0]).add(new Pair(edge[1], edge[2]));
            adj.get(edge[1]).add(new Pair(edge[0], edge[2]));
        }

        int[] dist = new int[vertices];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[source] = 0;

        PriorityQueue<Pair> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a.distance));
        pq.offer(new Pair(source, 0));

        while (!pq.isEmpty()) {
            Pair current = pq.poll();
            int node = current.node;

            for (Pair neighbor : adj.get(node)) {
                int newDist = dist[node] + neighbor.distance;
                if (newDist < dist[neighbor.node]) {
                    dist[neighbor.node] = newDist;
                    pq.offer(new Pair(neighbor.node, newDist));
                }
            }
        }

        return dist;
    }

    public static void main(String[] args) {
        int vertices = 5;
        int[][] edges = {
                {0,1,4},
                {0,2,1},
                {2,1,2},
                {1,3,1},
                {2,3,5},
                {3,4,3}
        };

        int[] result = dijkstra(vertices, edges, 0);
        for (int d : result) {
            System.out.print(d + " ");
        }
    }
}

