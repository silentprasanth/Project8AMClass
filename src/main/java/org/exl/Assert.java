package org.exl;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Assert extends BaseClass {
	@Test
	public void tc01() {
		String s="java";
		System.out.println("tco1");
		assertFalse(false);
		System.out.println("tc03");
	}
	@Test
	public void tc02() {
		String s="java";
		System.out.println("Tc01");
		assertTrue(false);
		System.out.println("tc03");
	}
	@Test
	public void tc03() {
		getDriver ("chrome");
		url("https://www.facebook.com/");
		String title=driver.getTitle();
		System.out.println(title);
		//Assert.asserttrue(driver.gettitle().contains assert.assertequals("facebook-login or signup",Title)
	//	System.out.println("Testcase is pass");
		quitbrowser();
	}

}
