package com.neotech.lesson22;

public class Parent {

	String name = "Parent Name";
	String lastName = "Parent last name";

	void hello() {
		System.out.println("Printing from parent class!");

	}

}

class Child extends Parent {
	String name = "Child Name";

	void display() {
		System.out.println(name);
		System.out.println(this.name);
		System.out.println(super.name);
	}

}