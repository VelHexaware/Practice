package com.base;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LibGlobal {
	public static WebDriver driver;

	public static void getDriver() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Velmurugan\\Software\\Workspace\\CucumberPractice\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		// String USERNAME = "velmurugan20";
		// String AUTOMATE_KEY = "DZrJosF7cVMxyMaHZtPU";
		// String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY +
		// "@hub-cloud.browserstack.com/wd/hub";
		//
		// DesiredCapabilities caps = new DesiredCapabilities();
		// caps.setCapability("browser", "Chrome");
		// caps.setCapability("browser_version", "62.0");
		// caps.setCapability("os", "Windows");
		// caps.setCapability("os_version", "10");
		// caps.setCapability("resolution", "1024x768");
		// caps.setCapability("name", "Bstack-[Java] Sample Test");
		//
		// try {
		// driver = new RemoteWebDriver(new URL(URL), caps);
		// } catch (MalformedURLException e) {
		// e.printStackTrace();
		// }

	}

	public byte[] screenshot() {
		return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);

	}

	public static void loadUrl(String url) {
		driver.get(url);

	}

	public static void type(WebElement element, String name) {
		element.sendKeys(name);
	}

	public static void btnClick(WebElement element) {
		element.click();
	}

	public static void quitBrowser() {
		driver.quit();
	}

}
