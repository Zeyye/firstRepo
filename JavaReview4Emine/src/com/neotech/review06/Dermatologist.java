package com.neotech.review06;

public class Dermatologist extends Doctor {

	String dermId;

	public Dermatologist() {// super()
							// implicitly it is calling the default constructor of the parent class

	}

	// constructors are NOT inherited!!!
	public Dermatologist(String name, int salary, String licenceId) {
		// super(name, salary, licenceId);// it is called as a default constructor from
		// the parent class
		/*
		 * super.name = name; super.salary = salary; super.licenceId = licenceId
		 */
	}

	public void applySkinTreatment() {
		System.out.println("Doctor " + name + "alllies skin treatment");
	}

}
