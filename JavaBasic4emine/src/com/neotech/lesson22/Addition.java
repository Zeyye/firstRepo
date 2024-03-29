package com.neotech.lesson22;

public class Addition {

	// method signature:
	// return type method name (int, int int)

	void add(int a, int b) {
		System.out.println(a + b);
	}

	// method overloading by changing the number of parameters
	void add(int a, int b, int c) {
		System.out.println(a + b + c);
	}

	// method overloading by chancing the type of parameters
	void add(double a, double b) {
		System.out.println(a + b);
	}

	void add(int a, int b, double c) {
		System.out.println(a + b + c);

	}

	// we are changing both of them at the same time (number and type)
	void add(int a, double b, int c, double d) {
		System.out.println(a + b + c + d);
	}

	// method overloading by changing the order of the parameters
	void add(String str, int a) {
		System.out.println("we cannot add them!");
	}

	int add(int a, int b, int c, int d, int e)

	{
		System.out.println();
		return a + b + c + d + e;
	}

}
