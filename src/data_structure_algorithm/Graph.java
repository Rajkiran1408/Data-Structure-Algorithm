package src.data_structure_algorithm;

import java.util.ArrayList;

public class Graph {
    ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();

    Graph(int size){
        for(int i=0;i<size;i++){
            adjList.add(new ArrayList<Integer>());
        }
    }

    public void addValue(int u,int v){
        adjList.get(u).add(v);
        adjList.get(v).add(u);
    }

    public void print(){
        for(int i=0;i< adjList.size();i++){
            System.out.println("Adj value of "+i);
            for (int j=0;j<adjList.get(i).size();j++){
                System.out.println(adjList.get(i).get(j));
            }
        }
    }
}
