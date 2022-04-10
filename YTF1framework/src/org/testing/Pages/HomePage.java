package org.testing.Pages;

import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage 
{
	ChromeDriver driver;
	Properties pr;
public HomePage(ChromeDriver driver, Properties pr) 
{
	this.driver=driver;
	this.pr=pr;
	
}
public void clickTrending() throws InterruptedException
{
	Thread.sleep(2000);
	List<WebElement>trendingvideo=driver.findElements(By.id(pr.getProperty("Trending_Video")));
	trendingvideo.get(2).click();
}
public void handelHistory() throws InterruptedException
{
	Thread.sleep(2000);
	WebElement History=driver.findElement(By.xpath(pr.getProperty("History")));
	History.click();
}
public void handleSubscription() throws InterruptedException
{
	Thread.sleep(2000);
	WebElement subscription=driver.findElement(By.xpath(pr.getProperty("Subscription")));
	subscription.click();
}
public void handleWatchlater() throws InterruptedException
{
	Thread.sleep(8000);
	WebElement watchlater=driver.findElement(By.xpath(pr.getProperty("WatchLater")));
	watchlater.click();
}
public void handleLibrary() throws InterruptedException
{
	Thread.sleep(2000);
	WebElement library=driver.findElement(By.xpath(pr.getProperty("Library")));
	library.click();
}
}
