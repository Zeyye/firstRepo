package com.neotech.review07_Polimorphism;

//Every class by default extends the Object class
public class Human {

	String name;// instance variable
	static String planet;// class variable

	public Human() {
		// super();
		System.out.println("A human is being created!");
	}

	public Human(String name) {
		this();
		this.name = name;

	}
	// behavior/method

	public void talk() {
		System.out.println("Every human talk!");
	}

}
