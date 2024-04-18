package Trees.ques;

import java.util.LinkedList;
import java.util.Queue;

public class EvenOddTree {
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

    public boolean isEvenOddTree(TreeNode root) {
        if(root==null) return false;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int count = 0;
        while(!queue.isEmpty()){
            // List<Integer> list = new LinkedList<>();
            int size = queue.size();
            // int[] list = new int[size];
            TreeNode prev = null;
            for(int i = 0 ; i < size ; i++){
                TreeNode curr = queue.poll();
                if(count%2==0){
                    if((curr.val%2==0)|| (prev!=null && (prev.val>=curr.val))) return false;
                    // if((prev!=null) && (curr.val%2==0 || (prev.val>=curr.val))) return false;
                }else{
                    if((curr.val%2!=0) || (prev!=null && (prev.val<=curr.val))) return false;
                    // if((prev!=null) && (curr.val%2!=0 || (prev.val<=curr.val))) return false;
                }
                if(curr.left!=null) queue.add(curr.left);
                if(curr.right!=null) queue.add(curr.right);
                prev = curr;
            }
            count++;
        }
        return true;
    }
}
