package LinkedList;

public class DesignLinkedList {

}
class MyLinkedList {
    private class Node {
        int val;
        Node next;
        Node prev;

        public Node(int value, Node next) {
            this.val = value;
            this.next = next;
        }

        Node(int val) {
            this.val = val;
        }
    }
    private Node head;
    private Node tail;
    private int length;

    public MyLinkedList() {
        this.length = 0;
        head = null;
        tail = null;
    }

    public int get(int index) {
        if(index<0 || index>=length) return -1;
        Node temp = head;
        for(int i = 0 ; i < index ; i++){
            temp = temp.next;
        }
        return temp.val;
    }

    public void addAtHead(int val) {
        Node node = new Node(val,head);
        head = node;
        if(tail==null) tail = head;
        length++;
    }

    public void addAtTail(int val) {
        Node node = new Node(val);
        if(tail!=null) tail.next = node;
        tail = node;
        if(head==null) head = tail;
        length++;
    }

    public void addAtIndex(int index, int val) {
        if(index<0 || index>length) return;
        if(index==0){
            addAtHead(val);
            return;
        }
        if(index==length){
            addAtTail(val);
            return;
        }
        Node temp = head;
        for(int i = 0 ; i < index-1 ; i++){
            temp = temp.next;
        }
        Node node = new Node(val,temp.next);
        temp.next = node;
        length++;
    }

    public void deleteAtIndex(int index) {
        if(index<0 || index>=length) return;
        if(index==0){
            head = head.next;
            length--;
            return;
        }
        Node temp = head;
        for(int i = 0 ; i < index-1 ; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        if(index==length-1){
            tail = temp;
        }
        length--;
    }

}
