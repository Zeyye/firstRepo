package com.neotech.review11;

public class ExceptionDemo2 {
	public static void main(String[] args) {
		int[] numbers = new int[3];
		try {
			numbers[0] = 10;
			numbers[1] = 20;
			numbers[2] = 30;
			numbers[3] = 40;
		} catch (Exception e) {
			// System.out.println(e);
			// System.out.println(e.getMessage());
			// e.printStackTrace();
			System.out.println("You are storing element outside of array!");
		}
		System.out.println("will this line be printed?");
	}

}
