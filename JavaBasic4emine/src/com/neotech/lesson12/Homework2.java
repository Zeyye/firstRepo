package com.neotech.lesson12;

public class Homework2 {
	public static void main(String[] args) {

		/*
		 * Homework 2: Create an array on integers and calculate the sum of all elements
		 * in an array.
		 * 
		 * 
		 */

		int[] numbers = { 23, 45, 56, 56, 66, 90 };

		int sum = 0;

		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];

		}
		System.out.println(sum);

	}

}
