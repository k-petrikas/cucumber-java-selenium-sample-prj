package wikipedia.stepdefinitions;


import cucumber.api.java.After;
import cucumber.api.java.Before;
import testbase.TestBase;

public class Hooks {

	TestBase testBase;
	
    @Before("@useABrowser")
    public void beforeScenario(){
		testBase = new TestBase();
		testBase.setBrowser();

    }

    @After("@useABrowser")
    public void afterScenario(){
		TestBase.driver.quit();

    }

}
