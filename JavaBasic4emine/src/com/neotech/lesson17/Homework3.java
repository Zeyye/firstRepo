package com.neotech.lesson17;

import java.util.Scanner;

public class Homework3 {
	public static void main(String[] args) {
		/*
		 * Homework 3: Write a program that reads two parent's first names and if they
		 * expecting boy or girl? Based on the input suggests a name for a baby: If it
		 * is a boy get half from dad and half from mom. If it is a girl get half from
		 * mom and half from dad. Example Output: Mom's first name? Mary Dad's first
		 * name? Daniel Boy or Girl? boy Suggested baby name: DANRY Example Output:
		 * Mom's first name? Mary Dad's first name? Daniel Boy or Girl? girl Suggested
		 * baby name: MAIEL
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter the dad's name");
		String dadsName = scan.next();

		System.out.println("Please enter the mom's name!");
		String momsName = scan.next();

		System.out.println("Please enter the baby's gender!");
		String gender = scan.next();

		if (gender.equalsIgnoreCase("boy")) {
			String name = dadsName.substring(0, dadsName.length() / 2)
					.concat(momsName.substring(momsName.length() / 2, momsName.length()));
			System.out.println("Baby name is: " + name.toUpperCase());
		} else if (gender.equalsIgnoreCase("girl")) {
			String name1 = momsName.substring(0, momsName.length() / 2)
					.concat(dadsName.substring(dadsName.length() / 2, dadsName.length()));
			System.out.println("Baby name is: " + name1.toUpperCase());
		} else {
			System.out.println("Invalid DATA!");
		}

	}
}
