package Trees.ques;

public class CousinsinBinaryTree {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }
    public boolean isCousins(TreeNode root, int x, int y) {
        if(root==null) return false;
        if(root.val==x || root.val==y) return false;
        return isCousins(root, x, y, 0, root);
    }
    public boolean isCousins(TreeNode root, int x, int y, int level, TreeNode parent) {
        if(root==null) return false;
        if(root.val==x || root.val==y) return true;
        if(root.left!=null && root.right!=null) {
            if((root.left.val==x && root.right.val==y) || (root.left.val==y && root.right.val==x)) return false;
        }
        return isCousins(root.left, x, y, level+1, root) || isCousins(root.right, x, y, level+1, root);
    }

}
