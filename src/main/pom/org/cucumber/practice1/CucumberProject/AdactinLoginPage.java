package org.cucumber.practice1.CucumberProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinLoginPage {
	
	public WebDriver driver;
	
	@FindBy(id="//input[@id='username']")
	private WebElement usernameinput;
	
	
	
	public WebElement getUsernameinput() {
		return usernameinput;
	}

	public WebElement getPasswordinput() {
		return passwordinput;
	}

	public WebElement getLoginclick() {
		return loginclick;
	}

	public WebElement getValidhomepagetext() {
		return validhomepagetext;
	}

	public WebElement getUsernamedisplay() {
		return usernamedisplay;
	}

	public WebElement getLogout() {
		return logout;
	}

	@FindBy(id="//input[@id='password']")
	private WebElement passwordinput;
	
	@FindBy(id="login")
	private WebElement loginclick;
	
	@FindBy(xpath="//p[text()='Welcome to AdactIn Group of Hotels']")
	private WebElement validhomepagetext;
	
	@FindBy(id="//input[@id='username']")
	private WebElement usernamedisplay;
	
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logout;
	
	public AdactinLoginPage(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
		
	}
	
}

	
	
	

