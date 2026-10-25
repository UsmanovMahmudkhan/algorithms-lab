package org.mahmudkhon.HeapSort;

public class FindParentAndChild {
    public static void main(String[] args) {
        int[] example={1,2,3,4,5,6,7,8,9,10};

        int parent=parent(3);
        System.out.println("index:"+parent(3)+"   values from array: " +example[parent]);

        int left=left_child(3);
        System.out.println(example[left]);

        int right=right_child(3);
        System.out.println(example[right]);
    }

    static int parent(int index){
        return (index-1)/2;
    }

    static int left_child(int index){
        return index*2+1;
    }

    static int right_child(int index){
        return index*2+2;
    }
}
