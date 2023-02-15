package com.neotech.lesson13;

public class Homework1b {
	public static void main(String[] args) {

		/*
		 * 2. Create a 2D array that first row will contain 4 names and second row will
		 * contain grades, all Strings. Then you program should print name of the
		 * students that has A and B grade
		 * 
		 */
		String[][] namesGrades = { { "Ayse", "Omer", "Ihsan", "Zeynep" }, { "A", "B", "A", "C" } };

		for (int i = 0; i < namesGrades[1].length; i++) {

			if (namesGrades[1][i].equals("A") || namesGrades[1][i].equals("B")) {
				System.out.println(namesGrades[0][i] + " " + namesGrades[1][i]);
			}

		}

	}

}
