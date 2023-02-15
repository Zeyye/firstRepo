package com.neotech.review07_Polimorphism;

public class Wolrd {
	public static void main(String[] args) {

		Human.planet = "Earth";

		Human h1 = new Human();//
		System.out.println(h1.name + " lives on " + Human.planet);

		Human h2 = new Human("Emine");
		System.out.println(h2.name + " lives on " + Human.planet);

		Human.planet = "Mars";// we are sending everybody mars
		System.out.println(h2.name + " lives on " + Human.planet);

		Human h3;// Declaring a variable of type human

		h3 = new Albanian("Betim");// Creating an Albanian and assigning to h3====>Up-casting

		Human h4 = new Turkish("Oktay");// Up-casting. automatically

		// creat a turkish and assign human

		System.out.println("Let us make people talk, by giving money!");

		h1.talk();
		h2.talk();
		h3.talk();
		h4.talk();

		// h4.baklava();Compile error / is not working we have to down-cast

	}

}
