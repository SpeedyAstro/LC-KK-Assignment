package graph;

import java.util.List;

public class DFS {
    public static void main(String[] args) {
        int[][] graph = new int[][]{
            {0, 1, 1, 0, 0},
            {1, 0, 1, 1, 0},
            {1, 1, 0, 1, 1},
            {0, 1, 1, 0, 1},
            {0, 0, 1, 1, 0}
        };
        int start = 0;
        dfs(graph, start);
    }

    public static void dfs(int[][] graph, int start) {
        int n = graph.length;
        boolean[] visited = new boolean[n];
        dfsUtil(graph, start, visited);
    }

    public static void dfsUtil(int[][] graph, int start, boolean[] visited) {
        visited[start] = true;
        System.out.print(start + " ");
        for (int i = 0; i < graph.length; i++) {
            if (graph[start][i] == 1 && !visited[i]) {
                dfsUtil(graph, i, visited);
            }
        }
    }
    public static void dfs1(List<List<Integer>> list, int start){
        int n = list.size();
        boolean[] visited = new boolean[n];
        dfsUtil1(list, start, visited);
    }

    public static void dfsUtil1(List<List<Integer>> list, int start, boolean[] visited) {
        visited[start] = true;
        System.out.print(start + " ");
        for (int i : list.get(start)) {
            if (!visited[i]) {
                dfsUtil1(list, i, visited);
            }
        }
    }
}
