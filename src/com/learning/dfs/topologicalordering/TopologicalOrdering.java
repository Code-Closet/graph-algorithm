package com.learning.dfs.topologicalordering;

import java.util.Stack;

public class TopologicalOrdering {

	private Stack<Vertex> stack;

	public TopologicalOrdering() {
		this.stack = new Stack<>();
	}

		
	public void dfs(Vertex v) {
		
		System.out.println(v + "");
		v.setVisited(true);
		
		for (Vertex vertex: v.getNeighbourVertices()) {
			if (!vertex.isVisited()) {
				dfs(vertex);
			}
		}
		this.stack.push(v);
	}
	
	public Stack<Vertex> getStack() {
		return this.stack;
	}

}
