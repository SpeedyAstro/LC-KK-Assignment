package LinkedList;

public class RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode current = head;
        int length = 1;
        while (current.next != null) {
            current = current.next;
            length++;
        }
        current.next = head;
        k = k % length;
        for (int i = 0; i < length - k; i++) {
            current = current.next;
        }
        head = current.next;
        current.next = null;
        return head;
    }
}
