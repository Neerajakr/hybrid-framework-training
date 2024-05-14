package com.allianz.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.allianz.base.AutomationWrapper;



public class LoginUITest extends AutomationWrapper {
	
	//@Test(priority=1)
	@Test(groups= {"ui"})
	public void titleTest(){
		   System.out.println("Title test ");	   
		   String actualTitle =driver.getTitle();
		   System.out.println("Title: "+actualTitle);
		   Assert.assertEquals(actualTitle, "OrangeHRM");
	}
	
	//@Test
	@Test(groups= {"ui","smoke"})
	public void applicationTest(){
//		System.out.println("Title test ");
//		WebDriver driver =new ChromeDriver();
//		driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php");
	
	    String actualVersion =driver.findElement(By.xpath("//p[text()='OrangeHRM OS 5.6.1']")).getText();
	    System.out.println("Title: "+actualVersion);
	    Assert.assertEquals(actualVersion, "OrangeHRM OS 5.6.1");
	}

//	@Test(invocationCount=3)
//	public void sampleTest(){
//		System.out.println("sample test ");
//	}
}
