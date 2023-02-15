package com.neotech.lesson14;

public class DogShelter {

	public static void main(String[] args) {

		Dogs d2 = new Dogs();// ========>creating the object this should be under the main method
		// still using the dog class

		d2.breed = "Bulldog";// ========>features/properties
		d2.size = "Big";
		d2.color = "Black";

		d2.eat();// =============>methods
		d2.run();

	}

}
