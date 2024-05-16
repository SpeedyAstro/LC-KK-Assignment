package graph.ques;

public class NumberofIslands {
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        boolean[][] visited = new boolean[n][m];
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++){
                if (grid[i][j] == '1' && !visited[i][j]){
                    bfsUtil(grid, i, j, visited);
                    count++;
                }
            }
        }
        return count;
    }

    private void bfsUtil(char[][] grid, int i, int j, boolean[][] visited) {
        int[] x = {1, -1, 0, 0};
        int[] y = {0, 0, 1, -1};
        visited[i][j] = true;
        for (int k = 0; k < 4; k++) {
            int newI = i + x[k];
            int newJ = j + y[k];
            if (newI >= 0 && newI < grid.length && newJ >= 0 && newJ < grid[0].length && grid[newI][newJ] == '1' && !visited[newI][newJ]) {
                bfsUtil(grid, newI, newJ, visited);
            }
        }
    }

    private void dfsUtil(char[][] grid, int i, int j, boolean[][] visited) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || visited[i][j] || grid[i][j] == '0') {
            return;
        }
        visited[i][j] = true;
        dfsUtil(grid, i + 1, j, visited);
        dfsUtil(grid, i - 1, j, visited);
        dfsUtil(grid, i, j + 1, visited);
        dfsUtil(grid, i, j - 1, visited);
    }
}
