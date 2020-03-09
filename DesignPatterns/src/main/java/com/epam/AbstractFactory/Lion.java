package com.epam.AbstractFactory;

public class Lion implements Animals{
	private String name;
	public Lion()
	{
		this.name="Lion is called King of the Jungle.";
		
	}
	
	public void type() {
		System.out.println("Lion is a carnivore.");
	}

	public void typeOfSound() {
		System.out.println("Lion Roars");
	}

	public void seenIn() {
		System.out.println("Lions can be seen in the jungle,zoos,circus, etc.");
	}
	
}