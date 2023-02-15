package com.neotech.lesson26;

public class Employee {

	private String name;
	private int age;
	private double salary;

	// we define getters and setters

	// I want to provide a method that allows users of this class to get the Name

	// getter:has a return type

	public String getName() {
		return name;

	}
	// I want to provide a method that allows users of this class to set the Name
	// setter:no return type, needs argument

	public void setName(String name) {

		this.name = name;
	}

}
