package Trees;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {
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
    public void bfs(TreeNode root) {
        if (root == null) {
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            System.out.println(current.val);
            if (current.left != null) {
                queue.add(current.left);
            }
            if (current.right != null) {
                queue.add(current.right);
            }
        }
    }
    public List<List<TreeNode>> dfs(TreeNode root) {
        List<List<TreeNode>> result = new LinkedList<>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            List<TreeNode> level = new LinkedList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode current = queue.poll();
                level.add(current);
                if (current.left != null) {
                    queue.add(current.left);
                }
                if (current.right != null) {
                    queue.add(current.right);
                }
            }
            result.add(level);
        }
        return result;
    }
    public static void main(String[] args) {
        BFS bfs = new BFS();
        TreeNode root = bfs.new TreeNode(1);
        root.left = bfs.new TreeNode(2);
        root.right = bfs.new TreeNode(3);
        root.left.left = bfs.new TreeNode(4);
        root.left.right = bfs.new TreeNode(5);
        root.right.left = bfs.new TreeNode(6);
        root.right.right = bfs.new TreeNode(7);
        bfs.bfs(root);
    }
}
