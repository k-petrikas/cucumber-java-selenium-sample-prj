package stepdefinitions.wikipedia;



import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import testbase.TestBase;
import wikipediaPageObjects.HomePage;
import wikipediaPageObjects.TopicPage;

public class TopicPageStepDefinitions extends TestBase {

	TopicPage topicPage = new TopicPage(driver);

	@Then("^the page heading is \"([^\"]*)\"$")
	public void the_page_heading_is(String arg1) throws Throwable {
		assertTrue(topicPage.firstHeadding.getText().equalsIgnoreCase(arg1));
	}
		
	@Then("^the animal clasification will be correct$")
	public void the_animal_clasification_will_be_correct(DataTable arg1) throws Throwable {
		List<Map<String, String>> list = arg1.asMaps(String.class, String.class);
		
		topicPage.CompareClassificationTable(list);
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).get("Kingdom"));
			System.out.println(list.get(i).get("Phylum"));
		}
	
	}
}
