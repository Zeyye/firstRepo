package com.neotech.lesson07;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {

		/*
		 * 1. Ask the user to enter the height in inches. Person should be classified as
		 * one of the following: • short (under 60 inch) • medium (between 60 -72 inch)
		 * • tall (over 72 inch)
		 * 
		 * 
		 */
		int height;

		Scanner scan = new Scanner(System.in);
		System.out.println("please enter your height!");

		height = scan.nextInt();

		// for short [1-60[-->if height >0 and height <60
		// for medium [60-72[ -->if height 60 >=60 and height <72
		// for tall [72---[ -->if height 72>=

		// cond1 cond2
		// &&-->both the conditions have to be true
		// ||-->only one of them is enough

		if (height > 0 && height < 60) // <60 is same as <=59
		{

			System.out.println("Classified as short!!!");

		} else if (height >= 60 && height < 72) {

			System.out.println("Classified as medium!!!");
		}

		else if (height >= 72) {
			System.out.println("Classiefied as tall!!!");
		} else {

			System.out.println("invalid input!!!");
		}

	}

}
