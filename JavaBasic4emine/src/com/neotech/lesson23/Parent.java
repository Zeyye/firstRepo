package com.neotech.lesson23;

public class Parent {

	Parent() {
		System.out.println("Parent class constructor!");
	}

	void hello() {
		System.out.println("Hello from the parent class");
	}

	void bye() {
		System.out.println("Bye from the parent class");
	}

}

class Child extends Parent {
	Child() {
		System.out.println("Child class constructor!");
	}

	void hello() {
		System.out.println("hello from child");
	}

	void bye() {
		System.out.println("bye from the child");
	}

}