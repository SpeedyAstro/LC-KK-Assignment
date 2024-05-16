package graph.ques;

public class DetectCycle {
    public boolean isCycle(int[][] graph) {
        int n = graph.length;
        boolean[] visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                if (isCycleUtil(graph, i, visited, -1)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean isCycleUtil(int[][] graph, int i, boolean[] visited, int parent) {
        visited[i] = true;
        for (int j = 0; j < graph.length; j++) {
            if (graph[i][j] == 1) {
                if (!visited[j]) {
                    if (isCycleUtil(graph, j, visited, i)) {
                        return true;
                    }
                } else if (j != parent) {
                    return true;
                }
            }
        }
        return false;
    }

}
