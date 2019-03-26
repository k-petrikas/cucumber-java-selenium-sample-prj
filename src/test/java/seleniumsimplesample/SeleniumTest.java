package seleniumsimplesample;

import static org.junit.Assert.*;

import java.util.logging.Logger;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class SeleniumTest {

	private static Logger logger = Logger.getLogger(Class.class.getName());

	@Test
	public void navigate_to_wkikipedia_software_page_with_selenium() {

		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "/src/test/resources/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		logger.info("application is up and running");

		driver.get("http://www.wikipedia.org");

		WebElement searchBox = driver.findElement(By.id("searchInput"));
		searchBox.sendKeys("Software");
		searchBox.submit();
		logger.info("Search for Software	");

		assertTrue(driver.getCurrentUrl().equals("https://en.wikipedia.org/wiki/Software"));

		driver.quit();
	}

}
