package com.neotech.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchSteps {

	@Given("I navigated to Google")
	public void i_navigated_to_google() {
		System.out.println("I go to google page!");

	}

	@When("I click on the search button")
	public void i_click_on_the_search_button() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("I can see the results of my search")
	public void i_can_see_the_results_of_my_search() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("I can count the number of the results")
	public void i_can_count_the_number_of_the_results() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("I type something on the search box")
	public void i_type_something_on_the_search_box() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

}
