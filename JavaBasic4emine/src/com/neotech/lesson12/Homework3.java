package com.neotech.lesson12;

public class Homework3 {

	public static void main(String[] args) {

		/*
		 * Homework 3: Create an array of countries. While retrieving all values from an
		 * array print capital for each country.
		 * 
		 */

		String[] countries = { "USA", "Germany", "France" };

		for (String country : countries) {
			if (country.equals("USA")) {
				System.out.println("Washington DC");
			} else if (country.equals("Germany")) {
				System.out.println("Berlin");
			} else if (country.equals("France")) {
				System.out.println("Paris");
			} else {
				System.out.println("No country");
			}

		}
	}
}
