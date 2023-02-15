package com.neotech.lesson19_1;

//this imports only class Employee from package com.neotech.lesson19
import com.neotech.lesson19.Employee;

//this imports all the classee in package 
public class EmployeeOutsidePackage {

	public static void main(String[] args) {

		Employee.company = "Neotech";

		Employee emp = new Employee();

		emp.name = "Mustafa";
		// emp.lastName="Kilic";we cannot access because this is protected

		// emp.salary=677888;//this is default we can not access

		// emp.ssn=87587;//private is Not visible

		// can we access methods?

		emp.method1();// we can see it is public
		// but the rest is Not visible

	}

}
