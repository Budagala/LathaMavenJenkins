package com.pack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class MavenJenkinsTestCase {
	
	WebDriver driver;
	
	@BeforeClass
	public void setUP()
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium Related Jar Files\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.google.co.in");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void firstTestCase() throws InterruptedException
	{
		
		driver.findElement(By.name("q")).sendKeys("Selenium Integration with Maven");
		driver.findElement(By.name("q")).submit();
		System.out.println(driver.getTitle());
	    Assert.assertTrue(driver.getTitle().contains("Google"));         
		Thread.sleep(3000);
		
	}
	

}
