package com.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pageobjects.Baseclass;
import com.pageobjects.loginpage;

public class LoginTC1 extends Baseclass{

	
	public loginpage lg=new loginpage(driver);
	//loginpage lg1;
	
	@Test
	public void inittc() throws Exception
	{
		System.out.println("driver="+ driver);
		//driver.get(URL);
		//lger.info("executing testcases");
		lger.info("executing tc");
		Thread.sleep(1000);
		loginpage lg=new loginpage(driver);
		//lg1=new loginpage(driver);
		lger.info("Entering username");
		lg.setusename(username);
		Thread.sleep(500);
		lger.info("Entering password");
		lg.setpassword(password);
		Thread.sleep(500);
		lger.info("click on login button");
		lg.logintoapp();
		
//		
//		
//		if(driver.getTitle().equals("Home"))
//		{
//			Assert.assertTrue(true);
//			System.out.println("login is passed");
//			Thread.sleep(3000);
//		}
//		else
//		{
//			Assert.assertTrue(false);
//			System.out.println("login is failed");
//			
//		}
		Thread.sleep(1000);
	}
	

}
