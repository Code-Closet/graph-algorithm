package com.learning.bfs.sample;

public class App {

	public static void main(String[] args) {		

		BFS bfs = new BFS();
		
		Vertex vertex1 = new Vertex(1);
		Vertex vertex2 = new Vertex(2);
		Vertex vertex3 = new Vertex(3);
		Vertex vertex4 = new Vertex(4);
		Vertex vertex5 = new Vertex(5);
		
		vertex1.addNeighbours(vertex2);
		vertex1.addNeighbours(vertex3);
		
		vertex2.addNeighbours(vertex4);
		vertex3.addNeighbours(vertex5);
		
		bfs.bfs(vertex1);
	}

}
