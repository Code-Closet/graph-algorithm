package com.learning.shortestPath.dag;

import java.util.Arrays;
import java.util.List;

import com.learning.shortestPath.dag.Edge;
import com.learning.shortestPath.dag.Vertex;

public class App {

	public static void main(String[] args) {
		
		Vertex vertex0 = new Vertex("A");
		Vertex vertex1 = new Vertex("B");
		Vertex vertex2 = new Vertex("C");
		List<Vertex> vertexList = Arrays.asList(vertex0, vertex1, vertex2);
		
		vertex0.addNeighbours(new Edge(1, vertex0, vertex1));
		vertex0.addNeighbours(new Edge(3, vertex0, vertex2));
		vertex1.addNeighbours(new Edge(1, vertex1, vertex2));

		AcyclicShortestPath acyclicShortestPath = new AcyclicShortestPath();
		acyclicShortestPath.shortestPath(vertexList, vertex0, vertex2);
		acyclicShortestPath.showShortesPathTo(vertex2);
	}

}
