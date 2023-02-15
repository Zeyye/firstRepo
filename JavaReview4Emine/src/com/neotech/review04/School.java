package com.neotech.review04;

public class School {

	public static void main(String[] args) {

		Student stu1 = new Student();

		stu1.name = "Emine";
		stu1.gradeLevel = 8;
		stu1.StudentNr = 123;
		stu1.study();
		stu1.sleep();

		Student stu2 = new Student();

		stu2.name = "Ayse";
		stu2.gradeLevel = 12;
		stu2.StudentNr = 789;
		stu2.sleep();
		stu2.sleep();

		Teacher teac1 = new Teacher();

		teac1.Name = "Elion";
		teac1.subject = "Java";
		teac1.salary = 150000;
		teac1.teach();
		teac1.yellAtStudent();

		System.out.println(stu1.name + " and " + stu2.name + " is studying");

	}

}
