package com.allianz.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.allianz.base.WebDriverKeywords;

public class DashboardPage extends WebDriverKeywords {
	
private WebDriver driver;

private By dashboardHeaderLocator=By.xpath("//h6[contains(normalize-space(),'Dash')]");
	
	public  DashboardPage (WebDriver driver) {
		super(driver);
		this.driver=driver;
	}

	
	public String verifyDashboard()
	{
//		String actualHeader = driver.findElement(By.xpath("//h6[contains(normalize-space(),'Dash')]")).getText();
//		return actualHeader;
		
		return getText(dashboardHeaderLocator);
	
	}
	
	public void clickOnAssignLeave()
	{
		driver.findElement(By.xpath("//button[@title='Assign Leave']")).click();
	}
	
	
	public void clickOnLeaveList()
	{
		driver.findElement(By.xpath("//button[@title='Leave List']")).click();
	}
	
	public void clickOnTimeSheet()
	{
		driver.findElement(By.xpath("//button[@title='Timesheets']")).click();
	}
}
