package com.neotech.review07_Abstraction;

public class Turkish extends Human {

	public Turkish(String name) {
		super(name);

	}

	@Override
	public void talk() {
		// implementing talk() method
		System.out.println(name + " says Merhaba");

	}

	public void makeBaklava() {
		System.out.println("I am making baklava!");

	}

}
