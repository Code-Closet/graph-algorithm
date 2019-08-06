package com.learning.dfs.stack;

import java.util.Stack;

public class DFS {

	private Stack<Vertex> stack;

	public DFS() {
		this.stack = new Stack<>();
	}

	public void dfsWithStack(Vertex root) {

		this.stack.add(root);
		while(!stack.isEmpty()) {
			Vertex actualVertex = this.stack.pop();
			System.out.println(actualVertex + "");
			actualVertex.setVisited(true);
			for(Vertex v : actualVertex.getNeighbourVertices()) {
				if(!v.isVisited()) {
					v.setVisited(true);
					this.stack.push(v);
				}
			}
			
		}
	}
	
	public void dfsReccursive(Vertex v) {
		System.out.println(v + "");
		v.setVisited(true);
		for (Vertex vertex: v.getNeighbourVertices()) {
			if (!vertex.isVisited()) {
				dfsReccursive(vertex);
			}
		}
	}

}
