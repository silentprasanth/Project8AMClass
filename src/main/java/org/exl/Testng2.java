package org.exl;

import org.testng.annotations.DataProvider;

public class Testng2 {
	@DataProvider(name="datas")
	public static Object[][]getdata(){
		return new Object[][] {{"Test1@gmal.com","test2@gmail.com"},{"test3@gmail.com","test4@gmail.com"}};
	}
}
