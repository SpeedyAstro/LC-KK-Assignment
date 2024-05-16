package graph.ques;

public class NumberofProvinces {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean[] visited = new boolean[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfsUtil(isConnected, i, visited);
                count++;
            }
        }
        return count;
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
}
