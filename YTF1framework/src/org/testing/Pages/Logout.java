package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logout 
{
	ChromeDriver driver;
	Properties pr;
public Logout(ChromeDriver driver, Properties pr)
{
	this.driver=driver;
	this.pr=pr;
}

public void signout() throws InterruptedException
{
	WebElement signin1=driver.findElement(By.xpath(pr.getProperty("Login1")));
	signin1.click();
	Thread.sleep(4000);
	WebElement signout=driver.findElement(By.xpath(pr.getProperty("Logout")));
	signout.click();
}
}
