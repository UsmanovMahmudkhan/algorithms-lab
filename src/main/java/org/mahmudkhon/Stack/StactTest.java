package org.mahmudkhon.Stack;

public class StactTest {
    public static void main(String[] args) {

        Stack stack=new Stack();
        stack.push(12);
        stack.push(32);

        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
        stack.pop();
        stack.pop();
    }
}
