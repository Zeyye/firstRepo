package com.neotech.lesson17;

public class Homework1a {
	public static void main(String[] args) {

		/*
		 * Homework 1: Create a String that will hold a sentence. Write a program to get
		 * a new String without any spaces.
		 */

		String str = "We are leraning String methods!";

		String str2 = str.replace(" ", "");

		System.out.println("old--> " + str + " length " + str.length());
		System.out.println("new==>" + str2 + "lenght " + str2.length());

	}

}
