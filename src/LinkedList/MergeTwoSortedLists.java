package LinkedList;

public class MergeTwoSortedLists {
//    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//        ListNode dummy = new ListNode(-1);
//        ListNode current = dummy;
//        while (list1 != null && list2 != null) {
//            if (list1.val < list2.val) {
//                current.next = list1;
//                list1 = list1.next;
//            } else {
//                current.next = list2;
//                list2 = list2.next;
//            }
//            current = current.next;
//        }
//        if (list1 != null) {
//            current.next = list1;
//        }
//        if (list2 != null) {
//            current.next = list2;
//        }
//        return dummy.next;
//    }
    public ListNode detectCycle(ListNode head) {
        int length = 0;
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                length = length(slow);
                break;
            }
        }
        if (length == 0) return null;
        ListNode f = head;
        ListNode s = head;
        while(length > 0){
            f = f.next;
            length--;
        }
        while(f != s){
            f = f.next;
            s = s.next;
        }
        return f;

    }

    private int length(ListNode slow) {
        int length = 1;
        ListNode current = slow.next;
        while (current != slow) {
            length++;
            current = current.next;
        }
        return length;
    }
}
