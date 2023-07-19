package org.exl;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	  public static WebDriver driver;
	  public static void getDriver(String browser) {
      if(browser.equalsIgnoreCase("chrome")) {
    	  WebDriverManager.chromedriver().setup();
    	  driver=new ChromeDriver();
    	  driver.manage().window().maximize();
      }
	  }
      public static void url(String url) {
    	  driver.get(url);
      }
      public static  WebElement locators (String locators,String attributevalue) {
      if(locators.equalsIgnoreCase("id")) {
        WebElement findElement=driver.findElement(By.id(attributevalue));
        return findElement;
    }
      else if(locators.equalsIgnoreCase("name")) {
    	  WebElement findElement=driver.findElement(By.name(attributevalue));
    	  return findElement;
      }
      else {
    	  WebElement findElement=driver.findElement(By.xpath(attributevalue));
      return findElement;
      }
      }
      public static void textsend(WebElement Element,String Value) {
    	  Element.sendKeys(Value);
      }
      public static void textclick(WebElement element) {
    	  element.click();
      }
      public static void ScreenShot(String name){
    	  TakesScreenshot tk=(TakesScreenshot)driver;
    	  File Source=tk.getScreenshotAs(OutputType.FILE);
    	  File f=new File("c:\\Excel\\"+name+".jpeg");
      }
      public static void staticWait(long l) throws InterruptedException{
    	  Thread.sleep(1);
      }
      public static void quitbrowser() {
    	  driver.quit();
      }
      }


      
      