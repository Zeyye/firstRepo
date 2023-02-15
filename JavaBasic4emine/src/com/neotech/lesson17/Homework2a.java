package com.neotech.lesson17;

public class Homework2a {

	public static void main(String[] args) {
		/*
		 * Create a String that should be combination of letters, numbers and special
		 * characters. Find out how many alpha characters are there in the String.
		 * (alpha characters means letters)
		 */

		String str = "Hello123456@#$%#@)(^!#All4934935!";

		// [abc]
		// [a-c]
		// [^a-c]

		String str2 = str.replaceAll("[^a-zA-Z]", "");
		System.out.println(str2);
		System.out.println("How many alpha characters are there? " + str2.length());

		// what if we want to find out how many numbers are there?
		System.out.println(str.replaceAll("[^0-9]", "").length());

		// what if we want to find out how many special characters we have?
		System.out.println(str.replaceAll("[a-zA-Z0-9]", "").length());

		// typical issues
		String str3 = str.replaceAll("a-z", "-");// this is not a regex - a regular expression
		String str4 = str.replaceAll("[az]", ""); // this might not be what you expect -- only a and z

	}

}
