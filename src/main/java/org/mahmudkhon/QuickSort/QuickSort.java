package org.mahmudkhon.QuickSort;

public class QuickSort {
    public static void main(String[] args) {

        int arr[]={1,8,3,9,4,5,7};

        sort(arr,0,arr.length-1);

        for(int i=0;i<arr.length;i++){

            System.out.print(arr[i]+" ");
        }

    }

    static void sort(int[]arr, int lowIndex,int highIndex){

        if(lowIndex >= highIndex){
            return;
        }

        int pivot=part(arr,lowIndex, highIndex);

        sort(arr,lowIndex,pivot-1);
        sort(arr,pivot+1,highIndex);
    }

    static int part(int[] arr, int lowIndex, int highIndex){

        int pivot=highIndex;
        int i=lowIndex-1;

        for(int j=lowIndex;j<highIndex;j++){
            if(arr[j]<arr[pivot]){
                i++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }

        i++;
        int temp=arr[i];
        arr[i]=arr[pivot];
        arr[pivot]=temp;

        return i;
    }
}
