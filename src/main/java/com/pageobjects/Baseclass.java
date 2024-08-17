package com.pageobjects;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.utilities.Readconfig;

import io.github.bonigarcia.wdm.WebDriverManager;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	
	Readconfig rcf=new Readconfig();
		
	public String URL=rcf.getappurl();
	public String username=rcf.getUsername();
	public String password=rcf.getPassword();
	public String browser=rcf.Chromepath();
	public static WebDriver driver;
	//public static WebDriver driver=null;
	public static Logger lger;
	
	@Parameters("browser")
	@BeforeClass
	//public void init(@Optional("browser") String br)
	
	
	
	public void init(String br)
	//public void init()
	{  
		lger= Logger.getLogger("Ebnaking");
		PropertyConfigurator.configure("log4j.properties");
		
		
		if(br.equals("chrome")) {
		//System.setProperty("webdriver.chrome.driver", "E:\\testworkspace\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			
			//System.setProperty("webdriver.chrome.silentOutput", "true");
			System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.manage().window().maximize();
		}
		else if(br.equals("edge"))
	     {
		WebDriverManager.edgedriver().setup();
		//System.setProperty("webdriver.edge.driver", "E:\\testworkspace\\edgedriver_win64\\msedgedriver.exe");
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		 }
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get(URL);
}

		
	
    @AfterClass
    public void teardown()
    {  if(driver!=null)
       {
    	driver.quit();
       }	
    }
}
