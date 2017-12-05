package com.google;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import selenide.core.WebDriverTestBase;

import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.Selenide.open;
import static org.testng.Assert.assertTrue;

@Listeners({selenide.core.TestListener.class})

public class SimpleGoogleSearchTest  extends WebDriverTestBase {

    private String searchText = "Selenium";

    @Test
    public void searchTest() {
        webDriver.get("https://www.google.com.ua/");

        By searchFieldLocator = By.id("lst-i");
        WebElement searchField = webDriver.findElement(searchFieldLocator);
        searchField.sendKeys(searchText);
        searchField.submit();
        By resultLinkLocator = By.xpath("//*[@id=\"rso\"]/div[1]/div/div[1]/div/div/h3/a");
        WebElement resultLink = webDriver.findElement(resultLinkLocator);
        assertTrue(resultLink.getText().contains(searchText));
    }
}


