package LinkedList;

public class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        if(head==null){
            return null;
        }
        head.next = removeElements(head.next,val);
        return head.val==val?head.next:head;
    }
    public ListNode removeElements2(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode temp = dummy;
        while(temp.next!=null){
            if(temp.next.val==val){
                temp.next = temp.next.next;
            }
            else{
                temp = temp.next;
            }
        }
        return dummy.next;
    }
    public ListNode removeElements3(ListNode head, int val) {
        while(head!=null && head.val==val){
            head = head.next;
        }
        ListNode temp = head;
        while(temp!=null && temp.next!=null){
            if(temp.next.val==val){
                temp.next = temp.next.next;
            }
            else{
                temp = temp.next;
            }
        }
        return head;
    }
    public ListNode removeElements4(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode curr = head;
        while(curr!=null){
            if(curr.val==val){
                prev.next = curr.next;
            }
            else{
                prev = curr;
            }
            curr = curr.next;
        }
        return dummy.next;
    }
    public static void main(String[] args) {
    }
}
