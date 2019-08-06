package com.learning.dfs.cycledetection;

import java.util.Arrays;

public class App {

	public static void main(String[] args) {

		Vertex v1 = new Vertex("1");
		Vertex v2 = new Vertex("2");
		Vertex v3 = new Vertex("3");
		Vertex v4 = new Vertex("4");
		Vertex v5 = new Vertex("5");
		Vertex v6 = new Vertex("6");
		
		v1.addVertex(v2);
		v2.addVertex(v3);
		v3.addVertex(v1);
		v1.addVertex(v4);
		v4.addVertex(v5);
		v5.addVertex(v6);
		v6.addVertex(v4);
		
		CycleDetection cycleDetection = new CycleDetection();
		cycleDetection.cycleDetection(Arrays.asList(v1,v2,v3,v4,v5,v6));
	}

}
