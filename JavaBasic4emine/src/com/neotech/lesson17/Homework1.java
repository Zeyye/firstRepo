package com.neotech.lesson17;

public class Homework1 {

	public static void main(String[] args) {
		/*
		 * Homework 1: Create a String that will hold a sentence. Write a program to get
		 * a new String without any spaces.
		 */

		String str = new String();

		str = "Today is Monday and first day of the week.";

		String str1 = str.replaceAll(" ", "");

		System.out.println(str1);

	}

}
