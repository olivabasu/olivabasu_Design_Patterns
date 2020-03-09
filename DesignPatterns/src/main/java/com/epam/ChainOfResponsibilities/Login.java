package com.epam.ChainOfResponsibilities;

public class Login {
	private String userName;
	private String userPass;
	
	public Login(String userName, String userPass){
		this.userName = userName;
		this.userPass = userPass;
		LoginUser(userName,userPass);
	}
	
	
	
	private void LoginUser(String userName2, String userPass2) {
		validateCredentials(userName,userPass);
	}



	private void validateCredentials(String userName, String userPass) {
		
		if(userName.isEmpty())
			System.out.println("Please enter the User ID.\n");
		
		User user1  = new User();
		
		if(user1.userExists(userName))
		{
			validatePassword(userName,userPass);
		}
		else
			System.out.println("User ID not found!");
	}
	
	private void validatePassword(String userName, String password) {
		Password_Validation passwordValidator  = new Password_Validation();
		if(passwordValidator.isMappedTo(userName, password))
			System.out.println("Congratulations "+userName+"!You have successfully logged in.");
		else
				System.out.println("Invalid password!");
	}
}