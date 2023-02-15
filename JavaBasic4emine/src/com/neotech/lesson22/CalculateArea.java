package com.neotech.lesson22;

public class CalculateArea {

	/*
	 * Create a class named CalculateArea in which you should create three methods
	 * (with the same name )that will calculate the area (volume) of - Rectangle -
	 * Square - Box Use a separate class to test your code
	 */

	static int calculate(int a) {

		System.out.println("The area of rectangular is:   ");
		return a * a;
	}

	static int calculate(int a, int b) {
		return a * b;
	}

	static int calculate(int a, int b, int c) {

		return a * b * c;
	}
}
