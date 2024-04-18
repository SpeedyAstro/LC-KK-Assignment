package Trees.ques;

public class BalancedBinaryTree {
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
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        return Math.abs(height(root.left)-height(root.right))<=1 && isBalanced(root.left) && isBalanced(root.right);
    }

    private int height(TreeNode left) {
        if(left==null) return 0;
        return Math.max(height(left.left), height(left.right))+1;
    }
}
