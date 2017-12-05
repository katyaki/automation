package selenium.pages.google;


import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.annotations.Test;

@Feature("Google search")
@Story("WEB-777")

public class SearchResultPage extends WebDriverTestBase {

    private String selenium = "Selenium";
    private SearchPage searchPage = new SearchPage(webDriver);


    @Test
    public void search() {
        webDriver.get("https://google.com.ua");
        searchPage.searchFor(selenium);
    }


   /* private By searchLocator = By.name("q");   Should be in SearchPage
    private WebElement search;

    public SearchResultPage(WebDriver webDriver) {
        super(webDriver);
    }

    public SearchResultPage searchFor(String searchText){
        search = webDriver.findElement(searchLocator);
        search.sendKeys(searchText);
        search.submit();
        return this;
    } */

}
