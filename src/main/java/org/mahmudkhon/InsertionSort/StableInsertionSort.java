package org.mahmudkhon.InsertionSort;

import java.util.ArrayList;
import java.util.List;

public class StableInsertionSort {
    public static void main(String[] args) {

        //["banana", "cat", "dog", "a", "apple"] --> result: [a, cat, dog, apple, banana]

        //["abcd", "xy", "pq", "z", "hello"] ---> result: [z, xy, pq, abcd, hello]
        ArrayList<String>arrayList=new ArrayList<>(List.of("banana", "cat", "dog", "a", "apple"));
        System.out.println(arrayList);
        sort(arrayList);
        System.out.println(arrayList);

    }

    public static void sort(ArrayList<String>arrayList){
        for(int i=1;i<arrayList.size();i++){
            int j=i-1;
            while(j>=0 && arrayList.get(j).length()>arrayList.get(j+1).length()){
                String temp=arrayList.get(j);
                arrayList.set(j,arrayList.get(j+1));
                arrayList.set(j+1,temp);
                j--;
            }

        }
    }
}
