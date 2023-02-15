package com.neotech.review06;

public class Student {

	String name;
	int age;

	static String school;// static/class variable--->all the student belong the same school

	// Constructor
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void displayInfo() {
		System.out.println(
				"My name is " + this.name + " my age is " + this.age + " AND I am studying at " + Student.school);
	}

	public static void main(String[] args) {

		Student.school = "Neotech";// also school="Neotech: will work
		// We do not have the default constructor
		// Student s1=new Student();

		Student s2 = new Student("Aykut", 15);
		s2.displayInfo();

		Student s3 = new Student("Sema", 23);
		s2.displayInfo();
	}

}
