package com.neotech.lesson05;

public class Homework2 {

	public static void main(String[] args) {
		/*
		 * 2. Create a Java program and name it Temperature Check. Create variable to
		 * store temperature. Your program should check if temperature is below 32 If
		 * temperature is below then it should print “Water will freeze with temperature
		 * __”, otherwise “Water will NOT freeze with temperature __”.
		 */

		int temp = 60;

		System.out.println(temp < 32);

		if (temp < 32) {
			System.out.println("water will freze with tempereture " + temp);
		} else {
			System.out.println("water will NOT freze with tempreture " + temp);
		}

	}

}
