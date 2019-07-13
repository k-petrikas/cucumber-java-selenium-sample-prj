package stepdefinitions.wikipedia;

import static org.junit.Assert.assertTrue;

import java.util.List;

import io.cucumber.java.en.Then;
import testbase.TestBase;
import wikipediaPageObjects.TopicPage;
	
public class TopicPageStepDefinitions extends TestBase {

	TopicPage topicPage = new TopicPage(driver);

	@Then("the page heading is {string}")
	public void the_page_heading_is(String arg1) {
		assertTrue(topicPage.firstHeadding.getText().equalsIgnoreCase(arg1));

	}

	@Then("the animal classification will be correct")
	public void the_animal_classification_will_be_correct(io.cucumber.datatable.DataTable arg1) {
		List<List<String>> list = arg1.asLists(String.class);

		assertTrue(topicPage.CompareClassificationTable(list));
	}
}
