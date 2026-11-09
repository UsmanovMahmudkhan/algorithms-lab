package org.mahmudkhon.BST;

public class UsingContainsMethod {

    static class Node {

        int data;
        Node left;
        Node right;


        public Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node node = new Node(50);
        node.left = new Node(30);
        node.right = new Node(70);
        node.left.left = new Node(20);
        node.left.right = new Node(40);

        System.out.println(contains(node, 40));
        System.out.println(contains(node, 70));
    }

    public static boolean contains(Node current, int target) {
       boolean contains=false;

        while (current != null) {
            if (current.data == target) {
                contains=true;
                break;
            }
            else if (current.data > target) {
                current = current.left;
            }
            else if (current.data < target) {
                current = current.right;
            }
        }

        return contains;

    }
























}
