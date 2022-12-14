package com.stepdefinition4;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.baseclass.Baseclass;
import com.property.ConfigurationHelper;
import com.runnerclass4.Runnerclass4;
import com.web.pom.SdpZoho;
import com.zoho.Drivendata3;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Stepdefinition4 extends Baseclass{
	public static WebDriver driver=Runnerclass4.driver;
	SdpZoho az=new SdpZoho(driver);

@Given("user Launch The Application")
public void user_launch_the_application() throws IOException {
	String url=ConfigurationHelper.getInstance().getUrl();
	getUrl(url);
	
}

@When("user Enters The Login Informations")
public void user_enters_the_login_informations() throws IOException {
	//WebElement signupp = driver.findElement(By.xpath("//a[text()='Sign Up Now']"));
	clickOnWE(az.getLoginPage().getSignupp());
	//WebElement name=driver.findElement(By.id("emailfield"));
	String sheet = ConfigurationHelper.getInstance().getSheet();
	String text=Drivendata3.allData(sheet, 0, 0);
	input(az.getLoginPage().getName(), text);    
	//WebElement pass = driver.findElement(By.id("password"));
	String word=Drivendata3.allData(sheet, 1, 0);
      input(az.getLoginPage().getPass(), word);
      //WebElement phone = driver.findElement(By.name("rmobile"));
      String phone=Drivendata3.allData(sheet, 2, 0);
      input(az.getLoginPage().getPhone(), phone);
}

@Then("user Click The Sign-Up Button")
public void user_click_the_sign_up_button() throws InterruptedException {
	Thread.sleep(2000);
	//WebElement clickBox=driver.findElement(By.id("signup-termservice"));
	clickOnWE(az.getSignUp().getClickBox());
	//WebElement signUp=driver.findElement(By.id("signupbtn"));
	clickOnWE(az.getSignUp().getSignUp());

}

@Then("user Get The Screenshot Of The Current Page")
public void user_get_the_screenshot_of_the_current_page() throws IOException {
	takeScreenshot("Zoo");
	

}

}
