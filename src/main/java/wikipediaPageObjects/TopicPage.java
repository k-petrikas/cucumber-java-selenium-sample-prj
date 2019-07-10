package wikipediaPageObjects;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testbase.TestBase;

public class TopicPage extends TestBase {

	@FindBy(id = "firstHeading")
	public WebElement firstHeadding;

	@FindBy(xpath = "//*[@id=\"mw-content-text\"]/div/table[1]/tbody")
	private WebElement classificationTable;

	public TopicPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public boolean CompareClassificationTable(List<List<String>> list) {

		List<WebElement> tableRows = classificationTable.findElements(By.tagName("tr"));

		for (int i = 0; i < tableRows.size(); i++) {
			List<WebElement> tableColumns = tableRows.get(i).findElements(By.tagName("td"));
			for (int a = 0; a < list.size(); a++) {
				for (int k = 0; k < tableColumns.size(); k++) {
					if (tableColumns.get(k).getText().equalsIgnoreCase(list.get(a).get(0) + ":")) {
						if (tableColumns.get(k + 1).getText().equalsIgnoreCase(list.get(a).get(1))) {
						} else {
							return false;
						}
					}
				}
			}

		}
		return true;

	}

}
