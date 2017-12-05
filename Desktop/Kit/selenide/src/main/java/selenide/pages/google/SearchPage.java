package selenide.pages.google;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SearchPage {

    private SelenideElement search = $(By.name("qq"));

    @Step("Search for {0}")
    public SearchPage searchFor(String searchText){
        search.val(searchText).pressEnter();
        return this;

    }

}
