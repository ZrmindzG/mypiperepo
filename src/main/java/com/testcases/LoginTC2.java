package com.testcases;

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.pageobjects.Baseclass;
import com.pageobjects.loginpage;
import com.utilities.XLUtiles;

public class LoginTC2 extends Baseclass {
	
	
	
	@Test(dataProvider="TestData")
	public void login(String username,String password) throws Exception
	{
		loginpage lp=new loginpage(driver);
		lp.setusename(username);
		Thread.sleep(1000);
		lp.setpassword(password);
		Thread.sleep(1000);
		lp.logintoapp();
		Thread.sleep(1000);
		lp.logout();
		driver.switchTo().alert().accept();
		
		
//		if(isAlertPresent()==true)
//		{
//			driver.switchTo().alert().accept();
//			driver.switchTo().defaultContent();
//			Assert.assertTrue(false);
//		}
//		else
//		{
//			Assert.assertTrue(false);
//			lp.logout();
//			driver.switchTo().alert().accept();
//			driver.switchTo().defaultContent();
//		}
		
	}
	public boolean isAlertPresent()
	{
		try {
			driver.switchTo().alert();
			return true;
		}
		catch(NoAlertPresentException e)
		{
			return false;
		}
	}
	@DataProvider(name="TestData")
	public String[][] getdata() throws Exception
	{
		//String path=System.getProperty("E:\\testworkspace\\project2\\src\\main\\java\\Testdata\\TestData.xlsx");
		String path=System.getProperty("user.dir")+"\\src\\main\\java\\Testdata\\TestData.xlsx";

		System.out.println("reading data from excel file:"+ path);
		
		int row=XLUtiles.rowcount(path, "Credentials");
		//int row=XLUtiles.rowcount("Credentials");
		int col=XLUtiles.columncnt(path, "Credentials", 1);
		//int actrow=row-1;
		//int actrow=row-1;
		//int col=XLUtiles.columncnt("Credentials", 1);
		
		System.out.println("reading data from row and column");
	    String logdata[][]= new String[row][col];
	    //String logdata[][]= new String[actrow][col];
		
		for(int i=1;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				 logdata[i-1][j]=XLUtiles.getcellvalue(path,"Credentials", i, j);
			}
		}
		return logdata;
	}

}
