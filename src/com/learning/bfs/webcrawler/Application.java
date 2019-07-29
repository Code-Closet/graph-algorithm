package com.learning.bfs.webcrawler;

public class Application {

	public static void main(String[] args) {
		
		Crawler crawler = new Crawler();
		crawler.discoveredWeb("https://www.visualiq.com");

	}

}
