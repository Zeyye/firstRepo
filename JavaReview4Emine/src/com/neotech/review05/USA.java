package com.neotech.review05;

public class USA {
	// Access Modifiers, we define where variable/methods can be accessed from
	private String CapitalCity = "Washington DC";
	protected String mainState = "New York";
	String normalState = "Texas";
	public String bestSchool = "NeoTech";

	public static void main(String[] args) {

		USA us = new USA();

		System.out.println("Accessing the variables from inside USA");

	}

}
