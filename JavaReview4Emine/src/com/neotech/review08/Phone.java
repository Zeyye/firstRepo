package com.neotech.review08;

public class Phone {

	private String serialNumber;
	private String brand;
	private String password;

	public Phone(String serialNumber, String brand, String password) {
		this.password = password;
		this.brand = brand;
		this.serialNumber = serialNumber;

		// getters and setters
		// I will give the serial number only if you provide the correct password.

	}

	public void displayInfo() {
		System.out.println("This is a " + +" with serial number " + serialNumber);
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
