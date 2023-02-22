package org.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\srinivasan\\eclipse-workspace\\Cucumber_Programs\\src\\test\\java\\org\\feature\\demo.feature", glue = "org.stepdemo")
public class Runner_Class {

}
