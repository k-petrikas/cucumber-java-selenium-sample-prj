package wikipediaPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testbase.TestBase;

public class HomePage extends TestBase {

	// search box element
	@FindBy(id = "searchInput")
	private WebElement searchBox;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void searchForASpecificSubject(String input) {
		System.out.println("i got here");

		searchBox.sendKeys(input);
		searchBox.submit();
	}
}
