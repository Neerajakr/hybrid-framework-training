package com.allianz.test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {
	
	@Test(priority=1)
	public void titleTest(){
		System.out.println("Title test ");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php");
	  //  driver.get("http://demo.openemr.io/b/openemr/");
		   
		   String actualTitle =driver.getTitle();
		   System.out.println("Title: "+actualTitle);
		   

//	@Test(invocationCount=3)
//	public void sampleTest(){
//		System.out.println("sample test ");
	}
}
