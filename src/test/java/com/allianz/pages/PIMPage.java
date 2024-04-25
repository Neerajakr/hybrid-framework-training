package com.allianz.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.allianz.base.WebDriverKeywords;

public class PIMPage extends WebDriverKeywords {
	
	
	private By PIMLocator=By.xpath("//span[text()='PIM']");
	private By addEmpLocator=By.linkText("Add Employee");
	private By firstNameLocator=By.name("firstName");
	private By lastNameLocator=By.name("lastName");
	private By empSaveLocator=By.xpath("//button[@type='submit']");
	private By empName;

	
	public  PIMPage (WebDriver driver) {
		super(driver);
	}
	
	public void clickOnPIM()
	{
		clickElement(PIMLocator);
	}
	
	public void clickOnAddEmployee()
	{
		clickElement(addEmpLocator);
	}
	
	public void enterFirstname(String firstname)
	{
		super.setInputText(firstNameLocator,firstname);
	}
	
	public void enterLastName(String lastname)
	{
		setInputText(lastNameLocator, lastname);
	}
	
	public void clickOnempSave()
	{
		clickElement(empSaveLocator);
	}
	
	public String getEmpName()
	{	
		return super.getText(empName);
	
	}
	
	
}
