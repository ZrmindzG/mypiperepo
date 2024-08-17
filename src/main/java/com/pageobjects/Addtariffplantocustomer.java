package com.pageobjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Addtariffplantocustomer {
	
	WebDriver ldriver;
	
	public Addtariffplantocustomer(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
//	WebDriver driver;
//	
//	public Addtariffplantocustomer(WebDriver driver)
//	{ 
//		this.driver=driver;
//		PageFactory.initElements(driver, this);
//	}
//	
	@FindBy(xpath="//a[contains(text(),'Telecom Project')]")
	WebElement Telecomproject;
    
	@FindBy(xpath="//h3//a[contains(text(),'Add Tariff Plan to Customer')]")
	WebElement Addtarifplantocustomer;
	
	@FindBy(xpath="//input[@type='text' and @name='customer_id']")
	WebElement customerid;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement submitbutton;
	
	@FindBy(xpath="//h1[contains(text(),'Add Tariff Plan to Customer')]")
	WebElement addtarifplantocustomer;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement addnewtarrifplantocustemer;
	
	@FindBy(xpath="//input[@type='radio']")
	WebElement radiobutton;
	
	@FindBy(xpath="//li//a[@class='button']")
	WebElement homebutton;
	
	@FindBy(xpath="//h2[contains(text(),'Congratulation Tariff Plan assigned')]")
	WebElement congratulationtarifftext;
	
	@FindBy(xpath="//a[@class='button' and contains(text(),'Add Tariff Plan to Customer')]")
	WebElement addtarifplantocustomerbutton;
	
	
	public void Telecomproject()
	{
		Telecomproject.click();
	}
	
	public void addtarifplantocustomer()
	{
		Addtarifplantocustomer.click();
	}
	
	public void customerid(String id)
	{
		customerid.clear();
		customerid.sendKeys(id);
	}
	public void submitbutton()
	{
		submitbutton.click();
	}
	public void tarifplancustomertext() throws Exception
	{
		String acttrrifplantxt="Add Tariff Plan to Customer";
		String exptrrifplantxt= addtarifplantocustomer.getText();
		Assert.assertEquals(acttrrifplantxt, exptrrifplantxt);
		Thread.sleep(1000);
	}
	public void addnewtariffplantocustomer()
	{
		addnewtarrifplantocustemer.click();
	}
	public void radiobutton()
	{
		JavascriptExecutor js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click();", radiobutton);
		//radiobutton.click();	
	}
	public void congratulationtarifftext() throws Exception
	{
		String exptext=congratulationtarifftext.getText();
		String acttext="Congratulation Tariff Plan assigned";
		Assert.assertEquals(acttext, exptext);
		Thread.sleep(1000);
	}
	public void homebutton()
	{
		homebutton.click();
	}
}
