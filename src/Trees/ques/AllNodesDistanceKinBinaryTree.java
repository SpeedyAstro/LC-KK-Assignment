package Trees.ques;


import java.util.*;


public class AllNodesDistanceKinBinaryTree {
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
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        Map<TreeNode, TreeNode> parent = new HashMap<>();
        dfs(root, parent);
        Set<TreeNode> visited = new HashSet<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(target);
        visited.add(target);
        int level = 0;
        while(!queue.isEmpty()) {
            int size = queue.size();
            if(level==k) {
                List<Integer> result = new ArrayList<>();
                for(TreeNode node: queue) {
                    result.add(node.val);
                }
                return result;
            }
            for(int i=0; i<size; i++) {
                TreeNode current = queue.poll();
                if(current.left!=null && !visited.contains(current.left)) {
                    queue.add(current.left);
                    visited.add(current.left);
                }
                if(current.right!=null && !visited.contains(current.right)) {
                    queue.add(current.right);
                    visited.add(current.right);
                }
                if(parent.get(current)!=null && !visited.contains(parent.get(current))) {
                    queue.add(parent.get(current));
                    visited.add(parent.get(current));
                }
            }
            level++;
        }
        return new ArrayList<>();
    }
    public void dfs(TreeNode root, Map<TreeNode, TreeNode> parent) {
        if(root==null) return;
        if(root.left!=null) {
            parent.put(root.left, root);
            dfs(root.left, parent);
        }
        if(root.right!=null) {
            parent.put(root.right, root);
            dfs(root.right, parent);
        }
    }
}
