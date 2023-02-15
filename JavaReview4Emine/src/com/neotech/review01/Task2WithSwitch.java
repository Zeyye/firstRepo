package com.neotech.review01;

import java.util.Scanner;

public class Task2WithSwitch {
	public static void main(String[] args) {

		// Ask the user enter two numbers
		// Ask the user for the operator (+,-,/,*)
		// Solve it using if-else AND using switch

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter the first number!");

		double d1 = scan.nextDouble();// --->this is for reading from the console

		System.out.println("Please enter the second number!");
		double d2 = scan.nextDouble();

		// System.out.println(d1 + "-" + d2);
		System.out.println("Please enter the operator (+,-,/,*)!");
		String operator = scan.next();

		double result = 0;

		switch (operator) {
		case "+":
			result = d1 + d2;
			break;
		case "-":
			result = d1 - d2;
			break;
		case "*":
			result = d1 * d2;
			break;
		case "/":
			result = d1 / d2;
			break;
		default:
			System.out.println("invalid operator");
			break;
		}
		

	}

}
