package com.neotech.lesson21;

public class Car extends Vehicle {

	public static void main(String[] args) {

		Vehicle c1 = new Vehicle();

		c1.make = "Toyota";
		c1.model = "Camry";
		c1.year = 2020;
		c1.useGas();
		c1.move();
		c1.transport();
		c1.displayInfo();

	}

}
