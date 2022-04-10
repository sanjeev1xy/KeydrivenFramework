package org.testing.Pages;

import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class VideoPlay 
{
	ChromeDriver driver;
	Properties pr;
	public VideoPlay(ChromeDriver driver,Properties pr) 
	{
		this.driver=driver;
		this.pr=pr;
	}
   public void videoplaying() throws InterruptedException
   {
	   Thread.sleep(4000);
		List<WebElement>videoplay=driver.findElements(By.id(pr.getProperty("Trending_Video")));
		videoplay.get(5).click();
   }
   public void videolike() throws InterruptedException
   {
	   Thread.sleep(3000);
		WebElement like=driver.findElement(By.xpath(pr.getProperty("Like")));
		like.click();
   }
   public void videoChannelSubscribe() throws InterruptedException
   {
	   Thread.sleep(8000);
		WebElement subscriber=driver.findElement(By.xpath(pr.getProperty("Subscriber")));
		subscriber.click();
   }
   public void videoComment() throws InterruptedException
   {
	   Thread.sleep(3000);
	   Actions ac=new Actions(driver);
	   ac.sendKeys(Keys.PAGE_DOWN).perform();
	   Thread.sleep(3000);
	   //WebElement shortby=driver.findElement(By.xpath("//*[@*='dropdown-trigger style-scope yt-dropdown-menu']"));
	   WebElement shortby=driver.findElement(By.xpath("//tp-yt-paper-button[@id='label']"));
	   shortby.sendKeys(Keys.TAB);
	   Thread.sleep(4000);
	   WebElement comment=driver.findElement(By.id(pr.getProperty("Comment")));
	   comment.sendKeys("Good");
	   WebElement commentclick=driver.findElement(By.xpath(pr.getProperty("CommentClick")));
	   commentclick.click();
   }
}
