package com.neotech.steps;

import io.cucumber.java.en.Given;

public class GoogleSearchSteps {

	@Given("I navigated to Google")
	public void i_navigated_to_google() {
		System.out.println("I go to Google page!");
	}

}
