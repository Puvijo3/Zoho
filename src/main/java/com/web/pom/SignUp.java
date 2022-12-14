package com.web.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUp {
	public static WebDriver driver;
	   @FindBy(id="signup-termservice")
	    private WebElement clickBox;
	    @FindBy(id="signupbtn")
	    private WebElement signUp;
	    public SignUp(WebDriver driver) {
	    	this.driver=driver;
	    	PageFactory.initElements(driver, this);
	    }
	    public WebElement getClickBox() {
			return clickBox;
		}
		
		public WebElement getSignUp() {
			return signUp;
		}

}
