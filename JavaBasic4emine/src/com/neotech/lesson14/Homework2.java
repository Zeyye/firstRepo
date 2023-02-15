package com.neotech.lesson14;

public class Homework2 {
	public static void main(String[] args) {

		/*
		 * IQ
		 * 
		 * Write a java program to find the second largest number in the array? Maximum
		 * and minimum number in the array?
		 */

		int[] array = { -9, 8, 78, -123, 8976, 90, 67 };

		int smallest = array[0];
		int largest = array[0];
		int secondLargest = array[0];

		for (int i = 1; i < array.length; i++) {
			if (largest < array[i])
				largest = array[i];
		}
		int i = 0;
		if (smallest > array[i]) {
			smallest = array[i];
		}

		for (int row : array) {
			if (row > secondLargest && row < largest) {
				secondLargest = row;
			}

		}
		System.out.println("The largest: " + largest);

		System.out.println("The smallest: " + smallest);

		System.out.println("The second largest: " + secondLargest);

	}

}
