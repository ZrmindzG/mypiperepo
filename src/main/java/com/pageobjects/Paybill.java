package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Paybill {
	
	WebDriver driver;
	
	public Paybill(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[contains(text(),'Telecom Project')]")
	WebElement Telecomproject;
	
	@FindBy(xpath="//h3//a[contains(text(),'Pay Billing')]")
	WebElement paybilling;
	
	@FindBy(xpath="//input[@type='text' and @name='customer_id']")
	WebElement customerid;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement submit_button;
	
	@FindBy(xpath="//h3[contains(text(),'Customer ID:-  536898')]")
	WebElement customer_id;
	
	@FindBy(xpath="//h1[contains(text(),'Pay Billing')]")
	WebElement paybilltext;
	
	public void paybill()
	{
		paybilling.click();
	}
	public void entercustomerid(String customeridn)
	{
		customerid.clear();
		customerid.sendKeys(customeridn);
	}	
	public void submitbutton()
	{
		submit_button.click();
	}
	public void telecompro()
	{
		Telecomproject.click();
	}
	public void paybilltext()
	{
		String Apaybill="Pay Billing";
		String Expaybilltext=paybilltext.getText();
		Assert.assertEquals(Apaybill, Expaybilltext);
	}
	
	

}
