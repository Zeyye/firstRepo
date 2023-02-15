package com.neotech.lesson16;

public class Task1 {

	public static void main(String[] args) {
		/*
		 * Create a String and print it in reverse order (Sunday → yadnuS). //combine
		 * for loop with charAt()
		 */

		String sun = "Sunday";

		String reverse = "";

		// first loop: get y and add it to reverse y
		// second loop: get a and add it to the reverse ya
		// yad
		for (int i = sun.length() - 1; i >= 0; i--) // for(int i = 0; i < sun.length;i++)
		{
			reverse += sun.charAt(i);
		}

		System.out.println(reverse);

	}

}
