package ru.geekbrains;

import java.util.LinkedList;

public class BreadthFirstSearch {
    private boolean[] isMarked;
    private int[] pointer;
    private int source;
    private int stackSize;

    public BreadthFirstSearch(Graph graph, int source) {
        this.source = source;
        stackSize = 0;
        isMarked = new boolean[graph.getVertexCount()];
        pointer = new int[graph.getVertexCount()];
        bfs(graph, source);
    }

    private void bfs(Graph graph, int source) {
        LinkedList<Integer> queue = new LinkedList<>();
        queue.addFirst(source);
        isMarked[source] = true;
        while (!queue.isEmpty()) {
            int vertex = queue.removeLast();
            for (int w : graph.getGraphList(vertex)) {
                if (!isMarked[w]) {
                    isMarked[w] = true;
                    pointer[w] = vertex;
                    queue.addFirst(w);
                }
            }
        }
    }

    public void pathSize()
    {
        System.out.println("Path size:\t" + stackSize);
    }

    public boolean hasPathTo(int dist) {
        return isMarked[dist];
    }

    public LinkedList<Integer> pathTo(int dist) {
        if (!hasPathTo(dist)) {
            return null;
        }
        LinkedList<Integer> stack = new LinkedList<>();
        int vertex = dist;
        while (vertex != source) {
            ++stackSize;
            stack.push(vertex);
            vertex = pointer[vertex];
        }
        return stack;
    }
}
