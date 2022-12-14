package com.zoho;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import com.baseclass.Baseclass;
import com.property.ConfigurationHelper;
import com.web.pom.LoginPage;
import com.web.pom.SdpZoho;

public class Zohopom extends Baseclass{
	public static WebDriver driver=null;
	public static void main(String[] args) throws IOException, InterruptedException {
		String broswer=ConfigurationHelper.getInstance().getBrowser();
		driver=browserLaunch(broswer);
		SdpZoho sz=new SdpZoho(driver);
		String url=ConfigurationHelper.getInstance().getUrl();
		getUrl(url);
		implicity();
		clickOnWE(sz.getLoginPage().getSignupp());
		String sheet=ConfigurationHelper.getInstance().getSheet();
		String text=Drivendata3.allData(sheet, 0, 0);
		input(sz.getLoginPage().getName(), text);
		String word=Drivendata3.allData(sheet, 1, 0);
		input(sz.getLoginPage().getPass(), word);
		String phone=Drivendata3.allData(sheet, 2, 0);
		input(sz.getLoginPage().getPhone(), phone);
		clickOnWE(sz.getSignUp().getClickBox());
		clickOnWE(sz.getSignUp().getSignUp());
		thread();
		takeScreenshot("ZohoO");
		thread();
		close();
			}

}
