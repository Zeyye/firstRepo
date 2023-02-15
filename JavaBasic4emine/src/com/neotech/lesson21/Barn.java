package com.neotech.lesson21;

public class Barn {

	public static void main(String[] args) {

		Animal a = new Animal();
		a.size = "Big";
		a.color = "Black";
		a.age = 5;

		a.sleep();
		a.displayInfo();
		a.eat();

		System.out.println("==================================");

		Dog d = new Dog();

		d.size = "medium";
		d.color = "Gray";
		d.age = 8;
		d.breed = "Husky";

		d.eat();
		d.sleep();
		d.displayInfo();
		d.bark();
		d.sleep();

	}

}
