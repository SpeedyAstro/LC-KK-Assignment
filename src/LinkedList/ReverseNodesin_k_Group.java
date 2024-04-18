package LinkedList;

public class ReverseNodesin_k_Group {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode current = head;
        ListNode next = null;
        int length = 0;
        while (head != null) {
            length++;
            head = head.next;
        }
        for (int i = 0; i < length / k; i++) {
            for (int j = 0; j < k - 1; j++) {
                next = current.next;
                current.next = next.next;
                next.next = prev.next;
                prev.next = next;
            }
            prev = current;
            current = prev.next;

        }
        return dummy.next;
    }
//    through recursion now
    public ListNode reverseKGroupRec(ListNode head, int k) {
        ListNode current = head;
        int count = 0;
        while (current != null && count != k) {
            current = current.next;
            count++;
        }
        if (count == k) {
            current = reverseKGroupRec(current, k);
            while (count-- > 0) {
                ListNode temp = head.next;
                head.next = current;
                current = head;
                head = temp;
            }
            head = current;
        }
        return head;
    }
}
