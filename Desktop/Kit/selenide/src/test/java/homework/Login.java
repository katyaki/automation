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

public class Login {

    @BeforeClass
    public void setUp()
    {
        ChromeDriverManager.getInstance().setup();
        Configuration.browser = WebDriverRunner.CHROME;
        open("https://rozetka.com.ua/");

    }

    @Test
    public void loginUser() {

        $(By.cssSelector("[name=signin]")).click();
        $(By.name("login")).val("cath.22@yandex.ua");
        $(By.xpath("//*[@name='password']")).val("Q1a2z3");
        $(By.xpath("//*[@type='submit']")).click();
        $(By.xpath("//*[@class='header-user-pre-title']")).shouldHave(text("Здравствуйте"));
    }


}
