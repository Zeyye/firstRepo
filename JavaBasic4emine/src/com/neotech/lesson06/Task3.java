package com.neotech.lesson06;

import java.util.Scanner;

public class Task3 {
	
	public static void main(String[] args) {
		
		/*
		 * 2. Write a program that calculates the sum of two numbers entered by the
		 * user. 
		 * 3. Write a program that asks user to enter two numbers and prints which
		 * one is larger
		 */
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a number!");
		int firstNumber=input.nextInt();
		
		System.out.println("Please enter a number!");
		
		int secondNumber=input.nextInt();
		
		if (firstNumber>secondNumber) 
		{
			
			System.out.println(firstNumber +" is greater "+secondNumber);
		}
		else if(firstNumber==secondNumber)
		{
			System.out.println(firstNumber +" is equal to "+secondNumber);
		}
		else 
		{
			System.out.println(firstNumber+" is less than "+secondNumber);
		}
	}

}
