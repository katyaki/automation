package selenide.core;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;

import static com.codeborne.selenide.WebDriverRunner.CHROME;
import static com.codeborne.selenide. WebDriverRunner.FIREFOX;

@Listeners({selenide.core.TestListener.class})

public class SelenideTestBase {


    private String browser = System.getProperty("browser", CHROME);

    @BeforeClass
    /* public void setUp() {
        ChromeDriverManager.getInstance().setup();
        Configuration.browser = WebDriverRunner.CHROME;

    }
    */

    public void setUp(){

        Configuration.browser = browser.toUpperCase();
        switch (browser) {
            case CHROME:
                ChromeDriverManager.getInstance().setup();
                break;
            case FIREFOX:
                FirefoxDriverManager.getInstance().setup();
                break;
        }

       /* suggests to replace switch with if when version is */

  /*      Configuration.browser = browser;
        if (browser.equals(CHROME)) {
            ChromeDriverManager.getInstance().setup();

        } else if (browser.equals(FIREFOX)) {
            FirefoxDriverManager.getInstance().setup();

        }

        */

    }

}
