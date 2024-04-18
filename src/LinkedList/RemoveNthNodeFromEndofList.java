package LinkedList;

public class RemoveNthNodeFromEndofList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode temp = dummy;
        ListNode temp2 = dummy;
        for(int i = 0 ; i <= n ; i++){
            temp = temp.next;
        }
        while(temp!=null){
            temp = temp.next;
            temp2 = temp2.next;
        }
        temp2.next = temp2.next.next;
        return dummy.next;
    }
}
