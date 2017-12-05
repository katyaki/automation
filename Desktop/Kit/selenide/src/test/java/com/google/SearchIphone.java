package com.google;

import com.codeborne.selenide.WebDriverRunner;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import com.codeborne.selenide.Configuration;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

@Feature("Google search")
@Story("WEB-777")

public class SearchIphone {

    private String searchText = "\n Apple iPhone";


    @BeforeClass
    private void searchIphone() {
        ChromeDriverManager.getInstance().setup();
        Configuration.browser = WebDriverRunner.CHROME;
        open("https://rozetka.com.ua/");

    }

    @Test
    public void searchTest(){
        $(By.name("text")).val(searchText).submit();
        $(By.xpath("//*[@id=\"catalog_goods_block\"]/div/div[1]/div[1]/div/div[1]/div[2]/div[4]/a")).should(visible, text(searchText));

    }

}
