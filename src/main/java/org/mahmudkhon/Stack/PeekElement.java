package org.mahmudkhon.Stack;

import java.util.Stack;

public class PeekElement {
    public static void main(String[] args) {
        Stack<Integer>stack=new Stack<>();
        stack.push(12);
        stack.push(33);
        stack.push(4);
        stack.push(44);
        stack.pop();
        var element=stack.peek();
        System.out.println(element);
    }
}
