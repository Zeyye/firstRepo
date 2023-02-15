package com.neotech.review04;

public class World {

	public static void main(String[] args) {
		// declaring and assigning a variable

		Baby baby1 = new Baby();

		baby1.name = "Pedro";

		baby1.gender = 'M';

		baby1.weight = 18;

		System.out.println("The name of the baby1 is " + baby1.name);
		System.out.println("The hair color of the baby1 is " + baby1.hairColor);

		baby1.hairColor = "Black";

		baby1.gender = 'M';
		System.out.println("The hair color of the baby1 is " + baby1.hairColor);

		// declaring and assigning a variable
		Baby baby2;

		// System.out.println("The name of the baby1 is " + baby2.name);

		baby2 = new Baby();
		baby2.name = "Emine";
		baby2.gender = 'F';
		baby2.hairColor = "Blond";
		baby2.weight = 12;

		baby2.cry();
		baby2.eat();
		baby2.talk();

		System.out.println("The hair color of baby1 " + baby1.hairColor);
		System.out.println("Tha hair color of baby2 " + baby2.hairColor);

		baby1.talk();
		baby2.talk();
		baby1.displayInfo();
		baby2.displayInfo();

	}

}
