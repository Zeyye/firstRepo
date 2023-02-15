package com.neotech.lesson23;

public class Employee {

	double salary;

	void getPaid() {
		System.out.println("The employee salary is " + salary);

	}

}

class Contructor extends Employee {
	double hourlyRate;

	void getPaid() {
		System.out.println("The contructor hourly rate is " + hourlyRate);

	}
}

class FullTimeEmployee extends Employee {
}