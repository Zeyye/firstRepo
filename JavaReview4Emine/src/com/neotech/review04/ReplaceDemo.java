package com.neotech.review04;

public class ReplaceDemo {

	public static void main(String[] args) {
		String longStr = "I am very happy today because today is not Monday.";

		String anotherStr = longStr.replace('a', 'e');
		System.out.println(anotherStr);

		anotherStr = longStr.replace("today", "tomorrow");
		System.out.println(anotherStr);

		System.out.println("--------------------------------");

		// Regular expression
		anotherStr = longStr.replaceAll("[a-z]", "*");
		System.out.println(anotherStr);

		String ssn = "131-45-9723";
		String newSSN = ssn.replaceAll("[3-7]", "*");
		System.out.println(newSSN);

		System.out.println("Let's remove the dashes from ssn");
		String numbers = ssn.replace("-", "");
		System.out.println(numbers);

		// A task for hard working students
		// Hide all the numbers and leave the last four digits of ssn
		// ***-***-8745

	}
}
