package com.neotech.lesson21;

public class Homework1Student {

	// Homework 1:
	// Write program as a Student class that has instance variables name and
	// address.
	// Create a constructor that will initialize those variables.
	// Print name & address of given student using displayInfo method.

	String name, adress;

	public Homework1Student() {

	}

	public Homework1Student(String stName, String stAdress) {
		name = stName;
		adress = stAdress;
	}

	public void displayInfo() {
		System.out.println(" Name--> " + name + " address-->" + adress);
	}

	public static void main(String[] args) {
		Homework1Student s1 = new Homework1Student("Ayse ", "567 New York");
		s1.displayInfo();
		Homework1Student s2 = new Homework1Student("Ahmet ", "123 Virginia");
		s2.displayInfo();

	}

}
