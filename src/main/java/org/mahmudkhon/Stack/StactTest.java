package org.mahmudkhon.Stack;

public class StactTest {
    public static void main(String[] args) {

//        Stack stack=new Stack();
//        stack.push(12);
//        stack.push(32);
//
//        System.out.println(stack.peek());
//        stack.pop();
//        System.out.println(stack.peek());
//        stack.pop();
//        stack.pop();

        Stack_Array stackArray=new Stack_Array();
        stackArray.push(12);
        stackArray.push(32);
        stackArray.push(3);
        stackArray.push(44);
        stackArray.push(5);
        System.out.println(stackArray.peek());
        //stackArray.pop();
        System.out.println(stackArray.pop());
        System.out.println(stackArray.peek());

        System.out.println(stackArray.size());
        System.out.println(stackArray.isEmpty());

        System.out.println(stackArray.pop());
        System.out.println(stackArray.pop());
        System.out.println(stackArray.pop());
        System.out.println(stackArray.pop());
      //  System.out.println(stackArray.pop());
        System.out.println(stackArray.isEmpty());


    }
}
