package com.neotech.lesson14;

public class School {

	public static void main(String[] args) {

		Student s1 = new Student();// =========>our first object// you can as many as you want object
		Student s2 = new Student();
		Student s3 = new Student();
		Student s4 = new Student();

		s1.firstName = "Emine";
		s1.lastName = "Atalay";
		s1.school = "Neotech Academy";
		s1.gender = 'F';
		s1.grade = 'A';
		s1.doHomework();
		s1.study();
		System.out.println(s1.firstName + " " + s1.lastName + " " + s1.school + " " + "with the gender of " + s1.gender
				+ " " + "and with the grade " + s1.grade);

		s2.firstName = "Ayse";
		s2.lastName = "Emir";
		s2.school = "Mclean";
		s2.gender = 'F';
		s2.grade = 'A';

		s2.doHomework();// ========>calling the methods
		s2.study();
		System.out.println();
		System.out.println(s2.firstName + " " + s2.lastName + " " + s2.school + " " + "with the gender of " + s2.gender
				+ " " + "and with the grade " + s2.grade);

	}

}
