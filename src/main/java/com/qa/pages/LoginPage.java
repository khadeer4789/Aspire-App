package com.qa.pages;

import com.qa.util.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.qa.base.TestBase;

public class LoginPage extends TestBase{

	@FindBy(xpath = "//input[@id='login']")
	private WebElement username;

	@FindBy(xpath = "//input[@id='password']")
	private WebElement password;

	@FindBy(xpath = "//button[text()='Log in']")
	private WebElement loginButton;

	public LoginPage(){
		PageFactory.initElements(driver, this);
	}


	public void enterUsername(String email)
	{
		TestUtil.enterText(username, email,"username");

	}

	public void enterPassword(String pass)
	{
		TestUtil.explicitWaitElementToBeClickable(password,20);
		password.sendKeys(pass);
	}

	public void clickLogin()
	{
		TestUtil.click(loginButton,"loginButton");
	}


	public void login(String username,String password)
	{
		enterUsername(username);
		enterPassword(password);
		clickLogin();
	}


	

	
}
