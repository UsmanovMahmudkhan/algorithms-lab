package org.mahmudkhon.Graph;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueImp {
    public static void main(String[] args) {
        Queue<Integer>myQueue=new PriorityQueue<>();
        myQueue.add(10);
        myQueue.add(20);
        myQueue.add(30);

        System.out.println(myQueue);

        int node=myQueue.poll();


        System.out.println(node);
        System.out.println(myQueue);
    }
}
