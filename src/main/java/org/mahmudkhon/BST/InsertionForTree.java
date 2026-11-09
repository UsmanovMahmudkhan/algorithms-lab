package org.mahmudkhon.BST;

public class InsertionForTree {

    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node root = null;

        root = insert(root, 50);
       // System.out.println(root.data);

        root = insert(root, 30);
      //  System.out.println(root.data);

        root = insert(root, 70);
     //   System.out.println(root.data);

        root = insert(root, 20);
     //   System.out.println(root.data);
        root = insert(root, 40);

        //System.out.println(root.left.left.data);

       // System.out.println(root.left.left.data);
        print(root);
    }

    public static Node insert(Node root, int i) {
        if(root==null){
            root=new Node(i);
        }
        else if(root.data>i){
            root.left= insert(root.left,i);
        }
        else if(root.data<i){
            root.right= insert(root.right,i);
        }

        return root;
    }

    public static void print(Node node){
       if(node==null){
           return;
       }
       print(node.left);
       System.out.println(node.data);
       print(node.right);

    }
}
