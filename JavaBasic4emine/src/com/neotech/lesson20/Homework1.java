package com.neotech.lesson20;

public class Homework1 {

	/*
	 * Homework 1: Create a method that will accept a String as a parameter and
	 * return a new String that consist only of vowels. Method should be available
	 * inside the class where it was declared and executed by calling it is name.
	 */

//getVowels (String str)
	// input:String str
	// output:String result
	// access within class only:static

	private static String getVowels(String str) {

		// regex:
		// [a-f] - range
		// [abcd] - only these letters

		String result = str.replaceAll("[^aeiouAEIOU]", "");

		return result;// also we can use empty "" like this to get rid of the error message
		// you can also do this
		// return str.replaceAll("[^aeiouAEIOU]", "");

	}

	public static void main(String[] args) {

		System.out.println(getVowels("Good Evening"));

	}

}
