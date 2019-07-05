package stepdefinitions.wikipedia;



import static org.junit.Assert.assertTrue;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import testbase.TestBase;
import wikipediaPageObjects.HomePage;
import wikipediaPageObjects.TopicPage;

public class TopicPageStepDefinitions extends TestBase {

	TopicPage topicPage = new TopicPage(driver);

	@Then("^the page heading is \"([^\"]*)\"$")
	public void the_url_contains_software(String arg1) throws Throwable {
		assertTrue(topicPage.firstHeadding.getText().equalsIgnoreCase(arg1));

	}
}
