package org.maven.stepdefinitions;

import org.cucumber.practice1.CucumberProject.PageObjectManager;
import org.junit.Assert;
import org.maven.resource.BaseClass;
import org.maven.runner.TestRunner;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class StepDefinitions extends BaseClass{
	
	public static WebDriver driver= TestRunner.driver;
	
	
	public static PageObjectManager pa = new PageObjectManager(driver);
	
	@Given("^user should launch the browser$")
	public void user_should_launch_the_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		getUrl("https://adactin.com/HotelAppBuild2/");
	    
	}

	@Given("^user wait for (.*) seconds1$")
	public void user_wait_for_seconds1(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(arg1*1000);
		
		
	    
	}
	@Then("^user should verify the Welcome to AdactIn Group of Hotels displayed$")
	public void user_should_verify_the_Welcome_to_AdactIn_Group_of_Hotels_displayed() throws Throwable {
	    String elementText = getElementText(pa.getAp().getValidhomepagetext());
	    Assert.assertEquals("Welcome to AdactIn Group of Hotels",elementText.trim() );
	}


	@When("^user should enter the valid username in the loginpage$")
	public void user_should_enter_the_valid_username_in_the_loginpage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   inputValuestoElement(pa.getAp().getUsernamedisplay(), "Srini1010");
	}

	@When("^user should enter the valid password in the loginpage$")
	public void user_should_enter_the_valid_password_in_the_loginpage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		inputValuestoElement(pa.getAp().getPasswordinput(), "superman@1010");
	
	    
	}

	@When("^user should cliks the Login Button in login page$")
	public void user_should_cliks_the_Login_Button_in_login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		elementClick(pa.getAp().getLoginclick());
	    
	}

	@When("^user wait for (.*) seconds$")
	public void user_wait_for_seconds(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(arg1*1000);
	    
	}


	@When("^user should signout to exit from the loggedin page$")
	public void user_should_signout_to_exit_from_the_loggedin_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		elementClick(pa.getAp().getLogout());
		
	    
	}

	@When("^user should close the browsers$")
	public void user_should_close_the_browsers() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.quit();
	}
	}

