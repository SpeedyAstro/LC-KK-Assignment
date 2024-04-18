package LinkedList;

import java.util.Stack;

public class AddTwoNumbersII {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> set = new Stack<>();
        Stack<Integer> set2 = new Stack<>();
        while (l1!=null){
            set.push(l1.val);
            l1 = l1.next;
        }
        while (l2!=null){
            set2.push(l2.val);
            l2 = l2.next;
        }
        ListNode node = new ListNode(0);
        int carry = 0;
        while (!set.isEmpty() || !set2.isEmpty() || carry!=0){
            int sum = carry;
            if(!set.isEmpty()) sum+=set.pop();
            if(!set2.isEmpty()) sum+=set2.pop();
            ListNode temp = new ListNode(sum%10);
            temp.next = node.next;
            node.next = temp;
            carry = sum/10;
        }
        return node.next;
    }
}
