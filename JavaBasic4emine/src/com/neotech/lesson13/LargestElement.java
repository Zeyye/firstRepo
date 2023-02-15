package com.neotech.lesson13;

public class LargestElement {
	public static void main(String[] args) {

		// find the largest number in array

		int[] numbers = { 45, 34, 900, 87, 33, 15, 55, 93, 233 };

		// 1st way
		// int largest=-99999;

		int largest = numbers[0];

		for (int i = 0; i < numbers.length; i++) {
			// compare the current largest number with the new number that the loop gives us
			if (largest < numbers[i]) {
				largest = numbers[i];
			}
		}
		System.out.println("The largest number is: " + largest);
	}

}
