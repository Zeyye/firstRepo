package com.neotech.lesson21;

public class Suv extends Car {

	public static void main(String[] args) {

		Vehicle suv = new Vehicle();

		suv.make = "LandRover";
		suv.model = "Explorer";
		suv.year = 1998;
		suv.move();
		suv.transport();
		suv.displayInfo();

	}

}
