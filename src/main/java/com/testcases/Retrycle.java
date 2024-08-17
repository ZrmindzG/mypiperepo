package com.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pageobjects.Baseclass;

public class Retrycle {
	
	public static WebDriver driver;
	
	@Test(retryAnalyzer=com.testcases.Retry.class)
	public void st() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "E:\\testworkspace\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://demo.guru99.com/V1/index.php");
		Assert.assertTrue(false);
	}

}
