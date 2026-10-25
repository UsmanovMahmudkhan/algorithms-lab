package org.mahmudkhon.HeapSort;

import java.util.Arrays;

public class Max_Heap {
    public static void main(String[] args) {

        int [] arr={3, 9, 6, 5, 2};

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        for(int i=arr.length/2-1;i>=0;i--){
            max_heap(arr,arr.length,i);
        }

        for(int i=arr.length-1;i>=0;i--){
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;
            max_heap(arr,i,0);

        }

        System.out.println();

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }

    static void max_heap(int[] arr,int heapSize,int n){
        int leaf_parent=n;
        int left=leaf_parent*2+1;
        int right=leaf_parent*2+2;

        if (left<heapSize && arr[left]>arr[leaf_parent]) {
            leaf_parent=left;
        }
        if(right<heapSize && arr[right]>arr[leaf_parent]){
            leaf_parent=right;
        }

        if(leaf_parent!=n){

            swap(n,leaf_parent,arr);


            max_heap(arr,heapSize,leaf_parent);
        }


    }

    static void swap(int node,int parent,int[]arr){
        int temp=arr[node];
        arr[node]=arr[parent];
        arr[parent]=temp;
    }
}
