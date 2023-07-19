package com.stepdefinitions;

import java.util.List;

import org.exl.BaseClass;
import org.exl.Baseutility;
import org.openqa.selenium.WebElement;
import org.pom.POM1;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends Baseutility{
	public POM1 pom;
@Given("user is on facebook page")
public void user_is_on_facebook_page() {
	getDriver("chrome");
	url("https://www.facebook.com/");
}

@When("user enters username and password")
public void user_enters_username_and_password() {
	pom=new POM1();
	WebElement username=pom.getUsername();
	textsend(username,"Test4@gmail.com");
	WebElement pwd=pom.getpwd();
	textsend(pwd,"java");
}

@Then("user click login button")
public void user_click_login_button() {
	pom=new POM1();
	WebElement login=pom.getlogin();
   textclick(login);
  }

@When("user enters username and password in facebook")
public void user_enters_username_and_password_in_facebook(io.cucumber.datatable.DataTable dataTable) {
  List<String>li=dataTable.asList();
  pom=new POM1();
  WebElement username=pom.getUsername();
  textsend(username,li.get(0));
  WebElement pwd=pom.getpwd();
  textsend(pwd,li.get(1));
}
@When("user enters username and passwords in facebook")
public void user_enters_username_and_passwords_in_facebook(io.cucumber.datatable.DataTable dataTable) {
	List<List<String>> asLists = dataTable.asLists();
	pom=new POM1();
	List<String> list = asLists.get(1);
	String string = list.get(0);
	System.out.println(string);
	  WebElement username=pom.getUsername();
	  textsend(username,string);
	  WebElement pwd=pom.getpwd();
	  textsend(pwd,asLists.get(1).get(1));
}

}
