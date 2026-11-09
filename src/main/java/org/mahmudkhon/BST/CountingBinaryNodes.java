package org.mahmudkhon.BST;

public class CountingBinaryNodes {

    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }


    public static void main(String[] args) {
        Node node=new Node(50);
        node.left=new Node(30);
        node.right=new Node(70);
        node.left.left=new Node(20);
        node.left.right=new Node(50);

        var leaf=node.left.right.data;
        System.out.println(leaf);

        System.out.println(count(node));
    }

    public static int count(Node current) {
        int count=0;
        if (current == null) {
            return 0;
        }

        count++;

        return  count+count(current.left)+count(current.right);

    }
}
