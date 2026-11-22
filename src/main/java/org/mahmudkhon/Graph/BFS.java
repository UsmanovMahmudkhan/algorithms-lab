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

        distance(graph,0,4,5);

       // bfs(graph,0);



    }

    static void distance(ArrayList<ArrayList<Integer>>adj,int start,int end,int totalVertices){
        boolean[] visited=new boolean[totalVertices];
        Queue<Integer>queue=new ArrayDeque<>();
        queue.add(start);

        int[] distance=new int[totalVertices];
        Arrays.fill(distance,-1);

        visited[start]=true;
        distance[start]=0;

        while(!queue.isEmpty()){
            int currentNode=queue.poll();
            // 0
            if(currentNode==end){
                break;
            }

            for(int child:adj.get(currentNode)){
                   // 1: get child of 0
                if(!visited[child]){
                    // visited[1]=false
                    queue.add(child);
                    //queue=[1,2]
                    visited[child]=true;
                    //visited[1]=true;
                    distance[child]=1+distance[currentNode];
                    //distance[1]=1+distance[0];

                }
            }
        }

        for(int i=0;i<distance.length;i++){
            System.out.println(i+" "+distance[i]);
        }



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
