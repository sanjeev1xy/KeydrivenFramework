package org.testing.Base;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base
{
	public ChromeDriver driver;
	public Properties pr;
	
	@BeforeMethod
public void browserinvoke() throws IOException
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Sanjeev\\Desktop\\New Soft\\Selenium\\chromedriver_win32\\chromedriver.exe");
	driver=new  ChromeDriver();
	driver.get("https://www.youtube.com");
	driver.manage().window().maximize();
	
	File f= new File("../YTF1framework/ObjectRepo.properties");
	FileReader fr=new FileReader(f);
	pr=new Properties();
	pr.load(fr);
}
	@AfterMethod
public void close()
{	
driver.close();
}
}
