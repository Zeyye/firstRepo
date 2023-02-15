package com.neotech.lesson15;

public class MathClass {

	public static void main(String[] args) {

		Calculator cal = new Calculator();

		System.out.println("Addition");

		cal.add(5, 8);
		cal.add(18, 9);
		cal.add(7, 8);

		System.out.println("Multply");

		cal.multiply(7, 9);
		cal.multiply(7, 2);
		cal.multiply(12, 120);

		System.out.println("Division");

		cal.divide(120, 4);
		cal.divide(45, 9);
		cal.divide(15, 5);
		cal.divide(3, 0);

	}

}
