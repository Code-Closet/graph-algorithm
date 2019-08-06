package com.learning.dfs.topologicalordering;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class App {

	public static void main(String[] args) {
		
		Vertex v0 = new Vertex("0");
		Vertex v1 = new Vertex("1");
		Vertex v2 = new Vertex("2");
		Vertex v3 = new Vertex("3");
		Vertex v4 = new Vertex("4");
		Vertex v5 = new Vertex("5");
		
		v2.addNeighbourVertex(v3);
		v3.addNeighbourVertex(v1);
		v4.addNeighbourVertex(v1);
		v4.addNeighbourVertex(v0);
		v5.addNeighbourVertex(v0);
		v5.addNeighbourVertex(v2);
		List<Vertex> graph = Arrays.asList(v0, v1, v2, v3, v4, v5);
		
		TopologicalOrdering topologicalOrdering = new TopologicalOrdering();

		for (Vertex v : graph) {
			if (!v.isVisited()) {
				topologicalOrdering.dfs(v);
			}
		}
		
		Stack<Vertex> stacks = topologicalOrdering.getStack();
		for (int i = 0; i < graph.size(); i++) {
			Vertex ver = stacks.pop();
			System.out.println(ver);
		}
	}

}
