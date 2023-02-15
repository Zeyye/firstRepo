package com.neotech.lesson09;

public class Homework1a {
	public static void main(String[] args) {
		// 1. Write a program using while loop that calculates the sum of the even
		// numbers between 0 and 10.

		int num = 0;
		int sum = 0;
		while (num <= 10) {

			if (num % 2 == 0) {
				sum += num;
			}

			num++;
		}
		System.out.println("The total is: " + sum);

	}

}
