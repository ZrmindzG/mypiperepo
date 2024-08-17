package com.testcases;

import org.testng.annotations.Test;

import com.pageobjects.Addcustomerpage;
import com.pageobjects.Addtariffplan;
import com.pageobjects.Addtariffplantocustomer;
import com.pageobjects.Baseclass;
import com.utilities.Readconfig;

public class Addtarifplantocustomer extends Baseclass {
	
	LoginTC2 lg=new LoginTC2();
	LoginTC1 lg1=new LoginTC1();
	public Addcustomerpage tarif;
	public Addtariffplantocustomer adtarif;
	public Addtariffplan adtarif2;
	public Readconfig rdcnfig;
	
	@Test
	public void addnewplancustomer() throws Exception
	{
		adtarif = new Addtariffplantocustomer(driver);
		Thread.sleep(1000);
		tarif =new Addcustomerpage(driver);
		adtarif2 = new Addtariffplan(driver);
		rdcnfig =new Readconfig();
		lg1.inittc();
		Thread.sleep(1000);
		tarif.Telecomproject();
		Thread.sleep(1000);
		adtarif.addtarifplantocustomer();
		Thread.sleep(1000);
		String cid=rdcnfig.customerid();
		adtarif.customerid(cid);
		Thread.sleep(2000);
		adtarif.submitbutton();
		Thread.sleep(1000);
		adtarif.radiobutton();
		Thread.sleep(1000);
		adtarif.addnewtariffplantocustomer();
		Thread.sleep(1000);
		adtarif.congratulationtarifftext();
		Thread.sleep(1000);
		adtarif.homebutton();
		
	}
	
	

}
