package com.testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.pageobjects.Addcustomerpage;
import com.pageobjects.Addtariffplan;
import com.pageobjects.Baseclass;
import com.utilities.XLUtiles;

public class Userabletoaddtariffplan extends Baseclass {
	
	
	LoginTC2 lg=new LoginTC2();
	LoginTC1 lg1=new LoginTC1();
	//public Addcustomerpage tarif;
	public Addtariffplan at;
	
	
	
	@Test(dataProvider="Tariffplan")
	public void addtariffplan(String monthlyrental,String freelocal_minutes,String freeInternationalminutes,String freesmspack,String localperminutecharges,String international_perminutecharges,String sms_percharges) throws Exception
	{   
//	    @Test(dataProvider="AddTariffplan")
//		public void addtariffplan(String monthlyrental,String freelocal_minutes,String freeInternationalminutes) throws Exception
//		{	
		
		//tarif=new Addcustomerpage(driver);
		//Thread.sleep(1000);
		at=new Addtariffplan(driver);
		//Thread.sleep(1000);
		lg1.inittc();
		at.Telecomproject();
		//Thread.sleep(1000);
		at.addtafifplan();
		Thread.sleep(1000);
		at.monthlyrental(monthlyrental);
		Thread.sleep(1000);
		at.freelocalmin(freelocal_minutes);
		Thread.sleep(1000);
		at.freeinterminute(freeInternationalminutes);
		Thread.sleep(1000);
		at.freesmspack(freesmspack);
		Thread.sleep(1000);
		at.localperminutecharges(localperminutecharges);
		Thread.sleep(1000);
		//at.freeinterminute(SMS_percharges);
		at.international_perminutecharges(international_perminutecharges);
		Thread.sleep(1000);
		at.smscharges(sms_percharges);
		Thread.sleep(1000);
		at.submitbutton();
	}
	
	@DataProvider(name="Tariffplan")
	public String[][] exceldata2() throws Exception
	{
		
			String exclpath=System.getProperty("user.dir")+"\\src\\main\\java\\Testdata\\TestData.xlsx";
			
			int row=XLUtiles.rowcount(exclpath, "Tariffplan");
			
			int col=XLUtiles.columncnt(exclpath, "Tariffplan", 1);
			
			String logdata[][]=new String[row][col];
			
			for(int i=1;i<row;i++)
			{
     			for(int j=0;j<col;j++)
				{
//					//logdata[i][j]=XLUtiles.getcellvalue(exclpath, "CustomerDetails", i, j);
					logdata[i - 1][j] = XLUtiles.getcellvalue(exclpath, "AddTariffplan", i+1, j);
     			}
			}
			
			return logdata;
		}

//		String xceldata=System.getProperty("user.dir")+"\\src\\main\\java\\Testdata\\TestData.xlsx";
//		
//		int getrow=XLUtiles.rowcount(xceldata, "AddTariffplan");
//		
//		int getcol=XLUtiles.columncnt(xceldata, "AddTariffplan", 1);
//		
//		String exdata[][]= new String[getrow][getcol];
//		
//		//String exdata[][]= new String[getrow-1][getcol];
//		
//		for(int i=1;i<getrow;i++)
//		{
//			for(int j=0;j<getcol;j++)
//			{
//				exdata[i - 1][j] =XLUtiles.getcellvalue(xceldata, "AddTariffplan", i+1, j);
//			}
//		}
//		
//		return exdata;
		
	}
	
//	@DataProvider(name="CustomerDetails")
//	public String[][] excldata() throws Exception
//	{
//		String exclpath=System.getProperty("user.dir")+"\\src\\main\\java\\Testdata\\TestData.xlsx";
//		
//		int row=XLUtiles.rowcount(exclpath, "CustomerDetails");
//		
//		int col=XLUtiles.columncnt(exclpath, "CustomerDetails", 1);
//		
//		String logdata[][]=new String[row][col];
//		
//		for(int i=1;i<row;i++)
//		{
//			for(int j=0;j<col;j++)
//			{
//				//logdata[i][j]=XLUtiles.getcellvalue(exclpath, "CustomerDetails", i, j);
//				logdata[i - 1][j] = XLUtiles.getcellvalue(exclpath, "CustomerDetails", i+1, j);
//			}
//		}
//		
//		return logdata;
		
		
	

	 
	
//}
