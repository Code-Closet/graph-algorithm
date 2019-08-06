package com.learning.dfs.stack;

public class App {

	public static void main(String[] args) {
		
		Vertex v1 = new Vertex("1");
		Vertex v2 = new Vertex("2");
		Vertex v3 = new Vertex("3");
		Vertex v4 = new Vertex("4");
		Vertex v5 = new Vertex("5");
		
		v1.addNeighbourVertex(v2);
		v1.addNeighbourVertex(v3);
		v2.addNeighbourVertex(v4);
		v3.addNeighbourVertex(v5);
		
		DFS dfs = new DFS();
		//dfs.dfsWithStack(v1);
		System.out.println("\n\n");
		dfs.dfsReccursive(v1);
	}

}
