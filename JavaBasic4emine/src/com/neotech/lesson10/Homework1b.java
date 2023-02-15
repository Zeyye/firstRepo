package com.neotech.lesson10;

import java.util.Scanner;

public class Homework1b {
	public static void main(String[] args) {
		// 2. Write a program that asks user to enter his/her user name and password
		// until user enters them correctly.

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter your user name and password!");
		int password = 1234;
		// int password = scan.nextInt();
		String userName = scan.next();

		while (true) {
			System.out.println("You passed!");
		}

	}

}
