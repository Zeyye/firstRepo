package com.neotech.lesson18;

public class Employee {
	/*
	 * Create a Class called Employee: :black_small_square: eID, salary and set the
	 * CEO to “Elion” CEO should be a static variable :black_small_square: a method
	 * printInfo() that prints out the eID, salary and CEO of the object :
	 * black_small_square: Create two objects of the class Employee Set the value of
	 * eID, salary for each of the objects Call the printInfo() method for both
	 * objects Change the CEO to “Ahmet” Call the printInfo() method for both
	 * objects
	 */
	int eId;
	int salary;
	static String CEO = "Elion";

	void printInfo() {
		System.out.println("eId: " + eId + " salary: " + salary + " CEO: " + CEO);
	}

	public static void main(String[] args) {

		Employee em1 = new Employee();
		em1.eId = 1;
		em1.salary = 50000;

		Employee em2 = new Employee();
		em2.eId = 2;
		em2.salary = 130000;

		em1.printInfo();
		em2.printInfo();

		Employee.CEO = "Ahmet";

		em1.printInfo();
		em2.printInfo();

	}

}
