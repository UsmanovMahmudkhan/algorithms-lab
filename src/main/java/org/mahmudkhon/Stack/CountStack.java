package org.mahmudkhon.Stack;

import java.util.Stack;

public class CountStack {
    public static void main(String[] args) {
        Stack<Integer>stack=new Stack<>();
        int size=0;

        stack.push(12);
        stack.push(33);
        stack.push(5);
        stack.push(6);

        for(Integer element: stack){
            size++;
        }

        System.out.println(size);

    }
}
