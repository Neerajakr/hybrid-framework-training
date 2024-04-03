package com.allianz.test;

import org.testng.annotations.Test;

public class LoginUITest {
	
	@Test(priority=1)
	public void titleTest(){
		System.out.println("Title test ");
	}

	@Test(invocationCount=3)
	public void sampleTest(){
		System.out.println("sample test ");
	}
}
