package org.exl;

import java.util.Date;

import org.apache.poi.util.SystemOutLogger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.xml.sax.Locator;

public class Javaunit extends BaseClass {
	@BeforeClass
	public static void tc01() {
		getDriver("chrome");
		url("https://www.facebook.com/");
	}
	@Before
	public void tc02() {
		Date d=new Date();
		System.out.println(d);
	}
	@Test
	public void tc03() {
		WebElement username= locators("id", "email");
		textsend(username,"test1@gmail.com");
		WebElement pwd=locators("name","pass");
		textsend(pwd,"test2@gmail.com");
		WebElement login=locators("name", "login");
		textclick(login);
	}
	@After
	public void tc04() {
		Date d=new Date();
		System.out.println(d);
	}
		@AfterClass
		public static void tc05() {
			quitbrowser();
		}
}
