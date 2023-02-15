package com.neotech.lesson16;

import java.util.Scanner;

public class Homework1Test {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter your first name: ");
		String fName = scan.next();

		System.out.println("Please enter your last name: ");
		String lName = scan.next();

		System.out.println("Please enter your email type: ");
		String eType = scan.next();

		Homework1 hw = new Homework1();

		// to show that this is a two step process
		// declaring an object of Homework1
		Homework1 hw1;
		// creating an object
		new Homework1();

		String fullEmail = hw.createEmail(fName, lName, eType);

		System.out.println("The full email is " + fullEmail);

	}

}
