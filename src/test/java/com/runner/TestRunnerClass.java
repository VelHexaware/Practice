package com.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.base.LibGlobal;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "pretty",
		"html:src\\test\\resources\\Reports" }, features = {
				"src/test/resources" }, glue = { "com.stepdefinition" }, monochrome = true, dryRun = true)
public class TestRunnerClass extends LibGlobal {

	@BeforeClass
	public static void beforeClass() {
		System.setProperty("screenshot.dir",
				System.getProperty("user.dir") + "\\src\\test\\resources\\Reports\\ExtentReport\\Screenshots\\");
		System.setProperty("extent.reporter.html.start", "true");
		System.setProperty("extent.reporter.spark.start", "true");
		System.setProperty("extent.reporter.html.out",
				System.getProperty("user.dir") + "\\src\\test\\resources\\Reports\\ExtentReport\\");
		System.setProperty("extent.reporter.spark.out",
				System.getProperty("user.dir") + "\\src\\test\\resources\\Reports\\ExtentReport\\");

	}

	@AfterClass
	public static void afterClass() {

	}

}
