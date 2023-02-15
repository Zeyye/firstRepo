package com.neotech.lesson08;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {

		/*
		 * Homework 2
		 * 
		 * Using scanner class to create a calculator. Allow user to enter 2 numbers and
		 * operator(+,-,*,/). Based on operator provide the result to user.
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter the first number!");

		int num1 = scan.nextInt();
		System.out.println("Please enter the second number!");
		
		int num2 = scan.nextInt();

		System.out.println("Please enter the operator(+, -, /, *)");
		char operator = scan.next().charAt(0);

		if (operator == '-') {
			System.out.println(num1  -  num2);

		} else if (operator == '+') {
			System.out.println(num1 + num2);

		} else if (operator == '/') {
			System.out.println(num1 / num2);

		} else if (operator == '*') {
			System.out.println(num1 * num2);

		} else {
			System.out.println("Invalid operator!");
		}

	}

}
