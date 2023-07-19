package org.pom;

import org.exl.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class POM1 extends BaseClass {
	  @FindBy(id="email")
	//@FindBys({@FindBy(id="email"),@FindBy(xpath="//input[@name='email']")})
	  private WebElement username;
	  @FindBy(name="pass")
	//@FindBys({ @FindBy(name="pass"),@FindBy(xpath="//input[@type='password']")})
	  private WebElement pwd;
	  @FindBy(xpath="//button[@name='login']")
	//@FindBys({ @FindBy(name="login"),@FindBy(xpath="//button[@type='submit']")})
	  private WebElement login;
	  public WebElement getUsername() {
		return username;
	  }
	  public WebElement getpwd() {
		  return pwd;
	  }
	  public WebElement getlogin() {
		  return login;
	  }
	  public POM1() {
		  PageFactory.initElements(driver, this);
	  }

}

