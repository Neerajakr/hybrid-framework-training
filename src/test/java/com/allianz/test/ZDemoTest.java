package com.allianz.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ZDemoTest {
	
	@DataProvider
	
//	public String[][] validData(){
//		String[][] data=new String[3][2];
	public Object[][] validData(){
		Object[][] data=new String[3][2];
		
		data[0][0]="saul";
		data[0][1]="saul123";
		data[1][0]="peter";
		data[1][1]="peter123";
		data[2][0]="kim";
		data[2][1]="kim123";
		
		return data;
		
	}

	
	
	@Test(dataProvider="validData")
	public void validTest(String username, String password) {
		
		System.out.println("valid test " +username +password);
//		driver.findElement(By.name("username")).sendKeys("Admin");
//		driver.findElement(By.name("password")).sendKeys("admin123");
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//	    boolean loginstatus =driver.findElement(By.xpath("//h6[text()='Dashboard']")).isDisplayed();
//	    System.out.println("Login: "+loginstatus);
//	    Assert.assertEquals(loginstatus,true);
	}
}
