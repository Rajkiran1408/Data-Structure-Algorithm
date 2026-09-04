package src.data_structure_algorithm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Graph1{
    ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();

    Graph1(int size){
        for(int i=0;i<size;i++){
            adjList.add(new ArrayList<>());
        }
    }

    public void addValue(int u,int v){
        adjList.get(u).add(v);
        adjList.get(v).add(u);
    }

    public void print(){
        for(int i=0;i<adjList.size();i++){
            System.out.println("Adj value of "+i);
            for(int j=0;j<adjList.get(i).size();j++){
                System.out.println(adjList.get(i).get(j));
            }
        }
    }

    public void callBFS(int v){
        int s = adjList.size();
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[s];
        visited[v]=true;
        ArrayList<Integer> ans = new ArrayList<>();

        q.add(v);

        while(!q.isEmpty()){

            int vertex = q.remove();
            ans.add(vertex);

            for(int i=0;i<adjList.get(vertex).size();i++){
                int av = adjList.get(vertex).get(i);
                if(!visited[av]){
                    q.add(av);
                    visited[av]=true;
                }
            }
        }
        System.out.println(ans);
    }
}

public class Bfs {
    static void main(String[] args) {
        Graph1 g = new Graph1(5);


        g.addValue(0,1);
        g.addValue(2,3);
        g.addValue(1,2);
        g.addValue(3,4);
        g.addValue(0,4);
        g.addValue(1,4);

        g.print();

        g.callBFS(0);
    }


}
