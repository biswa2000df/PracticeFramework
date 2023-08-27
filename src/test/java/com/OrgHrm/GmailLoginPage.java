package com.OrgHrm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GmailLoginPage extends Base {

	private WebDriver driver;

	// Constructor to initialize the driver and instantiate elements using
	// PageFactory
	public GmailLoginPage(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);
		
		//The PageFactory class is a utility class that provides a way to automatically find and initialize web elements on a page. This can be done by using the @FindBy annotation to annotate the fields in the class that represent the web elements.


	}

	// Using @FindBy to locate elements on the page
	@FindBy(id = "twotabsearchtextbox")
	private WebElement searchbar;

	@FindBy(id = "nav-search-submit-button")
	private WebElement searchbtn;

	public void SearchBar(String email) {
		searchbar.sendKeys(email);
	}

	public void SearchBtn() {
		searchbtn.click();
	}

}
