package org.exl;

import org.testng.annotations.Test;

public class Testing {
	@Test(priority=10)
	private void tco1() {
		System.out.println("tc01");
	}
	@Test(priority=1,enabled=false)
	public void tc02() {
		System.out.println("tc02");
	}
	@Test(priority=0)
	private void tc03() {
		System.out.println("tc03");
	}
	@Test(priority=1,invocationCount=10)
	private void tc04() {
		System.out.println("tc08");
	}
}
