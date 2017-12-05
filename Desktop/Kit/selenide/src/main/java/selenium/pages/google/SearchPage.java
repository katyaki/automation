package selenium.pages.google;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class SearchPage extends AbstractPage {

    private By searchLocator = By.name("q");
    private WebElement search;

    public SearchPage(WebDriver webDriver) {
        super(webDriver);
    }

    @Step("Search for {0}")

    public SearchPage searchFor(String searchText){
        search = webDriver.findElement(searchLocator);
        search.sendKeys(searchText);
        search.submit();
        return this;
    }


}
