package com.neotech.lesson08;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		/*
		 * Homework 1
		 * 
		 * Allow user to enter grade and then provide explanation: A-Excellent, B-Good,
		 * C-Average, D-Bad, any other grade --> Not Acceptable. At the end your program
		 * should print which grade was entered by a user with explanation.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your grade!");

		char grade = scan.nextLine().charAt(0);

		System.out.println(grade);

		if (grade == 'A') {
			System.out.println("Your grade is " + grade + " excellent!");

		} else if (grade == 'B') {
			System.out.println("Your grade is " + grade + " good!");
		} else if (grade == 'C') {
			System.out.println("Your grade is " + grade + " average!");
		} else if (grade == 'D') {
			System.out.println("Your grade is " + grade + " bad!");
		} else {
			System.out.println("NOT acceptable!");
		}

	}
}