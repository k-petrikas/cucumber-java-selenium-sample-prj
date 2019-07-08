package wikipediaPageObjects;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testbase.TestBase;

public class TopicPage extends TestBase {

	@FindBy(id = "firstHeading")
	public WebElement firstHeadding;
	
	@FindBy(className = "infobox biota")
	private WebElement classificationTable;

	public TopicPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void CompareClassificationTable(List<Map<String, String>> list) {
		System.out.println(classificationTable.toString());
	}

	
}
