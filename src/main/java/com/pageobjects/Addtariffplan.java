package com.pageobjects;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Addtariffplan {
	
	WebDriver ldriver;
	
	public Addtariffplan(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
//	
//	WebDriver driver;
//	
//	public Addtariffplan(WebDriver driver)
//	{
//		this.driver=driver;
//		PageFactory.initElements(driver, this);
//	}
	
	@FindBy(xpath = "//a[contains(text(),'Telecom Project')]")
	WebElement Telecomproject;
	
	@FindBy(xpath="//div[@class='flex-item right']/child::div/h3/a[contains(text(),'Add Tariff Plan')]")
	WebElement Addtrariffplan;
	
	@FindBy(xpath="//h1[contains(text(),'Add Tariff Plans')]")
	WebElement tariffplantext;
	
	@FindBy(xpath="//input[@type='text' and @name='rental']")
	WebElement monthlyrental;
	
	@FindBy(xpath="//input[@type='text' and @name='local_minutes']")
	WebElement localminutes;
	
	@FindBy(xpath="//input[@type='text' and @name='inter_minutes']")
	WebElement inter_minutes;
	
	@FindBy(xpath="//input[@type='text' and @name='sms_pack']")
	WebElement sms_pack;
	
	@FindBy(xpath="//input[@type='text' and @name='minutes_charges']")
	WebElement local_min_charges;
	
	@FindBy(xpath="//input[@type='text' and @name='inter_charges']")
	WebElement  inter_chargers;
	
	@FindBy(xpath="//input[@type='text' and @name='sms_charges']")
	WebElement sms_charges;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement submit_button;
	
	@FindBy(xpath="//input[@type='reset']")
	WebElement reset_button;
	
	@FindBy(xpath="//h2[contains(text(),'Congratulation you add Tariff Plan')]")
	WebElement congratulationtext;
	
	@FindBy(xpath="//a[@class='button']")
	WebElement home_button;
	
	public void Telecomproject() {
		Telecomproject.click();
	}
	
	public void addtafifplan()
	{
		Addtrariffplan.click();
	}
	
	public void monthlyrental(String monthlydata)
	{
		monthlyrental.clear();
		monthlyrental.sendKeys(monthlydata);
	}
	public void freelocalmin(String freelocaldata)
	{
		localminutes.clear();
		localminutes.sendKeys(freelocaldata);
	}
	public void freeinterminute(String freemin)
	{
		inter_minutes.clear();
		inter_minutes.sendKeys(freemin);
	}
	public void freesmspack(String smspack)
	{
		sms_pack.clear();
		sms_pack.sendKeys(smspack);
	}
	public void localperminutecharges(String localperminutecharges)
	{
		local_min_charges.clear();
		local_min_charges.sendKeys(localperminutecharges);
	}
	public void international_perminutecharges(String international_charges)
	{
		inter_chargers.clear();
		inter_chargers.sendKeys(international_charges);
	}
	public void smscharges(String smscharges)
	{
		sms_charges.clear();
		sms_charges.sendKeys(smscharges);
	}
	public void submitbutton()
	{
		submit_button.click();
	}
	public void resetbutton()
	{
		reset_button.click();
	}
	public void verifythetariffplanadded()
	{
		String acttext="Congratulation you add Tariff Plan";
		String exptext=congratulationtext.getText();
		Assert.assertEquals(acttext, exptext);
	}
	public void home()
	{
		home_button.click();
	}
	

}
