package com.neotech.review04;

public class School {

	public static void main(String[] args) {
		Student student1 = new Student();
		student1.name = "Kenan";
		student1.studentNr = 358;
		student1.gradeLevel = 10;

		Student student2 = new Student();
		student2.name = "Victor";
		student2.studentNr = 001;
		student2.gradeLevel = 5;

		Teacher teacher = new Teacher();
		teacher.name = "Sabah";
		teacher.salary = 150000;
		teacher.subject = "Java";
		
		System.out.println("Let's call the methods!");

		student1.study();
		
		student2.sleep();
		student2.study();
		
		teacher.teach();
		teacher.yellAtStudent(student2.name);
		
	}
}
