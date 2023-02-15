package com.neotech.lesson21;

public class Animal {

	public String size, color;
	public int age;

	public void sleep() {
		System.out.println("All animals sleep!");
	}

	public void eat() {
		System.out.println("All animals eat!");

	}

	public void displayInfo() {
		System.out.println(size + ", " + color + "  age-->" + age);

	}

}
