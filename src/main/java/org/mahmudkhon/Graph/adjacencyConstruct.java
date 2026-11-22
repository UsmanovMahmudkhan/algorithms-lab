package org.mahmudkhon.Graph;

import java.util.ArrayList;
import java.util.List;


public class adjacencyConstruct {

    /*
      V={1 ,2 ,3 , 4}

      E={ {1,2},  {1,3},   {2,4}}
     */

        public static void add(List<List<Integer>> adjacency, int u, int v){
            adjacency.get(u).add(v);
            adjacency.get(v).add(u);
        }

    public static void main(String[] args) {
        List<List<Integer>> andesty =new ArrayList<>();

        for (int i = 0; i <= 4; i++) {
            andesty.add(new ArrayList<>());
        }



        add(andesty,1,2) ;
        add(andesty,1,3);
        add(andesty,2,4);

        System.out.println(andesty.get(4));


    }


}
