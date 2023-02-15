package com.neotech.lesson13;

public class Homework1a {
	public static void main(String[] args) {

		/*
		 * 1. Create a 2D array where you will store the following values: - Mr, Mrs,
		 * Ms, Miss -Smith, Jordan, Jackson, Obama.
		 * 
		 * After storing values print the following: Mrs Smith, Mr Obama, Ms Jackson,
		 * Miss Jordan.
		 * 
		 * Be careful because they are mixed.
		 */

		String[][] arr = { { "Mr", "Mrs", "Ms", "Miss" }, { "Smith", "Obama", "Jackson", "Jordan" } };

		System.out.println(arr[0][1] + " " + arr[1][0]);
		System.out.println(arr[0][0] + " " + arr[1][1]);
		System.out.println(arr[0][2] + " " + arr[1][2]);
		System.out.println(arr[0][3] + " " + arr[1][3]);

	}

}
