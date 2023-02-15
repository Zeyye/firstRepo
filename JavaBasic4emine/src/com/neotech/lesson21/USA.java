package com.neotech.lesson21;

public class USA {

	// INSTANCE VARIABLES

	String state, stateCapital;

	// if we define a constructor with parameters, there is no default constructor.

	public USA(String state, String StateCapital) {
		this.state = state;
		this.stateCapital = stateCapital;
	}

	// methods

	public void displayState() {
		System.out.println(this.state);
	}

	public void displayStateCapital() {
		System.out.println(this.stateCapital);
	}

	// can I call method from another method?
	public void displayInfo() {
		displayState();
		displayState();

	}

	public static void main(String[] args) {

		USA us1 = new USA("New Jersey", "Trenton");

		us1.displayState();

		System.out.println("=============");

		USA us2 = new USA("Delaware", "Dover");

		us2.displayInfo();

	}

}
