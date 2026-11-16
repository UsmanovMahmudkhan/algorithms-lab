package org.mahmudkhon.BST;

public class Trees {

    public static void main(String[] args) {
        Node node=new Node(12);
        node.left=new Node(33);
        node.right=new Node(44);
        System.out.println(search(45,node));
        System.out.println(node.left.data);
        System.out.println(node.right.data);
        walk(node);

    }


    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }

    static boolean search(int data,Node node){
        boolean isAvailable=false;
        while(node!=null){
        if(data< node.data){
           return search(data,node.left);
        }
        else if(data> node.data){
            return search(data,node.right);
        }
        else if(data==node.data){
            isAvailable=true;
            return isAvailable;
        }
        }

        return isAvailable;
    }

    static void walk(Node node){
        if(node!=null){
            walk(node.left);
            System.out.print(node.data+" ");
            walk(node.right);
        }
    }




}
