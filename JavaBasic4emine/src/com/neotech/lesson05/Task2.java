package com.neotech.lesson05;

public class Task2 {

	public static void main(String[] args) {

		/*
		 * Create a Java program to check if it is Friday or not. If it is Friday, print
		 * "It's Friday. I am going to watch a movie." and check the date, if date is 13
		 * print "I will watch a scary movie.". If date is not 13 print
		 * "I will watch a comedy.". If it is not Friday, print "It is NOT Friday. I am
		 * going to study JAVA."
		 */

		boolean isFriday = true;
		int day = 15;

		if (isFriday) {
			System.out.println("It is Friday! I am going to watch a movie!!");
			if (day == 13) {
				System.out.println("I will watch scary movie!!");
			} else {
				System.out.println("I will watch the comedy!");
			}
		} else {

			System.out.println("I will study JAVA!");
		}

	}
}