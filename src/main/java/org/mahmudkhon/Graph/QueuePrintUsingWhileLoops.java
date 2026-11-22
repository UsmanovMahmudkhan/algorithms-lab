package org.mahmudkhon.Graph;

import java.util.*;

public class QueuePrintUsingWhileLoops
{

    public static void main(String[] args) {
        Queue<Integer>myQueue=new PriorityQueue<>();
        myQueue.addAll(List.of(1,2,3,4,5,6,7,8,9));
        System.out.println(myQueue);

        while(!myQueue.isEmpty()){
            int node= myQueue.poll();

            System.out.print(node+" ");
            System.out.println(myQueue);
        }

        /*
        [1, 2, 3, 4, 5, 6, 7, 8, 9]
        1 [2, 4, 3, 8, 5, 6, 7, 9]
        2 [3, 4, 6, 8, 5, 9, 7]
        3 [4, 5, 6, 8, 7, 9]
        4 [5, 7, 6, 8, 9]
        5 [6, 7, 9, 8]
        6 [7, 8, 9]
        7 [8, 9]
        8 [9]
        9 []
         */
    }
}

