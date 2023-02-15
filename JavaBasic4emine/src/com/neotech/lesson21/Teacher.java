package com.neotech.lesson21;

public class Teacher {

	int age, salary;
	String subject;

	public void teach() {
		System.out.println("All teachers teach!");
	}

	public void yell() {
		System.out.println("All teachers yelling!");
	}

	public void displayInfo() {
		System.out.println("Teacher with the subject  " + subject + " is getting " + salary);
	}

}
