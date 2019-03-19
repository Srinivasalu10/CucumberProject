package org.cucumber.practice1.CucumberProject;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	
	public WebDriver driver;
	
	private AdactinLoginPage ap;
	
	public PageObjectManager(WebDriver fdriver) {
		this.driver=fdriver;
		
	}

	public AdactinLoginPage getAp() {
		if (ap==null) {
			ap=new AdactinLoginPage(driver);
			
		}
		return ap;
		
	}
}
