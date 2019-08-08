package com.learning.shortestPath.dag;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class AcyclicShortestPath {

	public void shortestPath(List<Vertex> vertices, Vertex sourceVertex, Vertex targetVertex) {
		
		sourceVertex.setDistance(0);
		TopologicalSort topologicalSort = new TopologicalSort();
		topologicalSort.makeTopologicalOrder(vertices);
		
		Stack<Vertex> stack = topologicalSort.getTopologicalOrder();
		
		for (Vertex vertex : stack) {
			
			for(Edge edge: vertex.getAdjacenciesList()) {
				
				Vertex u = edge.getStartVertex();
				Vertex v = edge.getTargetVertex();
				
				double newDistance = u.getDistance() + edge.getWeight();
				
				if (newDistance < v.getDistance()) {
					v.setDistance(newDistance);
					v.setPredecessor(u);
				}
			}
		}
		
		if (targetVertex.getDistance() == Double.MAX_VALUE) {
			System.out.println("No shortest path there ...");
		} else {
			System.out.println("Target vertex shortes path : " + targetVertex.getDistance());
		}
	}
	
	public void showShortesPathTo(Vertex vertex) {
		List<Vertex> shortestPath = new ArrayList<>();
		shortestPath.add(vertex);
		
		while (vertex.getPredecessor() != null) {
			vertex = vertex.getPredecessor();
			shortestPath.add(vertex);
		}
		
		Collections.reverse(shortestPath);
		System.out.println(shortestPath);
	
	}
}
