package com.learning.dfs.maze;

public class MazeSolver {
	
	private int[][] mazeMap;
	private boolean[][] visited;
	private int startIndexRow;
	private int startIndexCol;
	
	public MazeSolver(int[][] mazeMap, int startIndexRow, int startIndexCol) {
		this.mazeMap = mazeMap;
		this.visited = new boolean [mazeMap.length][mazeMap.length];
		this.startIndexRow = startIndexRow;
		this.startIndexCol = startIndexCol;
	}
	
	public void findWayOut() {
		try {
			dfs(startIndexRow, startIndexCol, "START", "");
			System.out.println("No solution found");
		}catch(Exception e) {
			System.out.println("Route found to exit");
		}
	}

	private void dfs(int rowIndex, int colIndex, String direction, String route) {
		if(this.mazeMap[rowIndex][colIndex] == 3) {
			route += direction;
			System.out.println(route);
			throw new RuntimeException();
		}
		
		int endOfMap = this.mazeMap.length - 1;
		
		if(visited[rowIndex][colIndex] || rowIndex < 0 || rowIndex > endOfMap ||
				colIndex < 0 || colIndex > endOfMap || this.mazeMap[rowIndex][colIndex] == 1) {
			return;
		}else {
			route += direction + " ---> ";
			this.visited[rowIndex][colIndex] = true;
			
			if (rowIndex < endOfMap) this.dfs(rowIndex+1, colIndex, "DOWN", route);//going down
			if (colIndex < endOfMap) this.dfs(rowIndex, colIndex+1, "RIGHT", route);//going right
			if (colIndex > 0) this.dfs(rowIndex, colIndex-1, "LEFT", route);//going left
			if (rowIndex > 0) this.dfs(rowIndex-1, colIndex, "UP", route);//going up
		}
		
	}

}
