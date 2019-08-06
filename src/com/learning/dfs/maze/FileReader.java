package com.learning.dfs.maze;

import java.io.File;
import java.util.Scanner;

public class FileReader {

	private String fileName;
	private int[][] map;
	private int numOfRows;
	private int numOfCols;
	private int startIndexRow;
	private int startIndexCol;
	
	public FileReader(String fileName, int numOfRows, int numOfCols) {
		this.fileName = fileName;
		this.numOfRows = numOfRows;
		this.numOfCols = numOfCols;
		this.map = new int[numOfRows][numOfCols];
	}
	
	public void parseFile() {
		
		try {
			Scanner scanner = new Scanner(new File(this.fileName));
			
			for (int i = 0; i < numOfRows; i++) {
				for(int j = 0; j < numOfCols; j++) {
					map[i][j] = scanner.nextInt();
					
					if(map[i][j] == 2) {
						this.setStartIndexRow(i);
						this.setStartIndexCol(j);
					}
				}
			}
			scanner.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public int[][] getMap() {
		return map;
	}

	public void setMap(int[][] map) {
		this.map = map;
	}

	public int getNumOfRows() {
		return numOfRows;
	}

	public void setNumOfRows(int numOfRows) {
		this.numOfRows = numOfRows;
	}

	public int getNumOfCols() {
		return numOfCols;
	}

	public void setNumOfCols(int numOfCols) {
		this.numOfCols = numOfCols;
	}

	public int getStartIndexRow() {
		return startIndexRow;
	}

	public void setStartIndexRow(int startIndexRow) {
		this.startIndexRow = startIndexRow;
	}

	public int getStartIndexCol() {
		return startIndexCol;
	}

	public void setStartIndexCol(int startIndexCol) {
		this.startIndexCol = startIndexCol;
	}
	
	
	
}
