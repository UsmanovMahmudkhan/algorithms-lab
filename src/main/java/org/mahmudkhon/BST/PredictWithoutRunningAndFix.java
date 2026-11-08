package org.mahmudkhon.BST;

public class PredictWithoutRunningAndFix {

        public static void main(String[] args) {
            Node root = new Node(50);

            root.left = new Node(30);
            root.right = new Node(70);
            root.left.left = new Node(20);
            root.left.right = new Node(40);

            /**
             *       50
             *      /  \
             *    30    70
             *   /  \   / \
             * 20   40
             */

            Node current = root; // so we are pointing to root which is 50

            current = current.left; // here we are pointing to left child of 50: 30
            current = current.left; // after pointing to 30, no we want to point right child of 30 which is 40
// if we want to point to 20 instead of 40, we need to change current.right to to current.left after poinitng to 30
            System.out.println(current.data); //--> 40 , after changing it prints 20

            System.out.println(root.data);  // ->50
        }

        static class Node {
            int data;
            Node left;
            Node right;

            Node(int data) {
                this.data = data;
            }
        }


}
