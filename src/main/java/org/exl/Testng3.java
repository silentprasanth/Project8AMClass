package org.exl;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Testng3 extends BaseClass {
	@Test(groups="smoke")
	private void tc01() {
		System.out.println("tc01");
	}
	@Test(groups="smoke")
	private void tc02() {
		System.out.println("tc02");
	}
	@Test(groups="Regression")
	private void tc03() {
		System.out.println("tc03");
	}
	@Test(groups= {"smoke","Regression"})
	private void tc04() {
		System.out.println("tc04");
	}
}
