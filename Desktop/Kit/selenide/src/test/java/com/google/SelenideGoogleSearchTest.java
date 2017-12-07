package com.google;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import selenide.core.SelenideTestBase;
import selenide.pages.google.SearchPage;
import selenide.pages.google.SearchResultPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;

public class SelenideGoogleSearchTest extends SelenideTestBase {

    private String searchText = "Selenium";

   @Test
    public void searchTest(){
        open("https://www.google.com.ua/");
        $(By.name("q")).val(searchText).submit();
        $(By.xpath("//*[@id=\"rso\"]/div[1]/div/div[1]/div/div/h3/a")).should(visible, text(searchText));
        $$("#rso").shouldHaveSize(1);
    }

/*
    @Test
    public void pageObjectSearchTest() {
        open("https://www.google.com.ua/");
        SearchPage searchPage = new SearchPage();
        searchPage.searchFor(searchText);
        SearchResultPage searchResultPage = new SearchResultPage();
        searchResultPage.getLinkResult()
                .shouldHaveSize(9)
                .contains("Selenium");

*/
        //.contains(searchText);
        // texts - for every link

        /*

   private By search = By.name("q");
   private WebElement searchField;

   @Step("Searches for {0} text")
   public SearchPage searchFor(String searchText) {
       searchField = webDriver.findElement(search);
       searchField.sendKeys(searchText);
       searchField.submit();
       return this;
   }
         */


}
