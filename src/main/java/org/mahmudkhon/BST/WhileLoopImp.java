package org.mahmudkhon.BST;

public class WhileLoopImp {

    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
       Node node = new Node(50);
       node.right=new Node(70);
       node.left=new Node(30);
       var head=node;

       int valueToAdd=60;

       while(head!=null){
           if(head.data<valueToAdd){
               if(head.right==null){
                   head.right=new Node(valueToAdd);
                   break;
               }
               head=head.right;
           }
           else if(head.data>valueToAdd) {
               if(head.left==null){
                   head.left=new Node(valueToAdd);
                   break;
               }
               head=head.left;
           }
           else {
               break;
           }
       }

       var left=node.right.left.data;

        System.out.println(left);


    }
}
