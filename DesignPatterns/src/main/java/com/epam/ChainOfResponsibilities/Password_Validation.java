package com.epam.ChainOfResponsibilities;

public class Password_Validation {
	private User user;
	
	public Password_Validation() {
		this.user = new User();
	}
	
	public Boolean isMappedTo(String userName, String password) {
			return this.user.SignWithEmailAndPassword(userName, password);
	}
}
