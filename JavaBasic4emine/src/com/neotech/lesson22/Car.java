package com.neotech.lesson22;

public class Car {

	// homework2

	String make, model;

	// Car class constructors
	//
	Car() {
		System.out.println("Car default cont");
	}

	Car(String make, String model) {

		this.make = make;
		this.model = model;

	}

	void drivinh() {
		System.out.println("Car drives!");
	}
}

class SportCar extends Car {

}
