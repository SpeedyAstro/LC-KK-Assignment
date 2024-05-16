package graph.ques;

public class DetectCyclesDirected {
    public boolean isCycle(int[][] graph) {
        int n = graph.length;
        boolean[] visited = new boolean[n];
        boolean[] recStack = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                if (isCycleUtil(graph, i, visited, recStack)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean isCycleUtil(int[][] graph, int i, boolean[] visited, boolean[] recStack) {
        visited[i] = true;
        recStack[i] = true;
        for (int j = 0; j < graph.length; j++) {
            if (graph[i][j] == 1) {
                if (!visited[j]) {
                    if (isCycleUtil(graph, j, visited, recStack)) {
                        return true;
                    }
                } else if (recStack[j]) {
                    return true;
                }
            }
        }
        recStack[i] = false;
        return false;
    }

    public static void main(String[] args) {
        DetectCyclesDirected detectCyclesDirected = new DetectCyclesDirected();
        int[][] graph = {{0, 1, 0, 0},
                {0, 0, 1, 0},
                {0, 0, 0, 1},
                {1, 0, 0, 0}};
        System.out.println(detectCyclesDirected.isCycle(graph));
    }
}
