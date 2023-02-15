package com.neotech.lesson03;

public class Task2 {

	public static void main(String[] args) {
		/*
		 * Write a program to print the area and perimeter of a rectangle with width = 5
		 * and height = 8. Your program should say. “The perimeter of a rectangle with
		 * width ___ and height ____ is equal to _____ and the area is __”
		 */

		// declared the variables
		int h, w, a, p;

		// initialize -> giving initial value
		h = 8;
		w = 5;

		a = h * w; // assigning the result of h*w to variable a
		p = 2 * (h + w);

		System.out.println("The perimeter of a rectangle with width " + w + " and height " + h + " is equal to " + p
				+ " and the area is " + a + ".");

	}

}
