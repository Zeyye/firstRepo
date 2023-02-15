package com.neotech.lesson23;

public class UserClass {

	/*
	 * Homework 4: Write program: UserClass that has a constructor that initializes
	 * instance variable name and mobile number. Create a subclass UserInfo that
	 * will have user address variable and it also being initialized through
	 * constructor call. Print users name, mobile number and address in userDetails
	 * method. Test your code.
	 */

	String name;
	long mobileNumber;

	public UserClass() {

	}

	public UserClass(String name, long mobileNumber) {
		this.name = name;
		this.mobileNumber = mobileNumber;
	}

}

class UserInfo extends UserClass {
	String userAdress;

	public UserInfo(String name, long mobileNumber, String userAdress) {
		super(name, mobileNumber);
		this.userAdress = userAdress;
	}

	public void userDetails() {
		System.out.println("User info:");
		System.out.println("Name->" + super.name);
		System.out.println("Mobile->" + super.mobileNumber);
		System.out.println("Adress-->" + userAdress);
	}

}
