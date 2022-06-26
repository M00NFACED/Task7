package ru.vsu.cs.pekshev.T7.graph.demo;

import ru.vsu.cs.pekshev.T7.graph.GraphAlgorithms;
import ru.vsu.cs.pekshev.T7.graph.WeightedGraph;

public class Task {
    static int getVertex(WeightedGraph graph, double n) {
        int indexOfVertex = -1;
        for (int i = 0; i < graph.vertexCount(); i++) {
            GraphAlgorithms.MinDistanceSearchResult result = new GraphAlgorithms.MinDistanceSearchResult();
            result = GraphAlgorithms.bellmanFord(graph, i);
            int s = 0;
            for (Double pathLength : result.d) {
                if (pathLength >= n) {
                    s = 0;
                    continue;
                }
                s++;

                }
                if (s == graph.vertexCount()) {
                    indexOfVertex = i;
                    break;
            }
        }
        return indexOfVertex;

    }
}
