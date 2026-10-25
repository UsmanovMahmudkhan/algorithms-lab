package org.mahmudkhon.HeapSort;

public class FullCompleteHeapSort {
    public static void main(String[] args) {
        int arr[]={12, 11, 13, 5, 6, 7};
        sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }


    static void sort(int[]arr){

          build_heap(arr);

         for(int i=arr.length-1;i>=0;i--){
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;
            max_heap(arr,i,0);
        }
    }


    static void build_heap(int arr[]){
        for(int i=arr.length/2-1;i>=0;i--){
            max_heap(arr,arr.length,i);
        }
    }

    static void max_heap(int arr[],int heapSize,int index){
        int largest=index;
        int left=leftChild(index);
        int right=rightChild(index);

        if(left<heapSize && arr[left]>arr[largest]){
            largest=left;
        }

        if(right<heapSize && arr[right]>arr[largest]){
            largest=right;
        }

        if(largest!=index){
            int temp=arr[index];
            arr[index]=arr[largest];
            arr[largest]=temp;
            max_heap(arr,heapSize,largest);
        }
    }

    static int parent(int index){
        return (index-1)/2;
    }

    static int leftChild(int index){
        return index*2+1;
    }

    static int rightChild(int index){
        return index*2+2;
    }


}
