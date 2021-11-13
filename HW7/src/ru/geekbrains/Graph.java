package ru.geekbrains;

import java.util.LinkedList;

public class Graph {
    private int vertexCount;
    private int edgeCount;
    private LinkedList<Integer>[] graphList;

    public Graph(int vertexCount) {
        if (vertexCount <= 0) {
            throw new IllegalArgumentException("vertexCount: " + vertexCount);
        }
        this.vertexCount = vertexCount;
        graphList = new LinkedList[vertexCount];
        for (int i = 0; i < graphList.length; i++) {
            graphList[i] = new LinkedList<>();
        }
    }

    public void addEdge(int v1, int v2) {
        if (v1 < 0 || v2 < 0 || v1 >= vertexCount || v2 >= vertexCount) {
            throw new IllegalArgumentException();
        }
        graphList[v1].add(v2);
        if (v1 != v2) {
            graphList[v2].add(v1);
        }
        edgeCount++;
    }

    public LinkedList<Integer> getGraphList(int vertex) {
        return (LinkedList<Integer>) graphList[vertex].clone();
    }

    public int getVertexCount() {
        return vertexCount;
    }

    public int getEdgeCount() {
        return edgeCount;
    }
}
