package com.learning.bfs.sample;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {

	public void bfs(Vertex vertex) {
		
		Queue<Vertex> queue = new LinkedList<>();
		
		vertex.setVisited(true);
		queue.add(vertex);
		
		while(!queue.isEmpty()) {
			Vertex actual = queue.remove();
			System.out.println(actual);
			
			actual.getNeighbours().forEach(v -> {
				if (!v.isVisited()) {
					v.setVisited(true);
					queue.add(v);
				}
			});
		}
	}
}
