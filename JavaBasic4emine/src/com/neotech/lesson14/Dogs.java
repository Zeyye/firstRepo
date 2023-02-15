package com.neotech.lesson14;

public class Dogs {

	String breed, size, color;
	int age;

	void eat() {
		System.out.println(breed + " is eating!");
	}

	void run() {

		System.out.println(breed + " is running!");
	}

	void breed() {
		System.out.println(breed + " is breeding!");
	}

	public static void main(String[] args) {

		Dogs d1 = new Dogs();

		d1.breed = "cow cow";
		d1.age = 5;
		d1.size = "Big";

		d1.eat();
		d1.run();
		System.out.println(d1.breed + " " + " is a really " + d1.size + " type of dog");

	}

}
