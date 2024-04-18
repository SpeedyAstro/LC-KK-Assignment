package LinkedList;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    private class Node {
        int key;
        int value;
        Node next;
        Node prev;

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
    private Node head;
    private Node tail;
    private int capacity;
    private int length;
    private Map<Integer,Node> map;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.length = 0;
        head = null;
        tail = null;
        map = new HashMap<>();
    }

    public int get(int key) {
        if(!map.containsKey(key)) return -1;
        Node node = map.get(key);
        remove(node);
        add(node);
        return node.value;
    }

    public void put(int key, int value) {
        if(map.containsKey(key)){
            Node node = map.get(key);
            node.value = value;
            remove(node);
            add(node);
        }
        else{
            Node node = new Node(key,value);
            if(length==capacity){
                map.remove(tail.key);
                remove(tail);
                add(node);
            }
            else{
                add(node);
            }
            map.put(key,node);
        }
    }

    private void add(Node node){
        if(head==null){
            head = node;
            tail = node;
        }
        else{
            node.next = head;
            head.prev = node;
            head = node;
        }
        length++;
    }

    private void remove(Node node){
        if(node.prev!=null){
            node.prev.next = node.next;
        }
        else{
            head = node.next;
        }
        if(node.next!=null){
            node.next.prev = node.prev;
        }
        else{
            tail = node.prev;
        }
        length--;
    }
}
