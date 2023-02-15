package com.neotech.lesson20;

public class Students {

	String name;
	int grade1, grade2, grade3;
	int average;

	Students() {
		System.out.println("I am a default constructor!");
	}

	Students(String name, int grade1, int grade2, int grade3) {
		average = (grade1 + grade2 + grade3) / 3;
		System.out.println(name + " " + average);
	}

	public static void main(String[] args) {

		Students st1 = new Students("Ahmet", 60, 78, 90);
		Students st2 = new Students("Ayse", 78, 98, 90);
		Students st3 = new Students("Ali", 60, 80, 90);
		Students st4 = new Students("Alev", 60, 58, 100);
		Students st5 = new Students("AhmetAli", 60, 78, 90);

	}

}
