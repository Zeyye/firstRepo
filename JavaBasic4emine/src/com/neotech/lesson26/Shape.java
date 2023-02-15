package com.neotech.lesson26;

public interface Shape {

	/*
	 * Create an Interface 'Shape' with undefined methods as calculateArea and
	 * calculatePerimeter. Create 2 classes Circle & Square that implements
	 * functionality defined in the Shape Interface. Test your code.
	 */

	void calculateArea(int a);

	void calculatePerimeter(int a);
}

class Circle implements Shape {

	@Override
	public void calculateArea() {

	}

	@Override
	public void calculatePerimeter() {

	}

	@Override
	public void calculateArea(int a) {
		// TODO Auto-generated method stub

	}

	@Override
	public void calculatePerimeter(int a) {
		// TODO Auto-generated method stub

	}
}

class Square implements Shape {

	@Override
	public void calculateArea(int a) {

	}

	@Override
	public void calculatePerimeter() {

	}
}
