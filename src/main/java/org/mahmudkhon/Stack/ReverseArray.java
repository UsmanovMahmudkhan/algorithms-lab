package org.mahmudkhon.Stack;

import java.util.Stack;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,3,4,1,2,32,333,3333333};

        reverse(arr);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }

    static void reverse(int[] arr){
        Stack<Integer>stack=new Stack<>();
        for(int i=0;i<arr.length;i++){
            stack.push(arr[i]);
        }

        for(int i=0;i<arr.length;i++){
            arr[i]=stack.pop();
        }
    }
}
