package com.neotech.lesson04;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ListenerDemo {

	@Test

	public void test1() {
		System.out.println("This is test one");
		Assert.assertTrue(true);
	}

	@Test
	public void test2() {
		System.out.println("This is test two");
		Assert.assertFalse(false);
	}

}
