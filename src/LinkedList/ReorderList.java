package LinkedList;

public class ReorderList {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }
        ListNode middle = getMiddle(head);
        ListNode nextOfMiddle = middle.next;
        middle.next = null;
        ListNode left = head;
        ListNode right = reverse(nextOfMiddle);
        merge(left, right);
    }

    private ListNode reverse(ListNode nextOfMiddle) {
        return null;
    }

    private ListNode getMiddle(ListNode head) {
        return null;
    }

    private void merge(ListNode left, ListNode right) {
        while (right != null) {
            ListNode temp = left.next;
            left.next = right;
            right = right.next;
            left.next.next = temp;
            left = temp;
        }
    }
}
