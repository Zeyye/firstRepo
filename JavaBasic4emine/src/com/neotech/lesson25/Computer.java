package com.neotech.lesson25;

public class Computer {

	// Homework
	String brand;

	// by not using the default constructor we force users to enter the brand when
	// they create the object
	public Computer(String brand) {
		this.brand = brand;

	}

	public void run() {
		System.out.println(brand + " computer can run the system!");
	}

}

class Apple extends Computer {

	public Apple(String brand) {
		super(brand);

	}

	// override the run method

	public void run() {
		System.out.println(brand + " computer runs faster!");
	}

	public void safe() {
		System.out.println(brand + " is very safe");
	}
}

class Lenovo extends Computer {

	public Lenovo(String brand) {
		super(brand);

	}

	@Override
	public void run() {
		System.out.println(brand + " computer even runs faster!");
	}

	public void saveData() {
		System.out.println(brand + " computer saves a lot of data!");
	}
}

class HP extends Computer {

	String color;

	HP(String brand, String color) {
		super(brand);
		this.color = color;

	}

	public void run() {
		System.out.println(brand + " computer runs slow!");
	}

	public void save() {
		System.out.println(brand + " computer does not have a big storage");
	}
}

class Dell extends Computer {

	public Dell(String brand) {
		super(brand);

	}
	// lets not override the run method
}
