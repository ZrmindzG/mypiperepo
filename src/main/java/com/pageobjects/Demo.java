package com.pageobjects;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {
	
	public static WebDriver driver;
	
	public static void main(String[] args) throws Exception
	{
		try {
		//System.setProperty("webdriver.chrome.driver", "E:\\testworkspace\\chromedriver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		Thread.sleep(1000);
		driver.get("https://demo.guru99.com/V1/index.php");
		driver.findElement(By.xpath("//input[@type='text' and @name='uid']")).sendKeys("mngr578714");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='password' and @name='password']")).sendKeys("evAzase");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='submit' and @name='btnLogin']")).click();
		driver.close();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Telecom Project')]")).click();
//		WebElement telecompro=driver.findElement(By.xpath("//a[contains(text(),'Telecom Project')]"));
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//    	js.executeScript("arguments[0].click();", telecompro);
		}
		catch(Exception e)
		{
			System.err.println("Session is not valid: " + e.getMessage());
		}
//		if(driver!=null)
//	       {
//	    	driver.quit();
//	       }	
//	    }
	}
}	


