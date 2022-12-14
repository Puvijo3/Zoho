package com.zoho;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zoho1 {
	static void screenShot() throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\puvana\\eclipse-workspace\\Zoho_maven\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.zoho.com/login.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Sign Up Now']")).click();
		WebElement name=driver.findElement(By.id("emailfield"));
		String text=Drivendata3.allData("Zoho", 0, 0);
		name.sendKeys(text);
		WebElement pass = driver.findElement(By.id("password"));
		String word=Drivendata3.allData("Zoho", 1, 0);
		pass.sendKeys(word);
		driver.findElement(By.id("signup-termservice")).click();
		driver.findElement(By.id("signupbtn")).click();
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\puvana\\eclipse-workspace\\Zoho_maven\\screen\\Zoho.png");
		FileUtils.copyFile(source, destination);
		
		
		
		
		
	}
public static void main(String[] args) throws IOException {
	screenShot();
}
}
