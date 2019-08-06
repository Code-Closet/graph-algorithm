package com.learning.dfs.cycledetection;

import java.util.ArrayList;
import java.util.List;

public class Vertex {

	private String name;
	private boolean visited;
	private boolean beignVisited;
	private List<Vertex> adjacentVertices;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isVisited() {
		return visited;
	}
	public void setVisited(boolean visited) {
		this.visited = visited;
	}
	public boolean isBeignVisited() {
		return beignVisited;
	}
	public void setBeignVisited(boolean beignVisited) {
		this.beignVisited = beignVisited;
	}
	public List<Vertex> getAdjacentVertices() {
		return adjacentVertices;
	}
	public void setAdjacentVertices(List<Vertex> adjacentVertices) {
		this.adjacentVertices = adjacentVertices;
	}
	public Vertex(String name) {
		this.name = name;
		this.adjacentVertices = new ArrayList<>();
	}
	public void addVertex(Vertex v) {
		this.adjacentVertices.add(v);
	}
	@Override
	public String toString() {
		return this.name;
	}
	
	
}
