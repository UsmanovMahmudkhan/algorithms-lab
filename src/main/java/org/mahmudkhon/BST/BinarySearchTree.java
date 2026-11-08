package org.mahmudkhon.BST;

class Node{
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
    }
}

public class BinarySearchTree {

    Node root;

    public void insert(int i) {
        root=insertRec(root, i);
    }

    public Node insertRec(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else if(root.data>data) {
            root.left=insertRec(root.left,data);
        }
        else {
            root.right=insertRec(root.right,data);
        }

        return root;
    }

    void print(Node current) {
        if (current == null) {
            return;
        }
        print(current.left);
        System.out.print(current.data + " ");
        print(current.right);
    }
}

class main {
    public static void main(String[] args) {
        BinarySearchTree tree=new BinarySearchTree();
        tree.insert(50);
        tree.insert(30);
        tree.insert(70);
        tree.insert(20);
        tree.insert(40);

        tree.print(tree.root);
    }
}
