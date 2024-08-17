package com.testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.pageobjects.Addcustomerpage;
import com.pageobjects.Baseclass;
import com.utilities.XLUtiles;

public class Resetbutton extends Baseclass {
	
	LoginTC2 lg=new LoginTC2();
	LoginTC1 lg1=new LoginTC1();
	public Addcustomerpage tarif;
	
	@Test(dataProvider="CustomerDetails")
	public void resetbutton(String firstname,String lastname,String email,String enteraddres,String mobileno) throws Exception
	{
		tarif=new Addcustomerpage(driver);
		lg1.inittc();
		tarif.Telecomproject();
		tarif.Addcustomer();
		Thread.sleep(2000);
		//tarif.waitstatement();
		Thread.sleep(1000);
	   	//tarif.scroll();
	   	tarif.Donebutton();
		Thread.sleep(1000);
	   	//click on the pending button
	   	//tarif.pending();
	   	Thread.sleep(4000);
	   //tarif.reset();
	   	Thread.sleep(1000);
		tarif.Firstname(firstname);
		Thread.sleep(4000);
		tarif.Lastname(lastname);
		Thread.sleep(4000);
		tarif.Email(email);
		Thread.sleep(4000);
		tarif.Address(enteraddres);
		Thread.sleep(4000);
		tarif.phoneno(mobileno);
		Thread.sleep(2000);
		tarif.reset();
		
	}

	@DataProvider(name="CustomerDetails")
	public String[][] excldata1() throws Exception
	{
		String exclpath=System.getProperty("user.dir")+"\\src\\main\\java\\Testdata\\TestData.xlsx";
		
		int row=XLUtiles.rowcount(exclpath, "CustomerDetails");
		
		int col=XLUtiles.columncnt(exclpath, "CustomerDetails", 1);
		
		String logdata[][]=new String[row][col];
		//String logdata[][] = new String[row - 1][col];
		
		//for(int i=0;i<row;i++)
		for(int i=1;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				//logdata[i][j]=XLUtiles.getcellvalue(exclpath, "CustomerDetails", i, j);
				logdata[i - 1][j] = XLUtiles.getcellvalue(exclpath, "CustomerDetails", i, j);
			}
		}
		
		return logdata;
		
		
	}
	
}
