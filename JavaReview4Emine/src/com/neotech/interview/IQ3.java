package com.neotech.interview;

import java.util.Arrays;

public class IQ3 {
	public static void main(String[] args) {

		// Silly way

		System.out.println("1,1,2,5,8,13,21");

		// 1st way

		int num1 = 1;
		int num2 = 1;
		int next;

		for (int i = 1; i <= 10; i++) {
			System.out.print(num1 + ",");
			next = num1 + num2;// find the next number
			num1 = num2;// shift num1
			num2 = next;// shift num2
		}
		System.out.println("\n===================");

		// 2nd way

		int a = 1;
		int b = 1;

		for (int i = 1; i <= 10; i++) {
			System.out.print(a + ", ");
			// shift numbers
			b = b + a;
			a = b - a;

		}
		System.out.println("\n===================");
		// 3rd way, using an array

		int[] arr = new int[10];

		arr[0] = 1;
		arr[1] = 1;

		for (int i = 2; i < arr.length; i++) {
			arr[i] = arr[i - 1] + arr[i - 2];
		}
		System.out.println(Arrays.toString(arr));
	}

}
