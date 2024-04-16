package com.allianz.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.allianz.base.AutomationWrapper;
import com.allianz.utils.DataUtils;

public class LoginTest extends AutomationWrapper{
	
	@Test
	public void validLoginTest() {
		
		System.out.println("Login test ");
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	    boolean loginstatus =driver.findElement(By.xpath("//h6[text()='Dashboard']")).isDisplayed();
	    System.out.println("Login: "+loginstatus);
	    Assert.assertEquals(loginstatus,true);
	}
	
//	@Test
//	public void invalidLoginTest() {
//		
//		System.out.println("Login test ");
//		driver.findElement(By.name("username")).sendKeys("Ad");
//		driver.findElement(By.name("password")).sendKeys("ad");
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//	    String error =driver.findElement(By.xpath("//p[text()='Invalid credentials']")).getText();
//	    System.out.println("Login: "+error);
//	    Assert.assertEquals(error,"Invalid credentials");
//	}
	

	
	@Test(dataProvider="invalidLoginData",dataProviderClass=DataUtils.class)
	public void invalidLoginTest(String username, String password, String error) {
		
		System.out.println("Login test ");
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	    String actualerror =driver.findElement(By.xpath("//p[text()='Invalid credentials']")).getText();
	    System.out.println("Login: "+actualerror);
	    Assert.assertEquals(actualerror,error);
	}
	
	
}
