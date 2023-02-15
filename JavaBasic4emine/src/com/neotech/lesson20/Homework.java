package com.neotech.lesson20;

public class Homework {

	/*
	 * Homework 1: Create a method that will accept a String as a parameter and
	 * return a new String that consist only of vowels. Method should be available
	 * inside the class where it was declared and executed by calling it is name.
	 */

	public static String vowels(String str) {
		String str1 = str.replaceAll("[^aeiou]", "");
		return str1;
	}

	public static void main(String[] args) {

		String result = "Today is a happy day!";

		System.out.println(Homework.vowels(result));

	}

}