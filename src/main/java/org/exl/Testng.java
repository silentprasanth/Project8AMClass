package org.exl;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testng {
	
	@BeforeClass
	private void tc01() {
		System.out.println("tco1");
	}
	@BeforeGroups
	private void tc02() {
		System.out.println("tco2");
	}
	@BeforeMethod
	private void tc03() {
		System.out.println("tco3");
	}
	@Test
	private void tc04() {
		System.out.println("tco4");
	}
	@AfterClass
	private void tc05() {
		System.out.println("tco5");
	}
	@AfterGroups
	private void tc06() {
		System.out.println("tco6");
	}
	@AfterMethod
	private void tc07() {
		System.out.println("tco7");
	}
}
