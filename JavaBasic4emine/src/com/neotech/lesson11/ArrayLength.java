package com.neotech.lesson11;

public class ArrayLength {
	public static void main(String[] args) {

		// arrays:collections of same type of data

		String name = "Sabah";
		String name2 = new String("Sabah");

		String[] students = new String[5];

		// default value for String is NULL

		students[0] = "Fatihcan";

		students[1] = "Oguzhan";

		students[2] = "emine";

		students[3] = "Ayse";

		students[4] = "Omer";

		// How do we get the lenght?

		int arrayLenght = students.length;

		System.out.println("The lenght of the studets array is: " + arrayLenght);

		// Another way how to declare an array

		int[] scores = { 90, 78, 100, 90 };

		System.out.println("The lenght of the studets array is: " + scores.length);

	}

}
