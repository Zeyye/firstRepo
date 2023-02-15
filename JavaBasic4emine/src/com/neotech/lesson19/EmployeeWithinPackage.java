package com.neotech.lesson19;

public class EmployeeWithinPackage {

	public static void main(String[] args) {

		Employee.company = "Neotech";// we do not need an object for this so we can write this above this object
		Employee emp = new Employee();

		emp.name = "Sabah";
		emp.lastName = "Bushaj";
		emp.salary = 500000;
		// emp.ssn=658658;// this is does not exist it is not VISIBLE

		// Can we access methods

		emp.method1();// public we can access
		emp.method2();// protected, we can access
		emp.method3();// default, we can access

		// emp.method4(); //we CAN NOT access private method

	}

}
