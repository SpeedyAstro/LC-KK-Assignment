package Trees.ques;

public class ValidateBinaryTreeNodes {
    public boolean validateBinaryTreeNodes(int n, int[] leftChild, int[] rightChild) {
        int[] indegree = new int[n];
        for (int i = 0; i < n; i++) {
            if (leftChild[i] != -1) {
                indegree[leftChild[i]]++;
            }
            if (rightChild[i] != -1) {
                indegree[rightChild[i]]++;
            }
        }
        int root = -1;
        for (int i = 0; i < n; i++) {
            if (indegree[i] == 0) {
                if (root != -1) {
                    return false;
                }
                root = i;
            }
        }
        if (root == -1) {
            return false;
        }
        boolean[] visited = new boolean[n];
        return dfs(root, leftChild, rightChild, visited) == n;
    }

    private int dfs(int root, int[] leftChild, int[] rightChild, boolean[] visited) {
        if (root == -1 || visited[root]) {
            return 0;
        }
        visited[root] = true;
        return 1 + dfs(leftChild[root], leftChild, rightChild, visited) + dfs(rightChild[root], leftChild, rightChild, visited);
    }
}
