package cucumberrunner;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty"},
		glue = {"stepdefinitions.wikipedia"},
		features = {"src/test/resources/features/"})
public class WikipediaCuccumberRunner {}
