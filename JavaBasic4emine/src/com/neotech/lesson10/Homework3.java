package com.neotech.lesson10;

public class Homework3 {

	public static void main(String[] args) {
		// Print numbers from 1 to 50 except those that are divisible by 3
		// (3,6,9) will be skipped, because 6/3 = 2 and remainder is 0

		// 1st method - while loop
		int i = 1;
		while (i <= 50) {
			if (i % 3 == 0) {
				i++;
				continue;
			} else {
				System.out.print(i + " ");
			}

			i++;
		}

		System.out.println();

		// 2nd method - do while loop
		int j = 1;
		do {
			if (j % 3 == 0) {
				j++;
				continue;
			}

			System.out.print(j + " ");
			j++;

		} while (j <= 50);

		System.out.println();

		// 3rd method - for loop
		for (int k = 1; k <= 50; k++) {
			if (k % 3 == 0) {
				continue;
			}

			System.out.print(k + " ");
		}

	}

}
