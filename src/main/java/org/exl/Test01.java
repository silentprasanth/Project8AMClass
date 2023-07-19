package org.exl;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Test01 extends BaseClass{
	public Object[][] getdata(){
		return new Object[][] {{"Test1@gmail.com","Test2@gmail.com"},{"Test3@gmail.com","test4@gmail.com"}};
	}
	@Test(dataProvider="datas")
	private void datas(String s1,String s2) {
		getDriver("chrome");
		url("https://www.facebook.com/");
		WebElement username=locators("id","email");
		textsend(username,s1);
		WebElement pass=locators("name","pass");
		textsend(pass,s2);
		WebElement login=locators("name","login");
		textclick(login);
	}
}
