package com.neotech.review05;

public class FamilyMember {
	public static void main(String[] args) {

	}

	String firstName;// instance variable, belongs to the instance/object

	static String lastName;// static/class variable, belongs to the class

	int age;// instance variable, belongs to the instance/object

	// With non-static methods you can access ALL the variables
	void printFullName() {
		System.out.println("Full name is: " + firstName + " " + lastName);
	}

	// With static methods you can access ONLY static variables
	static void printFamilyName() {
		// System.out.println("Full name is: "+firstName+" "+lastName);
		System.out.println("Family name is: " + lastName);

		FamilyMember member1 = new FamilyMember();

		member1.firstName = "Lebron";
		member1.age = 37;

		FamilyMember member2 = new FamilyMember();

		member2.firstName = "Savannah";
		member2.age = 23;

		member1.printFullName();
		member2.printFullName();

	}
}
