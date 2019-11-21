package com.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.base.LibGlobal;
import com.screens.LoginPage;

import cucumber.api.java.en.*;

public class LoginPageSteps extends LibGlobal {
	WebDriver driver;
	LoginPage page;

	@Given("User is on adactin page")
	public void user_is_on_adactin_page() {
	}

	@When("User {string} and {string} details")
	public void user_enters_details(String s1, String s2) {
		page = new LoginPage();
		type(page.getLstTxtUserName().get(0), s1);
		type(page.getLstTxtPassword().get(0), s2);
		HooksClass.sc.embed(screenshot(), "pass/png");

	}

	@Then("Click the button")
	public void click_the_button() {
		btnClick(page.getLstBtnLogin().get(0));
	}

}
