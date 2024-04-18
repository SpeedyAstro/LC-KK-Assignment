package Trees;

public class LevelAndNodes {
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
    TreeNode findNode(TreeNode root, int node) {
        if(root==null) return null;
        if(root.val==node) return root;
        TreeNode left = findNode(root.left, node);
        TreeNode right = findNode(root.right, node);
        return left!=null ? left : right;
    }
    int findLevel(TreeNode root, int node, int level) {
        if(root==null) return 0;
        if(root.val==node) return level;
        int left = findLevel(root.left, node, level+1);
        int right = findLevel(root.right, node, level+1);
        return left!=0 ? left : right;
    }
    boolean isSibling(TreeNode root, int node1, int node2) {
        if(root==null) return false;
        if(root.left!=null && root.right!=null) {
            if((root.left.val==node1 && root.right.val==node2) || (root.left.val==node2 && root.right.val==node1)) return true;
        }
        return isSibling(root.left, node1, node2) || isSibling(root.right, node1, node2);
    }
    TreeNode findNode(TreeNode root, int level, int node) {
        if(root==null) return null;
        if(level==1 && root.val==node) return root;
        TreeNode left = findNode(root.left, level-1, node);
        TreeNode right = findNode(root.right, level-1, node);
        return left!=null ? left : right;
    }
//    Useful methods for tree traversal

    public void preOrder(TreeNode root) {
          if(root==null) return;
            System.out.print(root.val+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
    public void inOrder(TreeNode root) {
        if(root==null) return;
        inOrder(root.left);
        System.out.print(root.val+" ");
        inOrder(root.right);
    }
    public void postOrder(TreeNode root) {
        if(root==null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val+" ");
    }
    public void levelOrder(TreeNode root) {
        int h = height(root);
        for(int i=1; i<=h; i++) {
            printLevel(root, i);
        }
    }
    public int height(TreeNode root) {
        if(root==null) return 0;
        int left = height(root.left);
        int right = height(root.right);
        return 1+Math.max(left, right);
    }
    public void printLevel(TreeNode root, int level) {
        if(root==null) return;
        if(level==1) System.out.print(root.val+" ");
        else if(level>1) {
            printLevel(root.left, level-1);
            printLevel(root.right, level-1);
        }
    }

//    search node in left subtree only
    public TreeNode searchNode(TreeNode root, int node) {
        if(root==null) return null;
        if(root.val==node) return root;
        TreeNode left = searchNode(root.left, node);
        return left;
    }

}
