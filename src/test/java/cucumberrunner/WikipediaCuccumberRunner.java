package cucumberrunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty"},
		glue = {"stepdefinitions.wikipedia"},
		features = {"src/test/resources/features/"})
public class WikipediaCuccumberRunner {}
