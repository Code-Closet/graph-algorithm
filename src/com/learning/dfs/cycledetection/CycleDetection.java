package com.learning.dfs.cycledetection;

import java.util.List;

public class CycleDetection {
	
	public void cycleDetection(List<Vertex> vertices) {
		
		for(Vertex v : vertices) {
			if(!v.isVisited())
				dfs(v);
		}
	}

	private void dfs(Vertex vertex) {
		System.out.println("Current vertex : "+vertex);
		vertex.setBeignVisited(true);
		for(Vertex v : vertex.getAdjacentVertices()) {
			
			System.out.println("Visiting the neighbours of vertex : "+vertex);
			if (v.isBeignVisited()) {
				System.out.println("There is a backward edge, cycle detected...");
				return;
			}
			
			if (!v.isVisited()) {
				v.setVisited(true);
				System.out.println("Visited vertex :"+v+", reccursively calling dfs");
				dfs(v);
			}
		}
		vertex.setBeignVisited(false);
		vertex.setVisited(true);
	}

}
