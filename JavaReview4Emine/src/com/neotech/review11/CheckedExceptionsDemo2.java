package com.neotech.review11;

public class CheckedExceptionsDemo2 {
	public static void main(String[] args) {

		System.out.println("Hi Java");

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println("Something went wrong!");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Bye  Java");

	}

}
