package org.mahmudkhon.MergeSort;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] a={1,3,5};
        int[] b={2,4,6};
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }

        System.out.println();

        for(int i=0;i<b.length;i++){
            System.out.print(b[i]+" ");
        }

        System.out.println();
        int[] sorted=merge(a,b);

        for(int i=0;i<sorted.length;i++){
            System.out.print(sorted[i]+" ");
        }
    }


     static int[] merge(int[] array1, int[] array2){
        int[] temp=new int[array1.length+array2.length];
        int i=0,j=0,k=0;

        while(i<array1.length && j<array2.length){
            if (array1[i]<array2[j]) {
                temp[k]=array1[i];
                k++;
                i++;
            }
            else {
                temp[k]=array2[j];
                k++;
                j++;
            }
        }

        while(i < array1.length){
            temp[k]=array1[i];
            k++;
            i++;
        }

         while(j < array2.length){
             temp[k]=array2[j];
             k++;
             j++;
         }

         return temp;
     }
}
