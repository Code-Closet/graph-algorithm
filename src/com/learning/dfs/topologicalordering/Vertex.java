package com.learning.dfs.topologicalordering;

import java.util.ArrayList;
import java.util.List;

public class Vertex {

	public String data;
	public boolean isVisited;
	public List<Vertex> neighbourVertices;

	public Vertex(String data) {
		super();
		this.data = data;
		this.neighbourVertices = new ArrayList<>();
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public boolean isVisited() {
		return isVisited;
	}

	public void setVisited(boolean isVisited) {
		this.isVisited = isVisited;
	}

	public List<Vertex> getNeighbourVertices() {
		return neighbourVertices;
	}

	public void setNeighbourVertices(List<Vertex> neighbourVertices) {
		this.neighbourVertices = neighbourVertices;
	}

	public void addNeighbourVertex(Vertex v) {
		this.neighbourVertices.add(v);
	}

	@Override
	public String toString() {
		return this.data;
	}

}
