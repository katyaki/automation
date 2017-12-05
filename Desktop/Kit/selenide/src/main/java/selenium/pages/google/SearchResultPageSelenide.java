package selenium.pages.google;

/*
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SearchResultPageSelenide extends WebDriverTestBase{

    private String selenium = "Selenium";

    @BeforeClass
    public void setUp(){
        ChromeDriverManager.getInstance().setup();
        webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        webDriver.manage().window().maximize();
        webDriver.get("https://www.google.com.ua");


        @Test
        public void searchTest() {
            By searchFieldLocator = By.id("q");
            WebElement searchField = webDriver.findElement(searchFieldLocator);
            searchField.sendKeys(selenium);
            searchField.submit();


        }


        @AfterClass
        public void tearDown() {
            webDriver.quit();





        }




}
*/