package com.screens;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.LibGlobal;

public class LoginPage extends LibGlobal {

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	private List<WebElement> lstTxtUserName;

	@FindBy(id = "password")
	private List<WebElement> lstTxtPassword;

	@FindBy(id = "login")
	private List<WebElement> lstBtnLogin;

	public List<WebElement> getLstTxtUserName() {
		return lstTxtUserName;
	}

	public List<WebElement> getLstTxtPassword() {
		return lstTxtPassword;
	}

	public List<WebElement> getLstBtnLogin() {
		return lstBtnLogin;
	}

}
