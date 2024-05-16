package graph.ques;

import java.util.ArrayList;
import java.util.Stack;

public class TopologicalSort {
    public static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] visited = new boolean[V];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                dfs(i, adj, visited, stack);
            }
        }
        int[] res = new int[V];
        int i = 0;
        while (!stack.isEmpty()) {
            res[i++] = stack.pop();
        }
        return res;
    }

    private static void dfs(int i, ArrayList<ArrayList<Integer>> adj, boolean[] visited, Stack<Integer> stack) {
        visited[i] = true;
        for (int j : adj.get(i)) {
            if (!visited[j]) {
                dfs(j, adj, visited, stack);
            }
        }
        stack.push(i);
    }
}
