package com.web.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public static WebDriver driver;
	@FindBy(xpath="//a[text()='Sign Up Now']")
	private WebElement signupp;
	
    @FindBy(id="emailfield")
    private WebElement name;
    @FindBy(id="password")
    private WebElement pass;
    @FindBy(id="rmobile")
    private WebElement phone;
 
    public LoginPage(WebDriver driver) {
    	this.driver=driver;
    	PageFactory.initElements(driver, this);
    }
	
	public WebElement getSignupp() {
		return signupp;
	}
 
	public WebElement getName() {
		return name;
	}
	
	public WebElement getPass() {
		return pass;
	}
	
	public WebElement getPhone() {
		return phone;
	}
	
	


    
  
    
}
