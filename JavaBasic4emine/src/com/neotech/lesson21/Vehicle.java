package com.neotech.lesson21;

public class Vehicle {
	// Homework 1:
	// Write program for multilevel inheritance where class A is inherited
	// by B and class B is inherited by class by C.

	/*
	 * We can take an example of three classes, class Vehicle, class Car, and class
	 * SUV. Here, the class Vehicle is the grandfather class. The class Car extends
	 * class Vehicle and the class SUV extends class Car.
	 */

	String make, model;
	int year;

	public void move() {
		System.out.println("All vehicle moves!");
	}

	public void transport() {
		System.out.println("All vehicle transports something!");
	}

	public void useGas() {
		System.out.println("All vehicle consume gas!");
	}

	public void displayInfo() {

		System.out.println("This  " + make + " " + model + " " + year);
	}

}
