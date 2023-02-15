package com.neotech.lesson23;

public class EmployeeTest {
	public static void main(String[] args) {

		Employee em1 = new Employee();
		em1.salary = 80000;
		em1.getPaid();

		System.out.println("===============");

		Contructor c = new Contructor();
		c.hourlyRate = 80;
		c.getPaid();

		System.out.println("==============");

		FullTimeEmployee ft = new FullTimeEmployee();
		ft.salary = 9000;
		ft.getPaid();

	}

}
