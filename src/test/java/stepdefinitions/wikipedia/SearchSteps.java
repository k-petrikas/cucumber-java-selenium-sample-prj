package stepdefinitions.wikipedia;

import static org.junit.Assert.assertTrue;

import org.springframework.beans.factory.annotation.Autowired;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.WikipediaHomePage;

public class SearchSteps {

	@Given("^a user is able to open wikipedia$")
	public void a_user_is_able_to_open_wikipedia() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}
	
	@Given("^Open http://en\\.wikipedia\\.org$")
	public void open_http_en_wikipedia_org() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Autowired
	WikipediaHomePage wikipediaHomePage;
	
	@When("^a user searches for topic \"([^\"]*)\"$")
	public void a_user_searches_for_topic(String arg1) throws Throwable {
		wikipediaHomePage.searchForASpecificSubject(arg1);
	}

	@Then("^the url contains software$")
	public void the_url_contains_software() throws Throwable {
		assertTrue(wikipediaHomePage.getUrl().equals("https://en.wikipedia.org/wiki/Software"));

	}
}
