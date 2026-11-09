package org.mahmudkhon.BST;

public class InsertingNodeWithLoop {

     static class Node{

        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }



    public static void main(String[] args) {

        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);

        Node current = root;

        System.out.println();
        int target = 90;

        if (target > current.data) {
            current = current.right;

        }
        if (target > current.data) {
            current.right=new Node(90);

        }

        System.out.println(current.right.data);
    }
}
