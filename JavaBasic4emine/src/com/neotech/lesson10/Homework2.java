package com.neotech.lesson10;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
//SHANE
		// write a program that asks user to his user name and password correctly

		// how do we decide
		// for or while or do while
		// for loop is more useful for countable number of loops
		// here DO WHILE seems more suitable

		Scanner scan = new Scanner(System.in);

		String password = "1234";
		String userName = "emine";

		String userNameInput;
		String passwordInput;

		do {
			System.out.println("please enter user name and password:");
			userNameInput = scan.next();
			passwordInput = scan.next();

			if (userNameInput.equals(userName) && passwordInput.equals(password)) {

				System.out.println("You are looged in!");
				break;
			} else {
				System.out.println("Invalid DATA!");
			}

		} while (userNameInput != userName || passwordInput != password);

	}

}
