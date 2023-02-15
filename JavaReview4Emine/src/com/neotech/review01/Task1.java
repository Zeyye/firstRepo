package com.neotech.review01;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		// Ask the user enter two numbers
		// Ask the user for the operator (+,-,/,*)
		// Solve it using if-else AND using switch

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter the first number!");

		double d1 = scan.nextDouble();// --->this is for reading from the console

		System.out.println("Please enter the second number!");
		double d2 = scan.nextDouble();

		//System.out.println(d1 + "-" + d2);
		System.out.println("Please enter the operator (+,-,/,*)!");
		String operator = scan.next();
		if (operator.equals("+")) {
			System.out.println("The result is-->" + (d1 + d2));

		}
		else if(operator.equals("-"))
				{
			System.out.println("The result is-->" + (d1 -d2));
			
				}
		else if(operator.equals("/"))
		{
	System.out.println("The result is-->" + (d1 /d2));
	
		}
		else if(operator.equals("*"))
		{
	System.out.println("The result is-->" + (d1 *d2));
	
		}
		else 
		{
			System.out.println("Invalid operator");
		}
		
	}

}
