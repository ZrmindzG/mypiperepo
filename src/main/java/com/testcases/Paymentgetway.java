package com.testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.pageobjects.Baseclass;
import com.pageobjects.Paymentgetwayy;
import com.utilities.XLUtiles;

public class Paymentgetway extends Baseclass{
	
	LoginTC2 lg=new LoginTC2();
	LoginTC1 lg1=new LoginTC1();
	public Paymentgetwayy pay;
	
	

    @Test(dataProvider="Paymentdetails")
	public void paymentgetwy(String key,String cvv) throws Exception
	{
		pay=new Paymentgetwayy(driver);
		Thread.sleep(1000);
		pay.paymentgetway();
		Thread.sleep(1000);
		pay.selectdd();
		Thread.sleep(1000);
		pay.buynw();
		Thread.sleep(1000);
		pay.cardno(key);
		Thread.sleep(1000);
		pay.month();
		Thread.sleep(1000);
		pay.cvvcod(cvv);
		Thread.sleep(1000);
		pay.pay();
	}
	
	@DataProvider(name="Paymentdetails")
	public String[][] paymentdata() throws Exception
	{
		String xcelpath="E:\\testworkspace\\project2\\src\\main\\java\\Testdata\\TestData.xlsx";
		
		int row=XLUtiles.rowcount(xcelpath, "Paymentdetails");
		
		int col=XLUtiles.columncnt(xcelpath, "Paymentdetails", 1);
		
		String  data[][]= new String[row][col];
		
		for(int i=1;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				 data[i-1][j] =XLUtiles.getcellvalue(xcelpath, "Paymentdetails", i+1, j);
			}
		}
		
		return data;
	}
	

}
