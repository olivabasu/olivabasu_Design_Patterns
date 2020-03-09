package com.epam.ChainOfResponsibilities;

import java.util.HashMap;

   public class User {
	protected HashMap<String,String> user;
	public User(){
		user = new HashMap<String,String>();
		user.put("Raina","raina93");
		user.put("Arjun","arjunrocks12");
		user.put("Rohan","iamrohan");
		user.put("Preeti","preeti98");
	}
	public Boolean userExists(String user_v) {
		return user.containsKey(user_v);
	}
	public Boolean SignWithEmailAndPassword(String uname, String upass) {
		if( upass == (user.get(uname)))
			return true;
		
		return false;
	}
}
  
   