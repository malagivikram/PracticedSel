package com.sauce.POMTests;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.sauce.POMPages.LoginToSauce;

import io.netty.handler.timeout.TimeoutException;

public class LoginTest {

	@Test
	public void login() {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		LoginToSauce log=new LoginToSauce(driver);
		
		log.enterUsername("standard_user");
		log.enterPassword("secret_sauce");
		log.clickLogin();
		
		// Create a WebDriverWait instance with a timeout of 10 seconds
	
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		try {
		    // Wait for the alert to be present
		    Alert alert = wait.until(ExpectedConditions.alertIsPresent());

		    // Switch to the alert and perform any necessary actions
		    alert.accept();
		} catch (Exception e) {
		    System.out.println("No alert is present, continue with test execution");// 
		}


		SoftAssert ass=new SoftAssert();
		WebElement title=driver.findElement(By.xpath("//div[text()='Swag Labs']"));
		ass.assertEquals(title.getText(), "Swag Labs");
		ass.assertAll();
		
		
		driver.quit();
		
	}
	
}
