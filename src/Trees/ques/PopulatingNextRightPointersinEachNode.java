package Trees.ques;

import java.util.LinkedList;
import java.util.Queue;

public class PopulatingNextRightPointersinEachNode {
public class Node {
        int val;
        Node left;
        Node right;
        Node next;
        Node(int val) {
            this.val = val;
            this.left = null;
            this.right = null;;
            this.next = null;
        }
    }

    public Node connect(Node root) {
        if(root==null) return root;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            Node prev = null;
            for(int i = 0 ; i < size ; i++){
                Node curr = queue.poll();
                if(prev!=null){
                    prev.next = curr;
                }
                if(curr.left!=null) queue.add(curr.left);
                if(curr.right!=null) queue.add(curr.right);
                prev = curr;
            }
        }
        return root;
    }
}
