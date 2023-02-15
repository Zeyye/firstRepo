package com.neotech.lesson03;

import com.neotech.utils.CommonMethods;

public class AddEmployeeWithDataProvider extends CommonMethods {

	// because we have said @BeforeMethod and @AfterMethod on BaseClass,
	// we do not need any @BeforeMethod or @AfterMethod here

	public void addEmployee(String firstName, String lastName) {
		// This line can simply test if we are getting the data from the dataProvider
		// System.out.println(firstName + " " + lastName);

		// login

		// navigate to PIM menu

		// click on Add Employee

		// send employee data: firstName, lastName, location

		// save employee

	}

	public Object[][] create2DArray() {

		// { {"name1", "lastName1"}, {"name2", "lastName2}, .... }

		Object[][] data = { { "Murad", "Bayramov" }, { "Emine", "Karakaya" }, { "Vugar", "AliSultanov" } };

		return data;

	}

}
