package stepdefinitions.wikipedia;

import static org.junit.Assert.assertTrue;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.beans.factory.annotation.Autowired;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.WikipediaHomePage;

public class SearchSteps {

	private WebDriver driver;
    @Autowired
    WikipediaHomePage wikipediaHomePage;

	@Given("^a user is able to open wikipedia$")
	public void a_user_is_able_to_open_wikipedia() throws Throwable {
        System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\seleniumdrivers\\chromedriver.exe");
        driver = new ChromeDriver();
		driver.navigate().to("http://en.wikipedia.org");
		System.out.println("I am at the LogIn Page");
	}
	
	@When("^a user searches for topic \"([^\"]*)\"$")
	public void a_user_searches_for_topic(String arg1) throws Throwable {
		wikipediaHomePage.searchForASpecificSubject(arg1);
	}

	@Then("^the url contains software$")
	public void the_url_contains_software() throws Throwable {
		assertTrue(wikipediaHomePage.getUrl().equals("https://en.wikipedia.org/wiki/Software"));
		driver.quit();

	}
}
