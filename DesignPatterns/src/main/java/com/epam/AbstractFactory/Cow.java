package com.epam.AbstractFactory;

public class Cow implements Animals{
	private String name;
	public Cow()
	{
		this.name = "Cow";
		
	}
	
	public void type() {
		System.out.println("Cow is a herbivore.");
	}
	public void typeOfSound() {
		System.out.println("Cow moos. ");
	}
	public void seenIn() {
		System.out.println("Cows are domesticated animals.They are usually "
									+ "seen at farms,rural,agriculteral lands,etc.");
	}
}