package com.neotech.lesson15;

public class Phone {

	/*
	 * Homework 1: Create a Class "Phone". Create 3 Objects of it: iPhone, Android,
	 * Nokia with specific attributes and behaviors.
	 */

	String size, brand, color;
	int capacity;

	void call() {
		System.out.println(brand + " is calling!");
	}

	void takePhoto() {
		System.out.println(brand + " takes nice photos!");
	}

	void makeVideoCall() {
		System.out.println(brand + " makes video calls!");
	}

	void fly() {

		System.out.println(brand + " is flying!!!");
	}

	public static void main(String[] args) {

		Phone p1 = new Phone();

		p1.brand = "Nokia";
		p1.color = "Black";
		p1.capacity = 256;
		p1.call();
		p1.makeVideoCall();
		p1.takePhoto();

		System.out.println("============================");
		Phone p2 = new Phone();
		p2.brand = "Android";
		p2.color = "Purple";
		p2.capacity = 512;
		p2.call();
		p2.makeVideoCall();
		p2.takePhoto();

		System.out.println("============================");

		Phone p3 = new Phone();
		p3.brand = "Apple";
		p3.color = "Galaxy Grey";
		p3.capacity = 512;
		p3.call();
		p3.makeVideoCall();
		p3.takePhoto();
		p3.fly();

	}

}
