package com.neotech.lesson05;

public class Homework1 {

	public static void main(String[] args) {
		/*
		 * 1. Create a Java program and name it Double Comparison. Declare 2 double
		 * values and if value of first variable is higher then the second, print
		 * “Double value __ is larger than __ .” Otherwise print...
		 */

		double d1 = 12.8;
		double d2 = 12;

		// d1>d2
		// d1<d2
		// d1=d2
		if (d1 > d2) {
			System.out.println("Double value " + d1 + " is larger than " + d2);
		}
		
		else if(d1==d2) 
		{
			System.out.println("Double value "+d1+ " is equal to"+d2);
		}
		else 
		{
			
			System.out.println("Double value "+d1 +"is larger than "+d2);
		}
		
		
	}

}
