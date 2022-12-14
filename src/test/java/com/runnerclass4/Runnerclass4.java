package com.runnerclass4;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.baseclass.Baseclass;
import com.property.ConfigurationHelper;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\puvana\\eclipse-workspace\\Zoho_maven\\src\\test\\java\\com\\feature3\\Zoho.feature", glue="com.stepdefinition4",monochrome=true,plugin= {"pretty",
        "html:Report/htmlReport.html",
        "json:Report/jsonreport.json",
        "junit:Report/junitReport.xml"
        //"com.cucumber.listener.ExtentCucumberFormatter:Report/ExtentReport.html"
        })

public class Runnerclass4 extends Baseclass{
	public static WebDriver driver=null;
	@BeforeClass 
	public static void setUp() throws IOException {
		String browser=ConfigurationHelper.getInstance().getBrowser();
	driver=browserLaunch(browser);
		}
	@AfterClass
	public static void tearDown() {
close();
	}



}
