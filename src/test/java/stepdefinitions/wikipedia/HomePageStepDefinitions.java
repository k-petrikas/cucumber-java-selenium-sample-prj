package stepdefinitions.wikipedia;


import static org.junit.Assert.assertTrue;

import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import testbase.TestBase;
import wikipediaPageObjects.HomePage;

public class HomePageStepDefinitions extends TestBase {

	HomePage wikipediaHomePage = new HomePage(driver);

	@Given("^a user is able to open \"([^\"]*)\"$")
	public void a_user_is_able_to_open_wikipedia(String arg1) throws Throwable {
		driver.get(arg1);
	}

	@When("^a user searches for topic \"([^\"]*)\"$")
	public void a_user_searches_for_topic(String arg1) throws Throwable {
		wikipediaHomePage.searchForASpecificSubject(arg1);
	}
	
	@When("^a user searches")
	public void a_user_searches_for_topic(DataTable datalist) throws Throwable {
		List<List<String>> data = datalist.raw();

		wikipediaHomePage.searchForASpecificSubject("x");
	}


}
