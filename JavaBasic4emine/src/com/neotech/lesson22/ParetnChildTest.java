package com.neotech.lesson22;

public class ParetnChildTest {
	public static void main(String[] args) {

		Parent p = new Parent();

		p.lastName = "atalay";
		p.name = "emine";

		Child c = new Child();
		c.display();
	}

}
