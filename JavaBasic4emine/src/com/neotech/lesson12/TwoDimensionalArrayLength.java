package com.neotech.lesson12;

public class TwoDimensionalArrayLength {

	public static void main(String[] args) {

		String[][] months = {

				{ "December", "January", "February" }, // row 0
				{ "March", "April", "May" }, // row1
				{ "June", "July", "August" }, // row2
				{ "September", "October", "November" }// row3
		};

		System.out.println(months.length);// you get the number of rows

		int rowCount = months.length;
		System.out.println("There are a total of " + rowCount + " rows");

		int lenghtOfRowIndex1 = months[1].length;
		System.out.println(lenghtOfRowIndex1 + " columns");

	}

}
