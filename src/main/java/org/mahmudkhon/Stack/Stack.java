package org.mahmudkhon.Stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Stack {

    private ArrayList<Integer>arrayList=new ArrayList<>();

    //push(int value) — add an element to the top.
    public void push(int value){
        arrayList.add(value);
    }

    //pop() — remove and return the top element.
    public int pop(){
        if(arrayList.isEmpty()){
            throw new IllegalStateException("Stack is Empty");
        }
        int top=arrayList.getLast();
        arrayList.removeLast();
        return top;
    }
    //
    //
    //peek() — return the top element without removing it.
    public int peek(){
        if(arrayList.isEmpty()){
            throw new IllegalStateException("Stack is Empty");
        }
        return arrayList.getLast();
    }

    //isEmpty() — return whether the stack is empty.
    public boolean isEmpty(){
        return arrayList.isEmpty();
    }
    //

    //size() — return the number of elements.

    public int size(){
        return arrayList.size();
    }
}
