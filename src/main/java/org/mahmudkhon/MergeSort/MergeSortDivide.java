package org.mahmudkhon.MergeSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.*;

public class MergeSortDivide {
    public static void main(String[] args) {
        int[] arr={4,3,2,1,5,2};

        for(int i:arr){
            System.out.print(i+" ");
        }

        int[] sorted=conquer(arr);

        System.out.println( );

        for(int i:sorted){
            System.out.print(i+" ");
        }
    }

    static int[] conquer(int [] arrayList){
        int middle=arrayList.length/2;

        if (arrayList.length<2){
            return arrayList;
        }

        int[] left=Arrays.copyOfRange(arrayList,0,middle);
        int [] right=Arrays.copyOfRange(arrayList,middle, arrayList.length);

        left = conquer(left);
        right = conquer(right);



        return merge(left, right);


    }

    static int[] merge(int[] left, int[] right){
        int[]temp=new int[left.length+right.length];

        int i=0, j=0, k=0;

        while(i<left.length && j<right.length){
            if(left[i]<right[j]){
                temp[k]=left[i];
                k++;
                i++;
            }
            else{
                temp[k]=right[j];
                k++;
                j++;
            }
        }

        while(i<left.length){
            temp[k]=left[i];
            k++;
            i++;
        }

        while(j<right.length){
            temp[k]=right[j];
            k++;
            j++;
        }
        return temp;
    }
}
