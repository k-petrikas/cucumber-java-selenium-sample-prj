package stepdefinitions.wikipedia;


import io.cucumber.java.After;
import io.cucumber.java.Before;
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
