package org.testing.testscripts;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testing.Assertions.Assertions;
import org.testing.Base.Base;
import org.testing.Pages.HomePage;
import org.testing.Pages.Login;
import org.testing.Pages.Logout;
import org.testing.Pages.VideoPlay;
import org.testing.utilities.ScreenShotCapture;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC4 extends Base
{
	@Test
public void TestCase4() throws InterruptedException, IOException
{
		Thread.sleep(5000);
     Login login=new Login(driver, pr);
     login.signin("username", "Password");
     Thread.sleep(3000);
     WebElement signout=driver.findElement(By.xpath("//*[@alt='Avatar image']"));
     signout.click();
     driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
     WebElement emailidveri=driver.findElement(By.xpath("//yt-formatted-string[text()='Sanjeev Thakur']"));
     String expectedresult=emailidveri.getText();
     System.out.println(expectedresult);
     Assert.assertEquals(expectedresult,"Sanjeev Thakur");
     //Assert.assertEquals(driver.getCurrentUrl(),"https://www.youtube.com/");
     String[]msg=new String[2];
     msg[0]="Assertions is passed for login";
     msg[1]="Assertions is failed for login"; 
     Assertions.assert1(driver.getCurrentUrl(), "https://www.youtube.com/",msg);
     System.out.println(driver.getCurrentUrl());
     VideoPlay videoplay=new VideoPlay(driver, pr);
     videoplay.videoplaying();
     Thread.sleep(6000);
     videoplay.videolike();
     Thread.sleep(4000);
     Logout logout=new Logout(driver, pr);
     logout.signout();
     Thread.sleep(5000);
}
}
