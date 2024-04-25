package com.allianz.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.allianz.base.WebDriverKeywords;

public class LoginPage extends WebDriverKeywords {
	
//	public static void enterUsername(WebDriver driver,String username)
//	{
//		driver.findElement(By.name("username")).sendKeys(username);
//	}
	
	private WebDriver driver;
	
	private By usernameLocator=By.name("username");
	private By passwordLocator=By.name("password");
	private By loginLocator=By.xpath("//button[normalize-space()='Login']");
	private By errorLocator=By.xpath("//p[text()='Invalid credentials']");
	
	
	public  LoginPage (WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	
	public void enterUsername(String username)
	{
//		driver.findElement(By.name("username")).sendKeys(username);
//		driver.findElement(usernameLocator).sendKeys(username);
		super.setInputText(usernameLocator, username);
	}
	
	public void enterPassword(String password)
	{
//		driver.findElement(By.name("password")).sendKeys(password);
//		driver.findElement(passwordLocator).sendKeys(password);
		setInputText(passwordLocator, password);
	}
	public void clickOnLogin()
	{
//		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
//		driver.findElement(loginLocator).click();
		clickElement(loginLocator);
	}
	
	//getInvalidErrorMessage()-->should return String
	
	public String verifyLoginError()
	{
//		String actualerror =driver.findElement(By.xpath("//p[text()='Invalid credentials']")).getText();
//		String actualerror =driver.findElement(errorLocator).getText();
//		return actualerror;
		
		return super.getText(errorLocator);
	
	}
	
	public String usernamePlaceholder()
	{

//		return driver.findElement(usernameLocator).getAttribute("placeholder");
		
		return getAttributeValue(usernameLocator, "placeholder");
	}

	public String passwordPlaceholder()
	{

//		return driver.findElement(passwordLocator).getAttribute("placeholder");
		
		return getAttributeValue(passwordLocator, "placeholder");
	}
	
	
}
