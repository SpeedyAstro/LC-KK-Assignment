package Trees;

public class DFS {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }
    public void dfs(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.println(root.val);
        dfs(root.left);
        dfs(root.right);
    }
    public static void main(String[] args) {
        DFS dfs = new DFS();
        TreeNode root = dfs.new TreeNode(1);
        root.left = dfs.new TreeNode(2);
        root.right = dfs.new TreeNode(3);
        root.left.left = dfs.new TreeNode(4);
        root.left.right = dfs.new TreeNode(5);
        root.right.left = dfs.new TreeNode(6);
        root.right.right = dfs.new TreeNode(7);
        dfs.dfs(root);
    }
}
