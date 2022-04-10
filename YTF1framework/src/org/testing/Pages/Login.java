package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login 
{
	ChromeDriver driver;
	Properties pr;
	public Login(ChromeDriver driver, Properties pr)
	{
		this.driver=driver;
		this.pr=pr;	
	}
public void signin(String username, String Password) throws InterruptedException
{
	WebElement Login=driver.findElement(By.xpath(pr.getProperty("Login")));
	Login.click();
	WebElement username1=driver.findElement(By.xpath(pr.getProperty("Username")));
	username1.sendKeys("thakur869941@gmail.com");
	
	WebElement next=driver.findElement(By.xpath(pr.getProperty("Mailnext")));
	next.click();
	Thread.sleep(6000);
	WebElement password=driver.findElement(By.xpath(pr.getProperty("Password")));
	password.sendKeys("Sanjeevthakur12@");
	Thread.sleep(3000);
	
	
	WebElement next1=driver.findElement(By.xpath(pr.getProperty("PasswordNext")));
	next1.click();
	Thread.sleep(5000);
}
}
