package org.mahmudkhon.Stack;

import java.util.Arrays;

public class Stack_Array {

    public int arr[]=new int[4];
    int size_pointer=0;

    //push
    public void push(int value){
        if (arr.length==size_pointer){
           arr=resize(arr);
        }
        arr[size_pointer++]=value;

    }

    //pop

    public int pop(){
        var last= arr[size_pointer-1];
        size_pointer--;
        return last;
    }

    //peek
    public int peek(){
        return arr[size_pointer-1];
    }

    //size;

    public int size(){
        return size_pointer;
    }

    //isEmpty;
    public boolean isEmpty(){
        if(size_pointer==0) {
            return true;
        }
        return false;
    }

    //resize;
    public static int[] resize(int[] array){
        int [] adv_arr= Arrays.copyOf(array,array.length*2);
        return adv_arr;
    }
}
