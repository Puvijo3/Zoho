package com.web.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SdpZoho {
	public WebDriver driver;
	public LoginPage lp;
	public SignUp sp;
	
	public LoginPage getLoginPage() {
		if(lp==null) {
			lp=new LoginPage(driver);
			
		}
		return lp;
		
	}
	public SignUp getSignUp() {
		if(sp==null) {
			sp=new SignUp(driver);
			
		}
		return sp;
	}
	public SdpZoho(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	

}
