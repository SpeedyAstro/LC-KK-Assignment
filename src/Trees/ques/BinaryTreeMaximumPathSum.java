package Trees.ques;

public class BinaryTreeMaximumPathSum {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }
    public int maxPathSum(TreeNode root) {
        if(root==null) return 0;
        if(root.left==null && root.right==null) return root.val;
        int left = maxPathSum(root.left);
        int right = maxPathSum(root.right);
        int max = Math.max(left,right);
        max = Math.max(max,root.val+left+right);
//        int max = Math.max(left,right);
//        max = Math.max(max,root.val+left+right);
        return max;
    }
}
