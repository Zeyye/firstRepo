package com.neotech.lesson19;

public class HomeworkDemo {

	public static void main(String[] args) {

		Homework st1 = new Homework();
		st1.studentName = "Oktay";
		st1.studentID = 1;
		// increment the number of students
		Homework.numberOfStudents++;

		// we can do this, but don't. this is
		// not the proper way
		// st1.numberOfStudents++;

		Homework st2 = new Homework();
		st2.studentName = "Hakan";
		st2.studentID = 2;

		Homework.numberOfStudents++;

		Homework st3 = new Homework();
		st3.studentName = "Harun";
		st3.studentID = 3;

		Homework.numberOfStudents++;

		System.out.println("The total number of students is " + Homework.numberOfStudents);

	}

}
