package com.neotech.lesson26;

public class Doctor {

	private long licenceId;
	private long salary;
	private String email;

//setter for licenceId

	public long getLicenceId() {
		return licenceId;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setLicenceId(long licenceId) {
		this.licenceId = licenceId;
	}

}
