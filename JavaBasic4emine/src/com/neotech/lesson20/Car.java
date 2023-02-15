package com.neotech.lesson20;

public class Car {

	String make, model;
	int year;

	Car() {
		System.out.println(" I am a default constructor!");
	}

	Car(String carMake, String carModel, int carYear) {
		System.out.println("We are creating object wirh parameter!!!");
		make = carMake;
		model = carModel;
		year = carYear;
	}

	void printDetails() {
		System.out.println("I have a " + year + " " + make + " " + model + " and it is a good car!");
	}

}
