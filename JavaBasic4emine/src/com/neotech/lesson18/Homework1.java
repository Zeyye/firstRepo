package com.neotech.lesson18;

public class Homework1 {
	public static void main(String[] args) {
		/*
		 * Homework 1: Create a String and print it in reverse order (Sunday → yadnuS).
		 * Solve it using charAt(), toCharArray() and reverse() methods. Note: for
		 * charAt() and toCharArray() use String for reverse you have to declare a
		 * StringBuffer object
		 */

		String str = "Sunday";

		// 1st way of using charAt()

		// System.out.println(str.charAt(0));

		for (int i = str.length() - 1; i >= 0; i--) {
			char c = str.charAt(i);
			System.out.print(c);

		}

		System.out.println("================");

		// 2nd way of to charArrat()

		char[] charArray = str.toCharArray();

		for (int i = str.length() - 1; i >= 0; i--) {
			char c = charArray[i];
			System.out.print(c);
		}
		System.out.println();

		// 3rd way by using reverse ()method of StringBuffer

		StringBuffer strBuffer = new StringBuffer(str);

		strBuffer.reverse();

		System.out.println(strBuffer);

		System.out.println();

		// 4th way by using reverse ()method of StringBuilder

		StringBuilder strBuilder = new StringBuilder(str);

		strBuilder.reverse();

		System.out.println(strBuilder);

	}

}
