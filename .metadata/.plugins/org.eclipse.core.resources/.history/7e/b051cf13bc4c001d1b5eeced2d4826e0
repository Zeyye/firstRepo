package com.neotech.lesson13;

public class Task3 {

	public static void main(String[] args) { 

		/*
		 * Create a 2D array of integer type and store numbers in 3 rows and 3 columns.
		 * Print the sum of all numbers.
		 */
		
		int[][] N = {
				{3, 4, 5},
				{10, 11, 12},
				{7, 8, 9}
					};
		
		//using the indexed for loop
		
		int sum = 0;
		
		for(int row = 0; row < N.length; row++)
		{
			for(int col = 0; col < N[row].length; col++)
			{
				sum += N[row][col]; //shorthand op
				//sum = sum + N[row][col] //long way
			}
		}
		
		System.out.println("The total sum is: " + sum);
		
		
		//using enhanced for loop
		
		int sum2 = 0;
		
		for(int[] row : N)
		{
			for(int el : row)
			{
				sum2+=el;
			}
		}
		
		System.out.println("The total sum is: " + sum2);
		
		
		

		
		
	}

}
