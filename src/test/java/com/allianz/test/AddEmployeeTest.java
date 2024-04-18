package com.allianz.test;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.allianz.base.AutomationWrapper;

public class AddEmployeeTest extends AutomationWrapper{
	
	@Test
	public void uploadInvalidDisplayPictureTest() {
		
		System.out.println("Picture test ");
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	    driver.findElement(By.xpath("//span[text()='PIM']")).click();
	    driver.findElement(By.linkText("Add Employee")).click();
//	    driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
	    
	    driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\Administrator\\Desktop\\SamplePDF.pdf");
	    String error =driver.findElement(By.xpath("//span[text()='File type not allowed']")).getText();
	    System.out.println("Login: "+error);
	    Assert.assertEquals(error,"File type not allowed");
	    Assert.assertTrue(error.contains("File type not allowed"));
	    
	    
	    
//	    File uploadFile = new File("src/test/resources/SamplePDF.pdf");
//
//	    WebElement fileInput = driver.findElement(By.xpath("(//button[@type='button'])[3]"));
//	    
//	    fileInput.sendKeys(uploadFile.getAbsolutePath());
//	    fileInput.sendKeys("C:\\Users\\Administrator\\Desktop\\SamplePDF.pdf");
//	    driver.findElement(By.id("file-submit")).click();
//	    
//	    String error =driver.findElement(By.xpath("//span[text()='File type not allowed']")).getText();
//	    System.out.println("Login: "+error);
//	    Assert.assertEquals(error,"File type not allowed");
	    
	    
	    System.out.println("End");
	   
	    
	
	}

}
