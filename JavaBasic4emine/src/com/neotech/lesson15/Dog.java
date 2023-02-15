package com.neotech.lesson15;

public class Dog {
	/*
	 * Homework 2: Create a Dog Class and create 3 different objects of
	 * it:Husky,Bulldog, Labrador with specific attributes and behaviors.
	 */

	String color, size, breed;
	int age;

	void bark() {
		System.out.println(breed + " is barking too loud!");

	}

	void run() {
		System.out.println(breed + " is running so fast");

	}

	void eat() {
		System.out.println(breed + " is eating a lot of meat!");

	}

	public static void main(String[] args) {

		Dog d1 = new Dog();

		d1.breed = "Labrador";
		d1.color = "Brown";
		d1.size = "Big";
		d1.age = 1;
		d1.bark();
		d1.eat();
		d1.run();

		System.out.println("===================");

		Dog d2 = new Dog();

		d2.breed = "Bulldog";
		d2.color = "Black";
		d2.size = "Big";
		d2.age = 5;
		d2.bark();
		d2.eat();
		d2.run();

		System.out.println("===================");

		Dog d3 = new Dog();

		d3.breed = "Hasky";
		d3.color = "White";
		d3.size = "Medium";
		d3.age = 2;
		d3.bark();
		d3.eat();
		d3.run();

	}

}
