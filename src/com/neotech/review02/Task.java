package com.neotech.review02;

import java.util.Scanner;

public class Task {

	// Break + Task -> Breask until 12:30
	// Ask the user to enter a positive number and add it to the total
	// He should enter -1 to STOP. -1 will not be added to the total

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int num = 0;
		int total = 0;

//		System.out.println("Please enter a positive number! To STOP enter -1");
//		num = scan.nextInt();
//
//		while (num != -1) {
//			total += num;
//
//			System.out.println("Please enter a positive number! To STOP enter -1");
//			num = scan.nextInt();
//		}
//
//		System.out.println("Total = " + total);

//		do {
//			System.out.println("Please enter a positive number! To STOP enter -1");
//			num = scan.nextInt();
//			
//			if (num != -1) {
//				total += num;
//			}
//
//		} while (num != -1);
//
//		System.out.println("Total = " + total);

		// 1st iteration -> 1. initialization; 2. check condition
		// Next iterations -> 1. increment; 2. check condition
//		for (int i = 1; i <= 3; i++) {
//			System.out.println(i);
//		}

		System.out.println("Please enter a positive number! To STOP enter -1");
		num = scan.nextInt();

		for (; num != -1;) {
			total += num;

			System.out.println("Please enter a positive number! To STOP enter -1");
			num = scan.nextInt();
		}

		System.out.println("Total = " + total);

	}

}
