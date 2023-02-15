package com.neotech.lesson12;

public class TwoDimentionalArray {

	public static void main(String[] args) {

		int[][] numbers = new int[2][4];// [rows],[columns]

		// fill in the first row

		numbers[0][0] = 10;
		numbers[0][1] = 20;
		numbers[0][2] = 220;
		numbers[0][3] = 210;

		// fill the second row
		numbers[1][0] = 10;
		numbers[1][1] = 15;
		numbers[1][2] = 45;
		numbers[1][3] = 50;

		// lets print 15 on the screen

		System.out.println("Let's print 15");
		System.out.println(numbers[1][1]);

		System.out.println("======================");

		// create a two dimensional array and set values

		int[][] nums = {

				{ 3, 4, 5, 6 }, { 7, 8, 9, 0 }, { 11, 23, 45, 67 }

		};
		System.out.println(nums[2][2]);

	}

}
