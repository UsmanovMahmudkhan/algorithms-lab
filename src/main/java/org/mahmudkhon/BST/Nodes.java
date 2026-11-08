package org.mahmudkhon.BST;

public class Nodes {
    public static void main(String[] args) {
         Node root = new Node(50);
         root.left=new Node(30);
         root.right=new Node(70);
         root.left.left=new Node(20);
         root.left.right=new Node(40);

         Node current = root;
         current = current.left;
         current.right = new Node(35);

        System.out.println(root.left.right.data);



        
    }


    static class Node
    {
        private int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }

}

