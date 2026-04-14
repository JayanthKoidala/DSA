// Problem  : Possible Bipartition
// Difficulty: Medium
// Tags     : Depth-First Search, Breadth-First Search, Union-Find, Graph Theory
// URL      : https://leetcode.com/problems/possible-bipartition/
// Solved on: 2026-04-14 22:25
// ──────────────────────────────────────────────────

class Solution {
    public boolean possibleBipartition(int n, int[][] dislikes) {
        // Step 1: Build adjacency list
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] d : dislikes) {
            int a = d[0];
            int b = d[1];
            graph.get(a).add(b);
            graph.get(b).add(a); // undirected graph
        }

        // Step 2: Colors array
        int[] color = new int[n + 1];
        Arrays.fill(color, -1);

        // Step 3: BFS for each component
        for (int i = 1; i <= n; i++) {
            if (color[i] == -1) {
                if (!bfs(i, graph, color)) return false;
            }
        }

        return true;
    }

    private boolean bfs(int start, List<List<Integer>> graph, int[] color) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);
        color[start] = 0;  // any color (0/1)

        while (!q.isEmpty()) {
            int node = q.poll();

            for (int neigh : graph.get(node)) {
                if (color[neigh] == -1) {
                    color[neigh] = 1 - color[node];  // opposite color
                    q.offer(neigh);
                } else if (color[neigh] == color[node]) {
                    return false; // conflict → not bipartite
                }
            }
        }

        return true;
    }
}
