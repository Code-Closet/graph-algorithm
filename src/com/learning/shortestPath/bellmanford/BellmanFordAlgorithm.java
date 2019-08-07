package com.learning.shortestPath.bellmanford;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BellmanFordAlgorithm {
	
	private List<Edge> edgeList;
	private List<Vertex> vertexList;
	public BellmanFordAlgorithm(List<Edge> edgeList, List<Vertex> vertexList) {
		this.edgeList = edgeList;
		this.vertexList = vertexList;
	}
	
	public void applyAlgorithm(Vertex sourceVertex) {
		
		sourceVertex.setDistance(0);
		
		for (int i=0; i < vertexList.size()-1; i++) {
			
			for (Edge edge: edgeList) {
				
				Vertex u = edge.getStartVertex();
				Vertex v = edge.getTargetVertex();
				
				double newDistance = u.getDistance() + edge.getWeight();
				
				if (newDistance < v.getDistance()) {
					
					v.setDistance(newDistance);
					v.setPredecessor(u);
				}
			}
		}
		
		for (Edge edge : edgeList) {
			
			if (edge.getStartVertex().getDistance() != Double.MAX_VALUE) {
				
				if(hasCycle(edge)) {
					System.out.println("There has been a negative cycle detected...");
					return;
				}
			}
		}
	}

	private boolean hasCycle(Edge edge) {
		return edge.getStartVertex().getDistance() + edge.getWeight() < edge.getTargetVertex().getDistance();
	}
	
	public List<Vertex> shortestPathTo(Vertex targetVertex) {
		
		if (targetVertex.getDistance() == Double.MAX_VALUE) {
			System.out.println("There is no path from source to target");
		}
		
		Vertex actualVertex = targetVertex;
		List<Vertex> shortestPathToTarget = new ArrayList<>();
		shortestPathToTarget.add(actualVertex);
		
		while (actualVertex.getPredecessor() != null) {
			actualVertex = actualVertex.getPredecessor();
			shortestPathToTarget.add(actualVertex);
		}
		Collections.reverse(shortestPathToTarget);
		return shortestPathToTarget;
		
	}

}
