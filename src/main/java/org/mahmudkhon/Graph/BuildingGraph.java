package org.mahmudkhon.Graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BuildingGraph {
    public static void main(String[] args) {
        List<List<Integer>> myGraph =new ArrayList<>();

        for(int i=0;i<4;i++){
            myGraph.add(new ArrayList<>());
        }
        addAdj(myGraph,0,1);
        addAdj(myGraph,0,2);
        addAdj(myGraph,1,3);


        for(int i=0;i<myGraph.size();i++){
            System.out.println(i+" :"+myGraph.get(i));
        }
    }

    static void addAdj(List<List<Integer>>adjCollection,int parent,int child){
        adjCollection.get(parent).add(child);
        adjCollection.get(child).addFirst(parent);
    }
}
