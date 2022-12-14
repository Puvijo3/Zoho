package com.baseclass;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Baseclass {
	public static WebDriver driver=null;
	public static WebDriver browserLaunch(String value) {
		if(value.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\puvana\\eclipse-workspace\\AdactinPro\\driver\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(value.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", "C:\\\\Users\\\\puvana\\\\eclipse-workspace\\\\AdactinPro\\\\driver\\\\edgedriver.exe");
		driver=new EdgeDriver();
		}
		else if(value.equalsIgnoreCase("gecko")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\puvana\\eclipse-workspace\\AdactinPro\\driver\\geckodriver.exe");
		driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		return driver;
		
	}
	public static void close() {
		driver.close();
	}
	public static void getUrl(String value) {
		driver.get(value);
		
	}
	public static void implicity() {
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}
	public static String getTitle() {
		String title=driver.getTitle();
		return title;
		
	}
	public static void navigateback() {
		driver.navigate().back();
	}
	public static void input(WebElement element,String value) {
		element.sendKeys(value);
		
	}
 public static void clickOnWE(WebElement element) {
	 element.click();
	 
 }
 public static void thread() throws InterruptedException {
	 Thread.sleep(3000);
 }
 public static void takeScreenshot(String filename) throws IOException {
	 TakesScreenshot ts=(TakesScreenshot) driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\puvana\\eclipse-workspace\\Zoho_maven\\screen\\"+ filename+".png");
		FileUtils.copyFile(source, destination);
 }
}
