package stepdefinitions.wikipedia;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import testbase.TestBase;
import wikipediaPageObjects.HomePage;

public class HomePageStepDefinitions extends TestBase {

	HomePage wikipediaHomePage = new HomePage(driver);

	@Given("a user is able to open {string}")
	public void a_user_is_able_to_open(String arg1) {
		driver.get(arg1);
	}

	@When("a user searches for topic {string}")
	public void a_user_searches_for_topic(String arg1) {
		wikipediaHomePage.searchForASpecificSubject(arg1);
	}
	

}
