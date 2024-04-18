package StacksAndQueue;

public class O3_MinStack {
    class Node{
        int val;
        int min;
        Node next;
        Node(int val, int min){
            this.val = val;
            this.min = min;
        }
    }
    Node head;
    public O3_MinStack() {
        head = null;
    }

    public void push(int x) {
        if(head==null){
            head = new Node(x,x);
        }
        else{
            Node newNode = new Node(x,Math.min(x,head.min));
            newNode.next = head;
            head = newNode;
        }
    }

    public void pop() {
        head = head.next;
    }

    public int top() {
        return head.val;
    }

    public int getMin() {
        return head.min;
    }
}
