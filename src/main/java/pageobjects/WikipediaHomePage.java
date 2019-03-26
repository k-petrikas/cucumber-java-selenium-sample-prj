package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WikipediaHomePage {

	WebDriver driver;

	// Page URL
	private static String PAGE_URL = "http://www.wikipedia.org";

	// Locators

	// search box element
	@FindBy(id = "searchInput")	
	private WebElement searchBox;

	public void searchForASpecificSubject(String input) {
		searchBox.sendKeys("input");
		searchBox.submit();
	}
	
	public String getUrl() {
		return driver.getCurrentUrl();
	}
}
