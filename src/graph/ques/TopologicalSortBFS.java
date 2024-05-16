package graph.ques;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class TopologicalSortBFS {
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) {
        int[] inDegree = new int[V];
        for (int i = 0; i < V; i++) {
            for (int j : adj.get(i)) {
                inDegree[j]++;
            }
        }
        ArrayList<Integer> res = new ArrayList<>();
        bfs(adj, V, 0, res, inDegree);
        return res.stream().mapToInt(i -> i).toArray();
    }

    private static void bfs(ArrayList<ArrayList<Integer>> adj, int V, int v, ArrayList<Integer> res, int[] inDegree) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < V; i++) {
            if (inDegree[i] == 0) {
                queue.add(i);
            }
        }
        while (!queue.isEmpty()) {
            int node = queue.poll();
            res.add(node);
            for (int j : adj.get(node)) {
                if (--inDegree[j] == 0) {
                    queue.add(j);
                }
            }
        }
    }
}
