package com.neotech.lesson09;

import java.util.Scanner;

public class Homework1b {
	public static void main(String[] args) {

		// 2. Write a program that asks user to enter his/her username and password
		// until user enters them correctly.

		String userName = "emine";
		String password = "1234";

		Scanner scan = new Scanner(System.in);

		do {
			System.out.println("Please enter your user name and password!");

			userName = scan.next();
			password = scan.next();
		} while (!userName.equals(userName) || !password.equals(password));

		System.out.println("You are logged in!");

	}
}