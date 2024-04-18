package Trees.ques;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderSuccorOfANode {
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
    public TreeNode levelOrderSuccessor(TreeNode root, TreeNode key) {
        if (root == null) return null;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode current = queue.poll();
            if (current.left != null) {
                queue.add(current.left);
            }
            if (current.right != null) {
                queue.add(current.right);
            }
            if (current == key) {
                break;
            }
        }
        return queue.peek();
    }
    public static void main(String[] args) {
        LevelOrderSuccorOfANode levelOrderSuccorOfANode = new LevelOrderSuccorOfANode();
        TreeNode root = levelOrderSuccorOfANode.new TreeNode(1);
        root.left = levelOrderSuccorOfANode.new TreeNode(2);
        root.right = levelOrderSuccorOfANode.new TreeNode(3);
        root.left.left = levelOrderSuccorOfANode.new TreeNode(4);
        root.left.right = levelOrderSuccorOfANode.new TreeNode(5);
        root.right.left = levelOrderSuccorOfANode.new TreeNode(6);
        root.right.right = levelOrderSuccorOfANode.new TreeNode(7);
        System.out.println(levelOrderSuccorOfANode.levelOrderSuccessor(root, root.left).val);
    }
}
