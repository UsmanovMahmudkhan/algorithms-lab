package org.mahmudkhon.InsertionSort;

import java.util.ArrayList;
import java.util.List;

public class InsertionSort {

    public static void main(String[] args) {
        // i think it works, but i made a mistake in the beginning, when i was using while() loop i used i instead of j+1 and j, which was incorrect for swapping

        ArrayList<Integer>arrayList=new ArrayList<>(List.of(5,2,4,6,1,3));
        System.out.println(arrayList);
        insertionSort(arrayList);
        System.out.println(arrayList);
    }

    public static void insertionSort(ArrayList<Integer>arrayList){
        for(int i=1;i<arrayList.size();i++){

            int j=i-1;

            while(j>=0){
                if(arrayList.get(j+1)<arrayList.get(j)){
                    int temp=arrayList.get(j+1);
                    arrayList.set(j+1,arrayList.get(j));
                    arrayList.set(j,temp);

                }
                j--;


            }

        }
    }

}
