package Trees.ques;

public class LinkedListinBinaryTree {
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
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }
    boolean found = false;
    public boolean isSubPath(ListNode head, TreeNode root) {
        return search(head, root,false);
    }

    private boolean search(ListNode head, TreeNode root, boolean onPath) {
        if(head==null || found) {
            found = true;
            return true;
        }
        if(root==null) return false;
        if (head.val==root.val && (search(head.next, root.left, true) || search(head.next, root.right, true))) {
            return true;
        }
        if (!onPath) {
            return search(head, root.left, false) || search(head, root.right, false);
        }
        return false;
    }


    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }


}
