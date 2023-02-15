package com.neotech.lesson19;

public class Task1Demo {

	public static void main(String[] args) {

		// can we access it by using class name? NO

		Task1 obj = new Task1();

		int[] arr = { 34, 56, 66, 4 };

		int sum = obj.sum(arr);

		System.out.println(sum);

	}

}
