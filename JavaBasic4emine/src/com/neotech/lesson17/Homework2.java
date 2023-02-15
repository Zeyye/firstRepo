package com.neotech.lesson17;

public class Homework2 {
	public static void main(String[] args) {
		/*
		 * Homework 2: Create a String that should be combination of letters, numbers
		 * and special characters. Find out how many alpha characters are there in the
		 * String. (alpha characters means letters)
		 */

		String str = new String();

		str = "   5 days* @ the  with the # 304.";
		int count = 0;

		System.out.println("String: " + str);
		for (int i = 0; i < str.length(); i++) {
			if (Character.isLetter(str.charAt(i)))
				count++;
		}
		System.out.println("Letters: " + count);

	}
}