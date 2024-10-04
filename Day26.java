import java.util.*;
/*
Detect a Cycle in an Undirected Graph

You are given an undirected graph represented by an adjacency list. Your task is to determine if the graph contains any cycle. A cycle is formed if you can traverse through a sequence of edges that starts and ends at the same vertex.

Input:
An integer V representing the number of vertices.
An integer E representing the number of edges.
A list of edges, where each edge connects two vertices of the graph.

Output:
Return true if the graph contains a cycle, otherwise return false.
 */
public class Day26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();
        int E = sc.nextInt();
        int[][] graph = new int[V][V];
        for (int i = 0; i < E; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            addEdge(graph, u, v);
        }
        System.out.println(detectCycle(graph, V));
        sc.close();
    }

    static void addEdge(int[][] graph, int u, int v) {
        graph[u][v] = 1;
        graph[v][u] = 1;
    }

    static boolean isCycle(int node, int parent, boolean[] visited, int[][] graph, int V) {
        visited[node] = true;

        for (int i = 0; i < V; i++) {
            if (graph[node][i] == 1) {
                if (!visited[i]) {
                    if (isCycle(i, node, visited, graph, V)) {
                        return true;
                    }
                } else if (i != parent) {
                    return true;
                }
            }
        }
        return false;
    }

    static boolean detectCycle(int[][] graph, int V) {
        boolean[] visited = new boolean[V];

        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                if (isCycle(i, -1, visited, graph, V)) {
                    return true;
                }
            }
        }
        return false;
    }
}
