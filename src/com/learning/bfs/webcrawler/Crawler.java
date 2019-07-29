package com.learning.bfs.webcrawler;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Crawler {
	
	private Queue<String> queue;
	private List<String> discoveredWebsiteList;
	
	public Crawler() {
		super();
		this.queue = new LinkedList<String>();
		this.discoveredWebsiteList = new ArrayList<String>();
	}
	
	public void discoveredWeb(String root) {
		queue.add(root);
		discoveredWebsiteList.add(root);
		
		while(!queue.isEmpty()) {
			String v = queue.remove();
			String rawHtml = readURL(v);
			
			String regex = "http://(\\w+\\.)*(\\w+)";			
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(rawHtml);
			
			while(matcher.find()) {
				String actualUrl = matcher.group();
				if (!discoveredWebsiteList.contains(actualUrl)) {
					discoveredWebsiteList.add(actualUrl);
					System.out.println("Website : " + actualUrl);
					queue.add(actualUrl);
				}
			}
			
		}
	}

	private String readURL(String v) {
		String rawHtml = "";
		try {
			
			URL url = new URL(v);
			BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
			
			String inputLine = "";
			
			while( (inputLine = in.readLine()) != null ) {
				rawHtml += inputLine;
			}
			in.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return rawHtml;
	}

}
