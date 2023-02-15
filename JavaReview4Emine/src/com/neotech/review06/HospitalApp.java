package com.neotech.review06;

public class HospitalApp {

	public static void main(String[] args) {

		Doctor d1 = new Doctor("Karen", 170000, "D123");
		d1.checkUp("Emine");

		Dermatologist d2 = new Dermatologist();
		d2.name = "Alex";
		d2.salary = 50000;
		d2.licenceId = "D222";

	}

}
