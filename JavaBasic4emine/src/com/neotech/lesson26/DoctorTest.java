package com.neotech.lesson26;

public class DoctorTest {
	public static void main(String[] args) {

		Doctor doc = new Doctor();

		doc.setEmail("asd@gmail.com");

		System.out.println(doc.getEmail());

		doc.setLicenceId(8708708708L);
		System.out.println(doc.getLicenceId());

		doc.setSalary(700000000l);
		System.out.println(doc.getSalary());

	}

}
