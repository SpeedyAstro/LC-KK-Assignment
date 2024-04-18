package LinkedList;

public class SwappingNodesinaLinkedList {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = head;
        ListNode curr = head;
        ListNode left = null;
        for (int i = 1 ; i < k ; i++){
            curr = curr.next;
        }
        left = curr;
        while (curr.next!=null){
            prev = prev.next;
            curr = curr.next;
        }
        int temp = left.val;
        left.val = prev.val;
        prev.val = temp;
        return dummy.next;
    }
}
