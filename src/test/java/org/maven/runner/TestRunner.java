package org.maven.runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.maven.resource.BaseClass;
import org.openqa.selenium.WebDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

	@RunWith(Cucumber.class)
	@CucumberOptions(features="src\\test\\java\\org\\maven\\feature\\",
	tags= {"@Tc1"},
	glue="org.maven.stepdefinitions",
	monochrome=true
			)
	public class TestRunner{
public static WebDriver driver;
@BeforeClass
public static void browserLanuch() throws Exception {
	driver= BaseClass.browerLaunch("chrome");
}

}
