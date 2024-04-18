package Trees;

import java.util.Scanner;

public class BinaryTree {
    private static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            left = null;
            right = null;
        }
    }
    Node root;

    BinaryTree(){
        root = null;
    }

//    Insert Elements
    public void populate(Scanner sc){
        System.out.println("Enter the root element");
        int data = sc.nextInt();
        root = new Node(data);
        populate(sc, root);
    }

    private void populate(Scanner sc, Node root){
        System.out.println("Do you want to add left child of " + root.data);
        if(sc.next().equalsIgnoreCase("yes")){
            System.out.println("Enter the left child of " + root.data);
            int data = sc.nextInt();
            root.left = new Node(data);
            populate(sc, root.left);
        }
        System.out.println("Do you want to add right child of " + root.data);
        if(sc.next().equalsIgnoreCase("yes")){
            System.out.println("Enter the right child of " + root.data);
            int data = sc.nextInt();
            root.right = new Node(data);
            populate(sc, root.right);
        }
    }
//    Display
    public void display(){
        display(root, "");
    }

    private void display(Node root, String indent){
        if(root == null){
            return;
        }
        System.out.println(indent + root.data);
        display(root.left, indent + "\t");
        display(root.right, indent + "\t");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();
        tree.populate(sc);
        tree.display();
    }


}
