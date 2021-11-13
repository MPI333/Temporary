package ru.geekbrains;

public class Main {

    public static void main(String[] args) {
        Graph graph = new Graph(10);
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(0, 3);
        graph.addEdge(3, 4);
        graph.addEdge(4, 5);
        graph.addEdge(3, 6);
        graph.addEdge(6, 7);
        graph.addEdge(7, 8);
        graph.addEdge(8, 9);
        graph.addEdge(2, 5);
        graph.addEdge(2, 8);

        BreadthFirstSearch breadthFirstSearch = new BreadthFirstSearch(graph, 0);
        System.out.println(breadthFirstSearch.pathTo(9));
        breadthFirstSearch.pathSize();
    }

}
