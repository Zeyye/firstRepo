package com.neotech.lesson23;

public class Animal {

	public void eat() {
		System.out.println("All animals eat");
	}

	public void sleep() {
		System.out.println("All animal sleep");
	}

}

class Tiger extends Animal {

	public void eat() {
		System.out.println("Tiger eats human");
	}

	public void run() {
		System.out.println("Tigers run fast");
	}

}