 package com.pageobjects;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Addcustomerpage {

	WebDriver ldriver;

	public Addcustomerpage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

//	WebDriver driver;
//	
//	public Addcustomerpage(WebDriver driver)
//	{
//	  this.driver=driver;
//	  PageFactory.initElements(driver,this);
//	}

	@FindBy(xpath = "//a[contains(text(),'Telecom Project')]")
	WebElement Telecomproject;

	@FindBy(xpath = "//h3//a[contains(text(),'Add Customer')]")
	WebElement Addcustomer;

	// @FindBy(xpath="//input[@type='radio' and @id='done']")
	// @FindBy(id="done")
	@FindBy(xpath = "//form//div[@class='row uniform']//input[@type='radio' and @id='done']")
	WebElement Donebutton;

	@FindBy(xpath = "//input[@type='radio' and @id='pending']")
	WebElement Pendingbutton;

	@FindBy(xpath = "//input[@type='text' and @name='fname']")
	WebElement Firstname;

	@FindBy(xpath = "//input[@type='text' and @name='lname']")
	WebElement Lastname;

	@FindBy(xpath = "//input[@type='email' and @name='emailid']")
	WebElement email;

	@FindBy(xpath = "//textarea[@name='addr' and @id='message']")
	WebElement Addressfield;

	@FindBy(xpath = "//input[@type='text' and @name='telephoneno']")
	WebElement Phoneno;

	@FindBy(xpath = "//input[@type='submit']")
	WebElement Submitbutton;

	@FindBy(xpath = "//input[@type='reset']")
	WebElement Reset;

	public void Telecomproject() {
		Telecomproject.click();
	}

	public void Addcustomer() {
		Addcustomer.click();
	}

	public void Donebutton() {
		JavascriptExecutor js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click();", Donebutton);

	}

	public void scroll() {
		JavascriptExecutor js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView();", Donebutton);
	}

	public void pending() {
		JavascriptExecutor js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click()", Pendingbutton);
	}

	public void Firstname(String firstName) {
//    	Actions act=new Actions(ldriver);
//    	act.sendKeys(firstName);
//    	act.sendKeys(Firstname, firstName).perform();

		JavascriptExecutor js = (JavascriptExecutor) ldriver;
//      js.executeScript("arguments[0].value=firstName", Firstname);
		js.executeScript("arguments[0].value=arguments[1]", Firstname, firstName);
		// String text = "Hello, World!";
		// js.executeScript("arguments[0].value = arguments[1];",firstName, Firstname );
		// js.executeScript("arguments[0].value='firstName'", Firstname);

		// Firstname.clear();
		// Firstname.sendKeys(firstName);
//      Actions act=new Actions(ldriver);
//      act.doubleClick(Firstname).build().perform();

//      Thread.sleep(20000);
//      Robot robot=new Robot();
//      robot.keyPress(KeyEvent.VK_SPACE);
//      robot.keyRelease(KeyEvent.VK_SPACE);
//      Thread.sleep(20000);
//      robot.keyPress(KeyEvent.VK_S);
//      robot.keyRelease(KeyEvent.VK_S);
//      Thread.sleep(20000);
//      robot.keyPress(KeyEvent.VK_E);
//      robot.keyRelease(KeyEvent.VK_E);
//      Thread.sleep(20000);
//      robot.keyPress(KeyEvent.VK_N);
//      robot.keyRelease(KeyEvent.VK_N);
//      Thread.sleep(20000);
//      robot.keyPress(KeyEvent.VK_D);
//      robot.keyRelease(KeyEvent.VK_D);
//      Thread.sleep(20000);
	}

	public void waitstatement() {
		WebDriverWait wait = new WebDriverWait(ldriver, 2000);
//    	wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//input[@type='text' and @name='fname']")));
//    	WebDriverWait wait = new WebDriverWait(ldriver,2000);
//    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='text' and @name='fname']")));

		WebElement clickableElement = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='text' and @name='fname']")));
		clickableElement.click();

//    	
//    	
////    	WebDriverWait wait;
////		try {
////			wait = new WebDriverWait(ldriver, TimeSpan.FromSeconds(10));
////		} catch (Exception e) {
////			// TODO Auto-generated catch block
////			e.printStackTrace();
////		}
////    	WebElement form = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Firstname)));
	}

	public void Lastname(String lastName) {
		Lastname.clear();
		Lastname.sendKeys(lastName);
	}

	public void Email(String Email) {
		email.clear();
		email.sendKeys(Email);
	}

	public void Address(String data) {
		Addressfield.clear();
		Addressfield.sendKeys(data);
	}

	public void phoneno(String number) {
		Phoneno.clear();
		Phoneno.sendKeys(number);
	}

	public void submitbutton() {
		Submitbutton.click();
	}

	public void reset() {
		Reset.click();
	}

	public void alertmethod() {
		if (isAlertPresent() == true) {
			ldriver.switchTo().alert().accept();
			ldriver.switchTo().defaultContent();
			Assert.assertTrue(false);
		} else {
			Assert.assertTrue(false);
			ldriver.switchTo().alert().accept();
			ldriver.switchTo().defaultContent();
		}

	}

	public boolean isAlertPresent() {
		try {
			ldriver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
	}

}
