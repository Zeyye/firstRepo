package com.neotech.lesson19;

public class Employee {

	public static String company;// this is public
	public String name;
	protected String lastName;
	double salary; // no access modifier==> it means default
	private int ssn;

	// 1. if no access modifier then it default
	// 2.the formula of assigning access modifier:
	// access modifier data type variable name

	// methods with different access modifiers

	public void method1() {

		System.out.println("I am a public method!!!");

	}

	protected void method2() {
		System.out.println("I am a protected method!!!");
	}

	void method3() {

		System.out.println("I am a default method!!!");
	}

	private void method4() {
		System.out.println("I am a private method!!!");
	}

	public static void main(String[] args) {

		// we want to see what element we can see from within the same class

		Employee emp = new Employee();

		company = "Neotech";

		emp.name = "Sabah";
		emp.lastName = "Bushaj";
		emp.salary = 50000;
		emp.ssn = 132456777;

		// reading variables and methods:
		// ex: red square ssn:int-employee
		// access modifier (private), identifier is ssn, type is int, belongs to
		// Employee

		// can we access methods?
		emp.method1();// we can access public method
		emp.method2();// we can access protected method
		emp.method3();// we can access a default method
		emp.method4();// we can access also private method

	}

}
