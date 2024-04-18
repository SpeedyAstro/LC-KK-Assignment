package LinkedList;

public class ConvertBinaryNumberinaLinkedListtoInteger {
    public int getDecimalValue1(ListNode head) {
        int result = 0;
        while (head != null) {
            result = result * 2 + head.val;
            head = head.next;
        }
        return result;
    }
    public int getDecimalValue(ListNode head) {
        int power = 0;
        ListNode tem= head;
        while(tem!=null){
            tem = tem.next;
            power++;
        }
        int ans = 0;
        while(head!=null){
            ans += head.val * Math.pow(2, power-1);
            power--;
            head = head.next;
        }
        return ans;

    }
}
