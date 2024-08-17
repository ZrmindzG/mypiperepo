package com.testcases;

import org.testng.annotations.Test;

import com.pageobjects.Addtariffplantocustomer;
import com.pageobjects.Baseclass;
import com.pageobjects.Paybill;
import com.utilities.Readconfig;

public class PaybillTC extends Baseclass {
	
	LoginTC2 lg=new LoginTC2();
	LoginTC1 lg1=new LoginTC1();
	public Paybill bill;
	public Addtariffplantocustomer adtarif;
	public Readconfig rdcnfig;
	
	
	@Test
	public void paybill() throws Exception
	{
		bill=new Paybill(driver);
		Thread.sleep(1000);
		adtarif =new Addtariffplantocustomer(driver);
		rdcnfig =new Readconfig();
		Thread.sleep(1000);
		lg1.inittc();
		Thread.sleep(1000);
	    bill.telecompro();
	    Thread.sleep(1000);
	    bill.paybill();
	    Thread.sleep(1000);
	    String cid=rdcnfig.customerid();
	    adtarif.customerid(cid);
	    Thread.sleep(1000);
	    bill.submitbutton();
	    Thread.sleep(1000);
		bill.paybilltext();
	}

}
