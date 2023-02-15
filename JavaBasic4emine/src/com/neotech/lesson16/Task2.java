package com.neotech.lesson16;

public class Task2 {

	public static void main(String[] args) {

		/*
		 * Create a String and if the String is not empty perform the following: - if
		 * the String has an odd number of characters and has 3 or more characters,
		 * print the character in the middle of the String.
		 */

		String str = "Mustafa      Kilic";

		if (!str.isEmpty()) // if the String is not empty
		{
			int length = str.length();

			if (length % 2 == 1 && length >= 3)// if the String has an odd number of characters and has 3 or more
												// characters
			{
				System.out.println(str.charAt(length / 2));// print the character in the middle of the String
			} else // length is even or less than 3
			{
				System.out.println("Either the length is even or less than 3!!");
			}
		} else // the string is empty
		{
			System.out.println("The string is empty!!!");
		}

	}

}
