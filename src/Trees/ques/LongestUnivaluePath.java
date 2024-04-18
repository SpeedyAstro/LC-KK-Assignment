package Trees.ques;

import java.util.HashMap;
import java.util.Map;

public class LongestUnivaluePath {
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
    public int longestUnivaluePath(TreeNode root) {
        if (root.left == null && root.right == null) return 0;
        if(root==null) return 0;
        Map<TreeNode,Integer> parent = new HashMap<>();
        dfs(root);
        int max = 0;
        for(TreeNode node: parent.keySet()){
            max = Math.max(max, parent.get(node));
        }
        return max;

    }
    public int dfs(TreeNode root){
        if(root==null) return 0;
        int left = dfs(root.left);
        int right = dfs(root.right);
        System.out.println("root: "+root.val+" left: "+left+" right: "+right);

        return Math.max(left, right);
    }
}
