package com.neotech.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsDemo {

	@Test

	public void test1() {
		String expected = "Emine";

		String actual = "emir";

		Assert.assertEquals(actual, expected);

		// if this is test fails , whatever comes after this
	}

	@Test
	public void test2() {
		int expected = 12;
		int actual = 2;

		Assert.assertEquals(actual, expected, "Numbers did not match!");
	}

}
