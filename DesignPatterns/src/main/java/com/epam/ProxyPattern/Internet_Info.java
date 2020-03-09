package com.epam.ProxyPattern;

import java.util.ArrayList;

public class Internet_Info implements Internet{
	private ArrayList<String> banned_websites;
	public Internet_Info()
	{
		banned_websites = new ArrayList<String>();
		banned_websites.add("www.pinterest.com");
		banned_websites.add("www.facebook.com");
		banned_websites.add("www.reddit.com");
		banned_websites.add("www.youtube.com");
	}
	
	
	public void connectTo(String website) throws Exception 
	{
		if(banned_websites.contains(website))
			System.out.println("Access Denied to "+website);  
		else
			System.out.println("Successfully connected to "+website);
	}
}
