package com.learning.shortestPath.bellmanford;

import java.util.Arrays;
import java.util.List;

import com.learning.shortestPath.bellmanford.Vertex;

public class App {

	public static void main(String[] args) {

		Vertex vertex0 = new Vertex("A");
		Vertex vertex1 = new Vertex("B");
		Vertex vertex2 = new Vertex("C");
		List<Vertex> vertexList = Arrays.asList(vertex0, vertex1, vertex2);
		List<Edge> edgeList = Arrays.asList(
				new Edge(1, vertex1, vertex0),
				new Edge(1, vertex0, vertex2),
				new Edge(-3, vertex2, vertex1)
				);

		BellmanFordAlgorithm algorithm = new BellmanFordAlgorithm(edgeList, vertexList);
		algorithm.applyAlgorithm(vertex1);
		//System.out.println(algorithm.shortestPathTo(vertex2));
	}

}
