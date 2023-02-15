package com.neotech.lesson25;

public class ComputerTest {

	public static void main(String[] args) {

		Apple a = new Apple("Apple");

		HP hp = new HP("HP", "RED");

		Computer c1 = new Dell("Dell");// upcasting
		Computer c2 = new Lenovo("Lenovo");

		// arrays want same data type
		int[] array = { 3, 4, 5, 6 };
		Computer[] comArray = { c1, c2 };

		// Another way of creating array of computers
		Computer[] compArray2 = { new Dell("Dell"), new HP("HP", "rED") };

		for (Computer comp : compArray2) {
			System.out.println("The brand is " + comp.brand);
			comp.run();
		}

	}

}
