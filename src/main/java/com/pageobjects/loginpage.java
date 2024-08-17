package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage  {
	
	WebDriver ldriver;
	
	public loginpage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//input[@type='text' and @name='uid']")
	public WebElement Username;
	
	@FindBy(xpath="//input[@type='password' and @name='password']")
	public WebElement Password;
	
	@FindBy(xpath="//input[@type='submit' and @name='btnLogin']")
	public WebElement Login;
	
	@FindBy(xpath="//a[contains(text(),'Log out')]")
	public WebElement logout;
	
	
	
//	@FindBy(xpath="//input[@class='oxd-input oxd-input--active oxd-input--error' and @name='username']")
//	public WebElement username;
//	
//	@FindBy(xpath="//input[@class='oxd-input oxd-input--active' and @name='password']")
//	public WebElement password;
//	
//	@FindBy(xpath="//button[@type='submit' and @class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")
//	public WebElement login;
	
	public void setusename(String username) throws Exception
	{
		Username.clear();
		Username.sendKeys(username);
		Thread.sleep(1000);
		
	}
    public void setpassword(String password) throws Exception
    {
    	Password.clear();
    	Password.sendKeys(password);
    	Thread.sleep(1000);
    }
    public void logintoapp()
    {
    	Login.click();
    }
    public void logout()
    {
    	logout.click();
    }
    
}
