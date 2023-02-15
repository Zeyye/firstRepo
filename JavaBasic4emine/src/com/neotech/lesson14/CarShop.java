package com.neotech.lesson14;

public class CarShop {
	public static void main(String[] args) {

		// let's create some cars from our shop

		Car car1 = new Car();// =======>creating object from the Car class
		car1.make = "Mercedes";
		car1.model = "Vito ";
		car1.color = "Red";
		car1.year = 2019;
		car1.mileage = 230000;
		car1.maxSpeed = 200;

		System.out.println(car1.make + " " + car1.model + " " + car1.color + " " + car1.year + " " + car1.mileage + " "
				+ car1.maxSpeed);

		car1.drive();
		car1.stop();
		car1.transportPeople();

	}

}
