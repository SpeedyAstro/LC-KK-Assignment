package Trees.ques;

import java.util.*;

public class AmountofTimeforBinaryTreetoBeInfected {
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
    public int amountOfTime(TreeNode root, int start) {
        Map<TreeNode, TreeNode> parent = new HashMap<>();
        dfs(root, parent);
        TreeNode startNode = findInfectedNode(root, start);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(startNode);
        Set<TreeNode> visited = new HashSet<>();
        visited.add(startNode);
        int time = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode current = queue.poll();
                if (current.left != null && !visited.contains(current.left)) {
                    queue.add(current.left);
                    visited.add(current.left);
                }
                if (current.right != null && !visited.contains(current.right)) {
                    queue.add(current.right);
                    visited.add(current.right);
                }
                if (parent.get(current) != null && !visited.contains(parent.get(current))) {
                    queue.add(parent.get(current));
                    visited.add(parent.get(current));
                }
            }
            time++;
        }
        return time;

    }

    private void dfs(TreeNode root, Map<TreeNode, TreeNode> parent) {
        if (root == null) return;
        if (root.left != null) {
            parent.put(root.left, root);
            dfs(root.left, parent);
        }
        if (root.right != null) {
            parent.put(root.right, root);
            dfs(root.right, parent);
        }
    }

    private TreeNode findInfectedNode(TreeNode root, int start) {
        if (root == null) return null;
        if (root.val == start) return root;
        TreeNode left = findInfectedNode(root.left, start);
        TreeNode right = findInfectedNode(root.right, start);
        return left != null ? left : right;
    }
}
