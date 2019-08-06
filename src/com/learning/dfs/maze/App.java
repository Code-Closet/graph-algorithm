package com.learning.dfs.maze;

public class App {

	public static void main(String[] args) {
		FileReader fileReader = new FileReader("C:\\Users\\sreekanth.pullat\\Personal\\Development\\maze.txt", 20, 20);
		fileReader.parseFile();
		MazeSolver mazeSolver = new MazeSolver(fileReader.getMap(), fileReader.getStartIndexRow(), fileReader.getStartIndexCol());
		mazeSolver.findWayOut();
	}

}
