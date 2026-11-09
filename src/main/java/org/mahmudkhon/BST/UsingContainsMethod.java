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
        System.out.println(contains(node, 120));
    }

    public static boolean contains(Node current, int target) {
        boolean contains=false;
        if(current==null){
            return contains;
        }

            if(current.data==target) {
                contains=true;
            }
            else if (current.data>target) {
                return contains(current.left,target);
            }
            else if(current.data<target){
                return contains(current.right,target);
            }


        return contains;
    }
























}
