package com.allianz.test;

import java.io.File;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.allianz.base.AutomationWrapper;
import com.allianz.pages.LoginPage;
import com.allianz.pages.PIMPage;
import com.allianz.utils.DataUtils;

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
//	 upload from local   
//	    driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\Administrator\\Desktop\\SamplePDF.pdf");
//	upload from Project   
	    File file = new File("src/test/resources/files/SamplePDF.pdf");
	    String path=file.getAbsolutePath(); 
	    driver.findElement(By.xpath("//input[@type='file']")).sendKeys(path);
	    String error =driver.findElement(By.xpath("//span[text()='File type not allowed']")).getText();
	    System.out.println("Login: "+error);
	    Assert.assertEquals(error,"File type not allowed");
	    Assert.assertTrue(error.contains("File type not allowed"));
	    System.out.println("End");   
	
	}
	
	
	@Test(dataProvider="commonDataProvider",dataProviderClass=DataUtils.class)
	public void addEmployee(String username, String password,String firstname,String lastname) {
		System.out.println("Add Employee ");
		String empName= firstname.concat(" ").concat(lastname);
		System.out.println(empName);
		LoginPage loginPage = new LoginPage(driver);
		PIMPage PIMPage = new PIMPage(driver);
		
		loginPage.enterUsername(username);
		loginPage.enterPassword(password);
		loginPage.clickOnLogin();
		
		PIMPage.clickOnPIM();
		PIMPage.clickOnAddEmployee();
		PIMPage.enterFirstname(firstname);
		PIMPage.enterLastName(lastname);
		PIMPage.clickOnempSave();
		String actualempName=PIMPage.getEmpName();
		Assert.assertEquals(actualempName,empName);
	}

}
