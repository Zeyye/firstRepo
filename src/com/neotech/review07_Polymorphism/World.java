package com.neotech.review07_Polymorphism;

public class World {

	public static void main(String[] args) {
		Human.planet = "Earth";

		Human h1 = new Human();
		System.out.println(h1.name + " lives in " + Human.planet);

		Human h2 = new Human("Fatihcan");
		System.out.println(h2.name + " lives in " + Human.planet);

		Human.planet = "Mars"; // We are sending everyone to Mars
		System.out.println(h2.name + " lives in " + Human.planet);

		// Declaring a variable of type Human
		Human h3;
		// Creating an Albanian and assigning to h3
		h3 = (Human) new Albanian("Betim"); // Up-casting

		System.out.println(h3.name + " lives in " + Human.planet);

		Human h4 = new Turkish("Oktay"); // up-casting, automatically

	}
}
