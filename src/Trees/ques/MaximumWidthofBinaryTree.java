package Trees.ques;
import java.util.Deque;

public class MaximumWidthofBinaryTree {
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
    public int widthOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        Deque<Pair> queue = new java.util.LinkedList<>();
        queue.add(new Pair(root, 0));
        int maxWidth = 0;
        while(!queue.isEmpty()){
            int size = queue.size();
            maxWidth = Math.max(maxWidth,queue.peekLast().index - queue.peekFirst().index + 1);
            for (int i = 0 ; i < size; i++) {
                Pair current = queue.poll();
                if (current.node.left!=null) queue.add(new Pair(current.node.left, current.index*2));
                if (current.node.right!=null) queue.add(new Pair(current.node.right, current.index*2+1));
            }
        }
        return maxWidth;
    }

    static class Pair {
        TreeNode node;
        int index;
        Pair(TreeNode node, int index) {
            this.node = node;
            this.index = index;
        }
    }
}
