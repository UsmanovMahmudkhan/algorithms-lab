package org.mahmudkhon.Graph;

import java.util.*;

public class BFS {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>>graph=new ArrayList<>();
        for(int i=0;i<5;i++){
            graph.add(new ArrayList<>());
        }

        addNode(graph,0,1);
        addNode(graph,0,2);
        addNode(graph,1,3);
        addNode(graph,1,4);

        bfs(graph,0);

    }

    static void addNode(ArrayList<ArrayList<Integer>>adj,int parent,int child){
        adj.get(parent).add(child);
        adj.get(child).add(parent);
    }

    static void bfs(ArrayList<ArrayList<Integer>> adjs, int start){

        Queue<Integer>myQueue=new PriorityQueue<>();

        boolean[]visited=new boolean[adjs.size()];
        int[] parent=new int[adjs.size()];
        Arrays.fill(parent,-1);

        visited[start]=true;
        myQueue.add(start);

        while(!myQueue.isEmpty()){
            int node=myQueue.poll();

            System.out.print(node+" ");
            for(int neighbor: adjs.get(node)){
                if(!visited[neighbor]){
                    myQueue.add(neighbor);
                    visited[neighbor]=true;
                    parent[neighbor]=node;
                }
            }

        }
        System.out.println("\nParents: ");

        for(int i=0;i<parent.length;i++){
            System.out.println(i+" "+parent[i]);
        }

    }

}
