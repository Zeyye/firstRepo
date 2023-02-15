package com.neotech.lesson23;

public class ParentTest {

	public static void main(String[] args) {

		Parent p = new Parent();
		p.bye();
		p.hello();

		Child c = new Child();
		c.bye();
		c.hello();

	}

}
