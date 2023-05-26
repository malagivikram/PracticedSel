package com.sauce.POMPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginToSauce {

	WebDriver driver;

	By username = By.id("user-name");
	By password = By.id("password");
	By loginbtn = By.name("login-button");

	public LoginToSauce(WebDriver driver) {

		this.driver = driver;

	}

	public void enterUsername(String uname) {

		driver.findElement(username).sendKeys(uname);
	}

	public void enterPassword(String pwd) {

		driver.findElement(password).sendKeys(pwd);
	}

	public void clickLogin() {

		driver.findElement(loginbtn).click();
	}

}
