package com.epam.ProxyPattern;

public class Client {
	private Internet internet;
	public Client()
	{
		
	}
	public void connectTo(String website)
	{
		internet = new Internet_Info();
		try
		{
			internet.connectTo(website);
		} catch (Exception e)
		{
			e.printStackTrace();
			e.getMessage();
		}
	}
}