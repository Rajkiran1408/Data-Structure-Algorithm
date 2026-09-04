package src.data_structure_algorithm;

public class GraphRepresentation {
    static void main(String[] args) {
        Graph g = new Graph(5);

        g.addValue(0,1);
        g.addValue(2,3);
        g.addValue(1,2);
        g.addValue(3,4);
        g.addValue(0,4);
        g.addValue(1,4);

        g.print();

        System.out.println(g.adjList);
    }
}
