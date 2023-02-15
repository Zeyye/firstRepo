package com.neotech.lesson21;

public class MathTecher extends Teacher {

	public static void main(String[] args) {

		Teacher MathTeacher = new Teacher();

		MathTeacher.salary = 45000;
		MathTeacher.age = 35;
		MathTeacher.subject = "Math";
		MathTeacher.displayInfo();
		MathTeacher.teach();
		MathTeacher.yell();

	}

}
