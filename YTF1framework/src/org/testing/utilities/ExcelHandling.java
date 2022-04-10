package org.testing.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelHandling 
{
public static void readParticularCell(int r, int c) throws IOException
{
	File f=new File("");
	FileInputStream fi=new FileInputStream(f);
	XSSFWorkbook xxw=new XSSFWorkbook(fi);
	XSSFSheet xxs=xxw.getSheetAt(0);
	r=xxs.getPhysicalNumberOfRows();
	XSSFRow xr=xxs.getRow(r);
	c=xr.getPhysicalNumberOfCells();
	XSSFCell xxc=xr.getCell(c);
	System.out.println(xxc.getStringCellValue());
	
}
public static void readParticularRow(int r) throws IOException
{
	File f=new File("");
	FileInputStream fi=new FileInputStream(f);
	XSSFWorkbook xxw=new XSSFWorkbook(fi);
	XSSFSheet xxs=xxw.getSheetAt(0);
	r=xxs.getPhysicalNumberOfRows();
	XSSFRow xr=xxs.getRow(r);
	int c=xr.getPhysicalNumberOfCells();
	for(int i=0;i<=c;i++)
	{
		XSSFCell xxc=xr.getCell(i);
		System.out.println(xxc.getStringCellValue());
	}
}
public static void readParticularRange(int r1, int r2) throws IOException
{
	File f=new File("");
	FileInputStream fi=new FileInputStream(f);
	XSSFWorkbook xxw=new XSSFWorkbook(fi);
	XSSFSheet xxs=xxw.getSheetAt(0);
	r1=xxs.getPhysicalNumberOfRows();
	for(int i=r1;i<=r2;i++)
	{
		XSSFRow xr=xxs.getRow(i);
		int c=xr.getPhysicalNumberOfCells();
		for(int j=0;j<=c;j++)
		{
			XSSFCell xxc=xr.getCell(j);
			System.out.println(xxc.getStringCellValue());
		}
	}
}
}
