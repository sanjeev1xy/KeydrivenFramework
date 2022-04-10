package org.testing.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC10 {
	
	public static void login(String userid, String password) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "../YTF1framework/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys(userid);
		driver.findElement(By.id("pass")).sendKeys(password);
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
		try {
		driver.navigate().back();
		System.out.println("navigation is successfull");
		}
		catch(Exception e)
		{
			System.out.println("navigation is fail");
		}
		
	}

}

