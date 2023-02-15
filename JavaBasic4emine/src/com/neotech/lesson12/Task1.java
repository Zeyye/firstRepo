package com.neotech.lesson12;

public class Task1 {

	public static void main(String[] args) {
		// Create an array of countries.
		// While retrieving all values from an array print capital for each country.
		// (use 2 different loops).

		String[] countries = { "Turkey", "USA", "Albania" };

		// using for loop
		for (int i = 0; i < countries.length; i++) {
			String country = countries[i];
			if (country.equals("Turkey")) {
				System.out.println("Ankara");
			} else if (country.equals("USA")) {
				System.out.println("Washington DC");
			} else if (country.equals("Albania")) {
				System.out.println("Tirana");
			} else {
				System.out.println("No country");
			}
		}

		System.out.println("----------------");
		// using for-each loop
		for (String country : countries) {
			if (country.equals("Turkey")) {
				System.out.println("Ankara");
			} else if (country.equals("USA")) {
				System.out.println("Washington DC");
			} else if (country.equals("Albania")) {
				System.out.println("Tirana");
			} else {
				System.out.println("No country");
			}
		}

	}

}
