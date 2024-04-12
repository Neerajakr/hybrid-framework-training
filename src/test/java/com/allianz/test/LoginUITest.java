package com.allianz.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginUITest {
	
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
		   Assert.assertEquals(actualTitle, "OrangeHRM");
	}
	
	@Test
	public void applicationTest(){
		System.out.println("Title test ");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php");
	
	    String actualVersion =driver.findElement(By.xpath("//p[text()='OrangeHRM OS 5.6.1']")).getText();
	    System.out.println("Title: "+actualVersion);
	    Assert.assertEquals(actualVersion, "OrangeHRM OS 5.6.");
	}

//	@Test(invocationCount=3)
//	public void sampleTest(){
//		System.out.println("sample test ");
//	}
}