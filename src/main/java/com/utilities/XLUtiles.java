package com.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLUtiles {
	
	public static FileOutputStream Fo;
	public static FileInputStream Fi;
	public static XSSFWorkbook xf;
	public static XSSFSheet ws;
	public static XSSFRow wr;
	public static XSSFCell wl;
   // public String path=null;
	
//	public XLUtiles(String path)
//	{
//		this.path=path;
//	}
	public static int rowcount(String xlfile,String xlsheet) throws Exception
	//public int rowcount(String xlsheet) throws Exception
	{
		Fi=new FileInputStream(xlfile);
		//Fi=new FileInputStream(path);
		xf=new XSSFWorkbook(Fi);
		ws=xf.getSheet(xlsheet);
		int rowcnt=ws.getLastRowNum();
		Fi.close();
		xf.close();
		System.out.println("reading the file:"+ xf);
		return rowcnt;	
	}
	public static int columncnt(String xlfile,String xlsheet,int row) throws Exception
	//public int columncnt(String xlsheet,int row) throws Exception
	{
		Fi=new FileInputStream(xlfile);
		//Fi=new FileInputStream(path);
		xf=new XSSFWorkbook(Fi);
		ws=xf.getSheet(xlsheet);
		wr=ws.getRow(row);
		//int columncnt=ws.getLastRowNum();
		int columncnt=wr.getLastCellNum();
		xf.close();
		Fi.close();
		return columncnt;
	}
	public static String getcellvalue(String xlfile,String xlsheet,int row,int col) throws Exception
	{
		Fi=new FileInputStream(xlfile);
		xf=new XSSFWorkbook(Fi);
		ws=xf.getSheet(xlsheet);
		wr=ws.getRow(row);
		wl=wr.getCell(col);
		//int cellount=wr.getLastCellNum();
		DataFormatter df=new DataFormatter();
		String data;
		try {
		data=df.formatCellValue(wl);
		}
		catch(Exception e)
		{
			data="";
			e.getMessage();
		}
		Fi.close();
		xf.close();
		return data;
	}
}
