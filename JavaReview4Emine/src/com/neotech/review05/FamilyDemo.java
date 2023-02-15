package com.neotech.review05;

public class FamilyDemo {
	public static void main(String[] args) {

		// I can access static/class variables before I create the object
		FamilyMember.lastName = "James";

		// I can NOT access instance variables before I create the object
		// FamilyMembers.fistName="Lebron";

		// I can access static/class methods before I create the object
		FamilyMember.printFamilyName();

		// I CANNOT access NON static methods before I create the object
		// FamilyMmbers.printFullName();

		System.out.println("======================");

	}

}
