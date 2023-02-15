package com.neotech.review07_Polimorphism;

public class Albanian extends Human {

	public Albanian() {

	}

	public Albanian(String name) {

	}

	@Override
	public void talk() {
		System.out.println("They say une flas shqip.Une quhem " + name);
	}

	public void albaninanDance() {
		System.out.println("Dncing Valle Kosovare!");
	}
}
