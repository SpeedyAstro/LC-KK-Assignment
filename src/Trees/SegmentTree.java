package Trees;

public class SegmentTree {
    public static class Node{
        int data;
        int startInterval;
        int endInterval;
        Node left;
        Node right;
        public Node(int data, int startInterval, int endInterval){
            this.data = data;
            this.startInterval = startInterval;
            this.endInterval = endInterval;
        }
    }
    Node root;
    public SegmentTree(int arr[]){
        root = constructTree(arr, 0, arr.length-1);
    }

    private Node constructTree(int[] arr, int i, int i1) {
        if(i == i1){
            Node leafNode = new Node(arr[i], i, i1);
            return leafNode;
        }
        Node node = new Node(0, i, i1);
        int mid = (i + i1) / 2;
        node.left = constructTree(arr, i, mid);
        node.right = constructTree(arr, mid+1, i1);
        node.data = node.left.data + node.right.data;
        return node;
    }
    public int query(int startInterval, int endInterval){
        return query(root, startInterval, endInterval);
    }
    private int query(Node node, int startInterval, int endInterval){
        if(node.startInterval >= startInterval && node.endInterval <= endInterval){
            return node.data;
        }else if(node.startInterval > endInterval || node.endInterval < startInterval){
            return 0;
        }else{
            return query(node.left, startInterval, endInterval) + query(node.right, startInterval, endInterval);
        }
    }
    private void update(int index, int data){
        update(root, index, data);
    }
    private void update(Node node, int index, int data){
        if(node.startInterval == node.endInterval){
            node.data = data;
            return;
        }
        int mid = (node.startInterval + node.endInterval) / 2;
        if(index <= mid){
            update(node.left, index, data);
        }else{
            update(node.right, index, data);
        }
        node.data = node.left.data + node.right.data;
    }
    public static void display(Node node){
        if(node == null){
            return;
        }
        String str = "";
        str += node.left == null ? "." : node.left.data;
        str += " <- " + node.data + " -> ";
        str += node.right == null ? "." : node.right.data;
        System.out.println(str);
        display(node.left);
        display(node.right);
    }
    public static void main(String[] args) {
        int arr[] = {3, 8, 7, 6, -2, -8, 4, 9};
        SegmentTree tree = new SegmentTree(arr);
        display(tree.root);
        System.out.println(tree.query(2, 6));
        tree.update(3, 14);
        System.out.println(tree.query(2, 6));
    }
}
