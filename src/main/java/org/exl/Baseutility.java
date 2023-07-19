package org.exl;

import org.openqa.selenium.WebElement;

public class Baseutility extends BaseClass{

	public static void main(String[] args) {
		
		getDriver("chrome");
		url("https://www.facebook.com/");
		WebElement locators=locators("id","email");
		textsend (locators,"Test1@gmail.com");
		ScreenShot("username");
		WebElement locators1=locators("name","pass");
		textsend(locators1,"65754");
		ScreenShot("pwd");
		WebElement button=locators("xpath","//button[@type='submit']");
		textclick(button);
		ScreenShot("login");
		quitbrowser();
	}

}
