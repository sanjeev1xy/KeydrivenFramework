package org.testing.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TC9 {

	
	public static void login(String Userid, String Passwrod) throws InterruptedException {
		ChromeOptions options=new ChromeOptions();
		System.setProperty("webdriver.chrome.driver", "../YTF1framework/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver(options);
		options.addArguments("--disable-notifications");
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys(Userid);
		driver.findElement(By.id("pass")).sendKeys(Passwrod);
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
		try {
		driver.navigate().back();
		System.out.println("Navigation is successfull");
		}
		catch(Exception e) {
			System.out.println("Navigation is not successsfull");
			
		}
		
		
		
	}

}
