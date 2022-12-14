package com.testNGZ;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;  
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.baseclass.Baseclass;

public class ZohoTest extends Baseclass {
	public WebDriver driver=null;
	
	@Test(priority = -1)
	public void browserLaunch() {
//		ChromeOptions ref=new ChromeOptions();
//		ChromeDriver driver= new ChromeDriver(ref);
//		ref.addArguments("start_maximized");
		driver=browserLaunch("chrome");
	
	
	}
	@Test(priority = 0)
	public void getUrl() {
		getUrl("https://www.zoho.com/login.html");
		implicity();
		
	}
	@Test(priority = 1,invocationCount = 1)
	public void signupButton() {
		WebElement signuup = driver.findElement(By.xpath("//a[text()='Sign Up Now']"));
		clickOnWE(signuup);
	}
	@Test(priority = 2)
	public void loginDetails() throws InterruptedException {
		
		WebElement mailf = driver.findElement(By.id("emailfield"));
		input(mailf, "puvana");
		
		WebElement passw = driver.findElement(By.id("password"));
		input(passw, "Password@123");
		
		
	}
	@Test(priority = 3)
	public void clickIagree() {
		WebElement checkBOx = driver.findElement(By.id("signup-termservice"));
		clickOnWE(checkBOx);
		
	}
	@Test(priority = 4,invocationCount = 1)
	public void signIn()  {
		WebElement signUp = driver.findElement(By.id("signupbtn"));
		clickOnWE(signUp);
		
		
		
	}
	@Test@Ignore
	public void takeScreenshot() throws IOException {
		takeScreenshot("Zoho");
	}
	

}
