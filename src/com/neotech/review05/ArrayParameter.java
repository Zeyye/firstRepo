package com.neotech.review05;

import java.util.Arrays;

public class ArrayParameter {

	public static void main(String[] args) {

		int[] array = { 7, 3, 5, 9, 8 };

		// To print one element with index 2
		// System.out.println(array[2]);

		// Print the array using Arrays.toString(array) method
		String str = Arrays.toString(array);
		System.out.println(str);

		ArrayParameter ap = new ArrayParameter();

		int result = ap.largestNumber(array);
		System.out.println("The largest number in the array is -> " + result);
	}

	public int largestNumber(int[] arr) {
		int largest = arr[0];

		for (int el : arr) {
			if (el > largest) {
				largest = el;
			}
		}

		return largest;
	}

}
