package com.neotech.lesson23;

public class Homework2 {

	/*
	 * Homework 2: Create a class with 3 overloaded static methods. Then call each
	 * overloaded methods with specific arguments and observe the results.
	 */
	static void info() {
		System.out.println("I love Java!");
	}

	static void info(String str) {
		System.out.println("I love " + str);
	}

	static void info(String str, int num) {
		System.out.println("I love " + str + " and studying since " + num);
	}

	static void info(String[] strArr) {
		System.out.println("Today is " + strArr[0] + " and the month is " + strArr[1]);
	}

	public static void main(String[] args) {

		Homework2.info();
		Homework2.info("Java");
		Homework2.info("Java", 2021);

		String[] strArr = { "Tuesday", "November" };
		info(strArr);

	}

}
