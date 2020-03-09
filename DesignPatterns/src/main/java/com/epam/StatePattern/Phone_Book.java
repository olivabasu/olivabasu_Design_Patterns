package com.epam.StatePattern;

import java.util.Scanner;

public class Phone_Book {
	private Boolean phoneState;
	Phone_Book(Boolean phoneState){
		this.phoneState = phoneState;
	}
	public Phone_Book(){
		this.phoneState = false;
	}
	
	public void call(String number) {
		if(this.phoneState == false)
		{
			System.out.println("Phone is locked.");
			changeState(number);
		}
		else
			System.out.println("Dailing "+number+"...");
	}
	
	private void changeState(String number) {
		if(this.phoneState == false) {
			System.out.println("Do you want to unlock the phone ?");
			Scanner sc = new Scanner(System.in);
			String state = "Yes";
			switch(state){
			case "Yes":
			{
				System.out.println("Yes\nPhone unlocked.");
				this.phoneState = true;
				call(number);
				break;
			}
			case "No":
			{
				System.out.println("Couldn't place call.");
				break;
			}
			
			}
		}
	}
}