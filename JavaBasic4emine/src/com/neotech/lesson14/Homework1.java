package com.neotech.lesson14;

public class Homework1 {

	public static void main(String[] args) {
		/*
		 * Homework 1: Create an array of countries: north America countries, south
		 * America countries, Europe countries, Asian countries, African countries. Then
		 * print all values from that array using 2 different loops and calculate how
		 * many total countries been stored.
		 */

		String[][] countries = { { "Canada", "USA", "Panama", "Jamaica" }, { "Brazil", "Colombia", "Argentina" },
				{ "France", "Italy", "Spain" }, { "Russia", "India", "Iran" },
				{ "Uganda", "Kenya", "Nigeria", "Senegal" } };
		int total = 0;
		for (int row = 0; row < countries.length; row++) {
			for (int col = 0; col < countries[row].length; col++) {
				System.out.print(countries[row][col] + " ");
				total++;
			}
			System.out.println();
		}
		System.out.println(total);

		System.out.println();

		System.out.println("USING A FOR EACH LOOP");
		int total2 = 0;
		for (String[] row : countries) {
			for (String country : row) {
				System.out.print(country + " ");
				total2++;
			}
			System.out.println();

		}
		System.out.println(total2);

	}

}
