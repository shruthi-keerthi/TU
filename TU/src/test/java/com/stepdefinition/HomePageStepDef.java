package com.stepdefinition;

import com.cucumberrunner.AbstractMain;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class HomePageStepDef extends AbstractMain {
	@Given("^when I am in homepage$")
	public void when_I_am_in_homepage() throws Throwable {
		homePage.setHomePage();
	}

	@When("^I enter valid search$")
	public void i_enter_valid_search() throws Throwable {
		homePage.validSearch();
	}

	@When("^select search button$")
	public void select_search_button() throws Throwable {
		homePage.selectSearchButton();
	}
}
