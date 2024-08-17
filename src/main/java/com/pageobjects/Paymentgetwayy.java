package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Paymentgetwayy {
	
	WebDriver driver;
	
	public Paymentgetwayy(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[contains(text(),'Payment Gateway Project')]")
	WebElement paymentgetway;
	
	@FindBy(xpath="//select[@name='quantity']")
	WebElement selectdropdown;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement buynow;
	
	@FindBy(xpath="//input[@type='text' and @name='card_nmuber']")
	WebElement cardnumber;
	
	@FindBy(xpath="//select[@name='month']")
	WebElement month;
	
	@FindBy(xpath="//select[@name='year']")
	WebElement year;
	
	@FindBy(xpath="//input[@type='text' and @name='cvv_code']")
	WebElement cvvcode;
	
	@FindBy(xpath="//input[@type='submit' and @name='submit']")
	WebElement pay;
	
	@FindBy(xpath="//h2[contains(text(),'Payment successfull!')]")
	WebElement payment_successful;
	
	@FindBy(xpath="//a[@class='button special']")
	WebElement home;
	
	public void paymentgetway()
	{
		paymentgetway.click();
	}
	
	public void selectdd()
	{
		Select sc=new Select(selectdropdown);
		sc.selectByIndex(2);
		
	}
	public void buynw()
	{
		buynow.click();
	}
	public void cardno(String key)
	{
		cardnumber.sendKeys(key);
	}
	public void month()
	{
		Select sc=new Select(month);
		sc.selectByIndex(5);
	}
	public void years()
	{
		Select sc=new Select(year);
		sc.selectByIndex(5);
	}
    public void cvvcod(String cvv)
    {
    	cvvcode.sendKeys(cvv);
    }
    public void pay()
    {
    	pay.click();
    }
    public void paymentmsg()
    {
    	String Actual_text="Payment successfull!";
    	String Expected_text=payment_successful.getText();
    	Assert.assertEquals(Actual_text, Expected_text);
    }
}
