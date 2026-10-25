package org.mahmudkhon.HeapSort;

import java.io.OutputStream;

public class IsMaxHeap {
    public static void main(String[] args) {

        int[]arr={10, 12, 7, 9, 3, 5};

        for(int i=arr.length/2-1; i>=0;i--){
            boolean isHeap=isMaxHeap(arr, arr.length,i);
            System.out.println(isHeap);
        }


    }

    static boolean isMaxHeap(int[]arr,int size,int index){
        boolean isHeap=false;
        int parent =index;
        int left= parent *2+1;
        int right= parent *2+1;
        for(int i = parent; i>=0; i--){
            if((left<size && right <size) &&arr[left]<arr[index] || arr[right]<arr[index]){
                isHeap=true;
            }
        }

        return isHeap;
    }
}
