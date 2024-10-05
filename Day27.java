import java.util.*;
/*
Find the Shortest Path in an Unweighted Graph

You are given an unweighted graph represented by an adjacency list. Your task is to find the shortest path (in terms of the number of edges) between two given nodes in the graph.

Input:
An integer V representing the number of vertices in the graph.
A list of edges, where each edge connects two vertices of the graph.
Two integers, start and end, representing the source and destination nodes respectively.

Output:
Return the shortest path length (number of edges) from start to end. If there is no path, return -1.

Examples:
Example 1
Input: V = 5
Edges = [[0, 1], [0, 2], [1, 3], [2, 3], [3, 4]]
start = 0
end = 4
Output: 3
Explanation: 

The shortest path from node 0 to node 4 is through nodes 0 -> 2 -> 3 -> 4, which has 3 edges.
 */
public class Day27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int V = sc.nextInt();
        int E = V;

        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < E; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            addEdge(adj, u, v);
        }

        int start = sc.nextInt();
        int end = sc.nextInt();

        System.out.println(shortestPath(V, adj, start, end));
        sc.close();
    }

    static void addEdge(List<List<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    static int shortestPath(int V, List<List<Integer>> adj, int start, int end) {
        boolean[] visited = new boolean[V];
        int[] distance = new int[V];
        Queue<Integer> queue = new LinkedList<>();

        visited[start] = true;
        queue.add(start);

        while (!queue.isEmpty()) {
            int node = queue.poll();

            for (int neighbor : adj.get(node)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    distance[neighbor] = distance[node] + 1;
                    queue.add(neighbor);

                    if (neighbor == end) {
                        return distance[neighbor];
                    }
                }
            }
        }
        return -1;
    }
}
