package com.neotech.review07_Polimorphism;

public class American extends Human {

	// Task until 1:03
	// Create a class for your country (for example Cambodian)
	// Override the talk method
	// Add a method (only for Cambodian people)

	String SSN;

	public American(String name, String SSN) {
		super(name);
		this.SSN = SSN;

	}

	public void talk() {
		System.out.println("i SPEAK ENGLISH.mY NAMEIS " + name);
	}

	public void taxReturn() {
		System.out.println("I am doing taxes!");
	}

}
