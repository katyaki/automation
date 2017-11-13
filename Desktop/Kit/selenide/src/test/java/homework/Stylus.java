package homework;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import com.codeborne.selenide.Configuration;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;




public class Stylus
{

    private String sony = "Sony Z2";

    @BeforeClass
    public void setUp()
    {
        ChromeDriverManager.getInstance().setup();
        Configuration.browser = WebDriverRunner.CHROME;
        open("http://stylus.com.ua/");

    }

    @Test
    public void searchSony() {
        $(By.name("q")).val(sony).submit();
        $(By.xpath("//*[@data-id='198717']")).shouldHave(text("Смартфон Sony Xperia Z2 Black"));
        $(By.cssSelector("#search-list > ul > li:nth-child(3) > a")).click();
        $(By.xpath("//*[@class='left']/h1")).shouldHave(text("Смартфон Sony Xperia Z2 Black"));
    }
}
