package com.neotech.review07_Polimorphism;

public class Turkish extends Human {

	Turkish(String name) {
		super(name);

	}

	@Override
	public void talk() {
		System.out.println("Ben Turkce konusuyorum.Benim adim " + name);
	}

	public void makeBaklava() {
		System.out.println("I am making baklava!");
	}

}
