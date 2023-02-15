package com.neotech.lesson24;//HOMEWORK-1

public class StudentTest {
	public static void main(String[] args) {

		Student s1 = new Student();
		s1.doHomework();
		s1.study();
		System.out.println("=================");
		NeotechStudent ns = new NeotechStudent();
		ns.doHomework();
		ns.getJob();
		ns.study();
		System.out.println("================");

		CollegeStudent cs = new CollegeStudent();
		cs.doHomework();
		cs.study();

		Student st1;// declaring a variable of type Student
		st1 = new NeotechStudent();// assigning an object of the child class

		Student st2 = new CollegeStudent();// UP-CASTING
		st1.doHomework();// ------>run time polymorphism happening
		st2.doHomework();// ------>run time polymorphism happening

	}

}
