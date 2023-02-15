package com.neotech.lesson04;

public class Homework2 {
	public static void main(String[] args) {
		/*
		 * 2. Write a java program that converts mile to km and km to miles. Use scale 1
		 * mile = 1.609344.
		 */
		
		double scale=1.609;
		int km=6;
		int mile=2;
		
		System.out.println(" km is equal to "+mile*scale);
		System.out.println(" mile is equal to "+km/scale);
	}

}
