package com.cucumberrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Shruthi Keerthi\\eclipse-workspace\\TU\\src\\test\\resources\\features", glue = {
		"com.stepdefinition" }
// tags = { "@running" }

)

public class RunnerClass {

}
