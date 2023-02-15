package com.neotech.lesson27;

public class RegistrationTest {
	public static void main(String[] args) {

		Registration t1 = new Registration();

		t1.setEmail("emine@hotmail");
		System.out.println(t1.getEmail());

		t1.setEmail("ayse@yahoo.com");
		System.out.println(t1.getEmail());

		t1.setpassword("123467");

		System.out.println(t1.getpassword());
		t1.setpassword("12");
		System.out.println(t1.getpassword());

		t1.setUsername("oiuoioi987");

		System.out.println(t1.getuserName());
		t1.setUsername("belediye");
		System.out.println(t1.getuserName());

	}

}
