package com.neotech.review06;

//OOP -->Object oriented programming
//1.Inheritance(Miras)
//2.Polymorphism
//3.Abstraction
//4.Encapsulation

public class Doctor {
	String name;
	int salary;
	String licenceId;

	// it is a good practice to leave the default constructor
	Doctor() {

	}

	Doctor(String name, int salary, String licenceId) {
		this.name = name;
		this.salary = salary;
		this.licenceId = licenceId;

	}

	public void checkUp(String name) {
		System.out.println("Doctor " + this.name + " makes check up on " + name);
	}

}
