package com.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Readconfig {
	
	Properties pro;
	
	public Readconfig() 
	{
		//File src=new File("E:\\testworkspace\\newproject\\config.properties");
		File src=new File("E:\\testworkspace\\project2\\config.properties");
		
		FileInputStream fis;
		try {
			fis = new FileInputStream(src);
			pro=new Properties();
			pro.load(fis);
		}catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public String getappurl()
	{
		String URL=pro.getProperty("url");
		
		return URL;
	}
	public String getUsername()
	{
		String Uname=pro.getProperty("username");
		return Uname;
	}
	public String getPassword()
	{
		String Pass=pro.getProperty("password");
		return Pass;
	}
	public String Chromepath()
	{
		String chp=pro.getProperty("browser");
		return chp;		
	}
	public String customerid()
	{
		String custemid=pro.getProperty("Customerid");
		return custemid;
	}
}
