package com.neotech.lesson14;

public class Student {

	// features/properties
	// firstName,lastName, studentId, school grade

	String firstName, lastName, school;
	int sdudentId;
	char gender;
	char grade;

	// methods/behaviors
	// study(), doHomework(),

	void study() {

		System.out.println(firstName + " " + lastName + " is studying");

	}

	void doHomework() {
		System.out.println(firstName + " is doing homework!");
	}

}
