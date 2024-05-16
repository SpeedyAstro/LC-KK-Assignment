package graph;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {
    public static void main(String[] args) {
        int[][] graph = new int[][]{
            {0, 1, 1, 0, 0},
            {1, 0, 1, 1, 0},
            {1, 1, 0, 1, 1},
            {0, 1, 1, 0, 1},
            {0, 0, 1, 1, 0}
        };
        int start = 0;
        bfs(graph, start);
    }


    public static void bfs(int[][] graph, int start) {
        int n = graph.length;
        boolean[] visited = new boolean[n];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;
        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.print(node + " ");
            for (int i = 0; i < n; i++) {
                if (graph[node][i] == 1 && !visited[i]) {
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }
    }
    public static void bfs1(List<List<Integer>> list,int start){
        int n = list.size();
        boolean[] visited = new boolean[n];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;
        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.print(node + " ");
            for (int i : list.get(node)) {
                if (!visited[i]) {
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }
    }
}
