package com.neotech.lesson20;

public class CarDemo {

	public static void main(String[] args) {

		// How did we create and initialize an object
		Car c = new Car();
		c.make = "Toyota";
		c.model = "amry";
		c.year = 2020;

		c.printDetails();

		// with parameterized constructor

		Car car2 = new Car("BMW", "M5", 2022);
		car2.printDetails();
	}

}
