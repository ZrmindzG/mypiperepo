package com.utilities;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;
import org.apache.poi.xdgf.usermodel.section.CharacterSection;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
//import com.aventstack.extentreports.reporter.ExtentReporter;
//import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Reporting extends TestListenerAdapter {
	
	public static ExtentHtmlReporter ehr;
	public ExtentReports extent;
	public ExtentTest lger;
	
	public void onStartofTC(ITestContext testContext)
	{
		String timestamp=new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		String repName="Test-report-"+timestamp+".html";
		
	    ehr=new ExtentHtmlReporter(System.getProperty("user.dir")+"/Extend-Report/"+ repName);
	    ehr.loadXMLConfig(System.getProperty("user.dir")+"/extent-config.xml");
	    
	    extent=new ExtentReports();
	    
	    extent.attachReporter(ehr);
	    extent.setSystemInfo("hostname", "localhost");
	    extent.setSystemInfo("Environment", "QA");
	    extent.setSystemInfo("user", "omprabhu");
	    
	    ehr.config().setDocumentTitle("internetBanking curreent project");
	    ehr.config().setReportName("Functional test automation report");
	    //ehr.config().setTestViewChartLocation(ChartLocation.TOP);
	    ehr.config().setTheme(Theme.DARK);
	}
	public void OnTestsuccess(ITestResult tr)
	{
		lger=extent.createTest(tr.getName());
		lger.log(Status.PASS,MarkupHelper.createLabel(tr.getName(),ExtentColor.GREEN));
	}	
	public void OnTestfailure(ITestResult tr)
	{
		lger=extent.createTest(tr.getName());
		lger.log(Status.PASS,MarkupHelper.createLabel(tr.getName(),ExtentColor.RED));
		String screenshotpath=System.getProperty("E:\\testworkspace\\project2\\Screenshot"+".png");
		
		File f=new File(screenshotpath);
	    if(f.exists())
	    {
	    	try {
	    		lger.fail("Screenshot is below:"+ lger.addScreenCaptureFromPath(screenshotpath));
	    	}
	    	catch(Exception e)
	    	{
	    		e.getStackTrace();
	    		
	    	}
	    }
	}
	public void onTestskipped(ITestResult tr)
	{
		lger=extent.createTest(tr.getName());
		lger.log(Status.PASS,MarkupHelper.createLabel(tr.getName(),ExtentColor.ORANGE));
	}
	public void onFinish(ITestResult testContext)
	{
		extent.flush();
	}
	
}