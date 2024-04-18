package Trees.ques;

import java.util.Deque;
import java.util.LinkedList;

public class SymmetricTree {
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

    public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
        Deque<TreeNode> queue = new LinkedList<>();
        queue.add(root.left);
        queue.add(root.right);
        while(!queue.isEmpty()){
            TreeNode left = queue.removeFirst();
            TreeNode right = queue.removeLast();
            if(left==null && right==null) continue;
            if(left==null || right==null) return false;
            if(left.val!=right.val) return false;
            queue.addFirst(left.right);
            queue.addFirst(left.left);
            queue.addLast(right.left);
            queue.addLast(right.right);
        }
        return true;
    }
}
