package com.neotech.review01;

public class VariableDemo {

	public static void main(String[] args) {

		// declaring variable

		String firstName;

		// System.out.println("My first name is " + firstName);

		// initializing the value

		firstName = "emine";

		System.out.println("My first name is  " + firstName);

		// declare and assign the value

		String lastName = "atalay";

		System.out.println(lastName);

		int age = 45;

		System.out.println(firstName + " " + lastName + " " + age);

		System.out.println(firstName + " " + lastName + " " + (age + 1));

		age += 5;

		System.out.println(age);

		lastName = "emir";

		System.out.println(lastName);

	}

}
