package org.exl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunching {
	public static void main(String[] args) {
		System.setProperty("webdriver","C:\\Users\\prasanth\\Downloads\\chromedriver_win32");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement username=driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/textarea"));
		username.sendKeys("selenium 8398");
	}
}
