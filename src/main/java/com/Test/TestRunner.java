package com.Test;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
    @RunWith(Cucumber.class)
	@CucumberOptions(features= {"C:\\Users\\prasanth\\eclipse\\Project1\\src\\test\\resources\\LoginWithData.feature"},glue= {"com.stepdefinitions"},tags= {"@loginWithData"})
	public class TestRunner{

}
