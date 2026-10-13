package org.mahmudkhon.InsertionSort;

import java.util.ArrayList;
import java.util.List;

public class CountInsertionSort {
    public static void main(String[] args) {
        ArrayList<Integer>arrayList=new ArrayList<>(List.of(4, 3, 2, 1,8));
        System.out.println(arrayList);
        System.out.println(insertionSort(arrayList));
        System.out.println(arrayList);

    }

    public static int insertionSort(ArrayList<Integer>arrayList){
        int totalSwap=0;

        for(int i=1;i<arrayList.size();i++){
            int j=i-1;
            int current=arrayList.get(i);
            while(j>=0){
                if(current<arrayList.get(j))
                {
                    arrayList.set(j+1,arrayList.get(j));
                    totalSwap++;
                    arrayList.set(j,current);
                }

                j--;
            }
        }

        return totalSwap;

    }
}
