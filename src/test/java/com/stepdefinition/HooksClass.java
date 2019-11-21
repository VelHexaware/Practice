package com.stepdefinition;

import com.base.LibGlobal;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksClass extends LibGlobal {
	static Scenario sc;

	@Before
	public void beforeScenario() {
		getDriver();
		loadUrl("https://adactin.com/HotelApp/");
	}

	@After
	public void afterScenario(Scenario sc) {
		this.sc = sc;
		if (!sc.isFailed()) {

			sc.embed(screenshot(), "pass/png");
		} else {
			sc.embed(screenshot(), "fail/png");

		}
		quitBrowser();

	}

}
