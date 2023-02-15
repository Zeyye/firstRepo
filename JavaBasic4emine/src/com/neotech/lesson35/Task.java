package com.neotech.lesson35;

class CantDriveException extends RuntimeException {
	public CantDriveException(String msg) {
		super(msg);
	}
}

public class Task {

	/*
	 * Create a method to check age eligibility that will throw a runtime exception.
	 * Method should throw an exception if age is less than 16.
	 * 
	 */

	public static void main(String[] args) {
		try {
			canIdrive(16);
			canIdrive(14);
		} catch (CantDriveException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

	public static void canIdrive(int age) {
		if (age < 16) {
			// throw new RuntimeException("You can not drive!");
			throw new CantDriveException("You can not drive!");

		} else {
			System.out.println("Drive safe!");
		}
	}

}
