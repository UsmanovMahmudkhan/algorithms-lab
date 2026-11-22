package org.mahmudkhon.Graph;

public class VisitedNodes {
    public static void main(String[] args) {
        boolean[] visited=new boolean[5];
        for(int i=0;i<visited.length;i++){
            if(i%2==0){
                visited[i]=true;
            }
            else {
                visited[i]=false;
            }
        }

        for(boolean b: visited){
            System.out.print(b+" ");
        }
    }
}
