package org.mahmudkhon.HeapSort;

public class ImplementMaxHeapify {
    public static void main(String[] args) {
        int arr[]={3, 9, 6, 5, 2};

        for(int i=arr.length/2-1;i>=0;i--){
            maxHeap(arr,arr.length,i);
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    static void maxHeap(int[]arr,int heapSize,int index){
        int largest=index;
        int left_child=index*2+1;
        int right_index=index*2+2;

        if(left_child<heapSize && arr[left_child]>arr[largest]){
            largest=left_child;
        }

        if(right_index<heapSize && arr[right_index]>arr[largest]){
            largest=right_index;
        }

        if(largest!=index){
            int temp=arr[index];
            arr[index]=arr[largest];
            arr[largest]=temp;
            maxHeap(arr,heapSize,largest);
        }
    }
}
