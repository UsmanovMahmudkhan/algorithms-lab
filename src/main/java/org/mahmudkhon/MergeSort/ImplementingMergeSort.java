package org.mahmudkhon.MergeSort;

import java.util.Arrays;

public class ImplementingMergeSort {
    public static void main(String[] args) {
        int[] arr = {8, 3, 5, 1};

        int sorted[]=conquerAndMerge(arr);

        for (int i = 0; i < sorted.length; i++) {
            System.out.print(sorted[i] + " ");
        }
    }


    static int[] merge(int left[], int right[]) {
        int temp[] = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                temp[k] = left[i];
                k++;
                i++;
            } else {
                temp[k] = right[j];
                k++;
                j++;
            }
        }
        while (i < left.length) {
            temp[k] = left[i];
            i++;
            k++;
        }

        while (j < right.length) {
            temp[k] = right[j];
            k++;
            j++;

        }
        return temp;
    }

    static int[] conquerAndMerge(int[] array) {
        if (array.length < 2) {
            return array;
        }
        int middle = array.length / 2;
        int left[] = Arrays.copyOfRange(array, 0, middle);
        int right[] = Arrays.copyOfRange(array, middle, array.length);

        return merge(conquerAndMerge(left), conquerAndMerge(right));

    }

}


