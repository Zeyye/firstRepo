package com.neotech.lesson27;

public class Registration {

	/*
	 * Homework 1: Create Registration Class in which you would have variables as
	 * email, userName and password that have an access scope only within its own
	 * class. After creating an object of the class user should be able to call
	 * methods and in each method separately pass values to set users email, user
	 * name and password.
	 * 
	 * Requirements: Valid email consider to be only yahoo! Valid userName and
	 * password cannot be empty and should be of length larger than 6 characters.
	 * Also valid password cannot contain userName.
	 */

	private String email, userName, password;

	public void setEmail(String email) {
		if (!email.isEmpty() && email.contains("@Yahoo")) {
			this.email = email;
		} else {
			System.out.println("You have to use Yahoo!");
		}
	}

	public void setUsername(String username) {
		if (!username.isEmpty() && username.length() > 6) {
			this.userName = username;
		} else {
			System.out.println("INVALID username!");
		}
	}

	public void setpassword(String password) {
		if (!password.isEmpty() && password.length() > 6 && !password.contains(userName)) {
			this.password = password;
		} else {
			System.out.println("Invalid password!");
		}
	}

	public String getEmail() {
		return email;
	}

	public String getuserName() {
		return userName;
	}

	public String getpassword() {
		return password;
	}

}