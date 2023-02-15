package com.neotech.review08;

public class PhoneDemo {

	public static void main(String[] args) {

		Phone p1 = new Phone("1234", "Samsung", "passQ1234");

		p1.displayInfo();

		String serial = p1.getSerialNumber();
		System.out.println("The serial is: " + serial);

		p1.setSerialNumber("Emine");

		p1.displayInfo();

		System.out.println(p1.getBrand());

		p1.getPassword();

	}

}
