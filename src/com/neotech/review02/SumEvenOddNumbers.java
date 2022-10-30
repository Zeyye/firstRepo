package com.neotech.review02;

public class SumEvenOddNumbers {
	// Add Even numbers
	// Also add Odd numbers
	// Also add All numbers
	// Between 1 && 50
	// Using for loop

	public static void main(String[] args) {
		int oddTotal = 0;
		int evenTotal = 0;
		int total = 0;

//		for (int i = 1; i <= 50; i++) {
//
//			if (i % 2 == 0) { // even
//				evenTotal += i;
//			} else { // odd
//				oddTotal += i;
//			}
//
//			total += i;
//		}
//		
//		System.out.println("The sum of even numbers -> " + evenTotal);
//		System.out.println("The sum of odd numbers -> " + oddTotal);
//		System.out.println("The sum of all numbers -> " + total);

		System.out.println("----Smarter way----");

		for (int i = 1; i <= 50; i++) {

			if (i % 2 == 0) {
				// even
				evenTotal += i;
			} else {
				// odd
				oddTotal += i;
			}

		}

		System.out.println("The sum of even numbers -> " + evenTotal);
		System.out.println("The sum of odd numbers -> " + oddTotal);
		System.out.println("The sum of all numbers -> " + (evenTotal + oddTotal));

	}

}
