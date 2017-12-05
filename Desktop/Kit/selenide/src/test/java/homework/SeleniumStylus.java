package homework;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import static org.testng.Assert.assertTrue;

public class SeleniumStylus {

    private String stylus = "Sony Z2";
    private WebDriver webDriver;

    @BeforeClass
    public void setUp(){
        ChromeDriverManager.getInstance().setup();
        webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.MINUTES);
        webDriver.manage().window().maximize();
        webDriver.get("http://stylus.com.ua/");
    }

    @Test
    public void searchTest() {
        By searchFieldLocator = By.name("q");
        WebElement searchField = webDriver.findElement(searchFieldLocator);
        searchField.sendKeys(stylus);
        searchField.submit();
        By resultLocator = By.xpath("//*[@data-id='198717']");
        WebElement resultLink = webDriver.findElement(resultLocator);
        resultLink.click();
        By searchTitle = By.xpath("//*[@class='left']/h1");
        WebElement titleResult = webDriver.findElement(searchTitle);
        assertTrue(titleResult.getText().contains("Смартфон Sony Xperia Z2 Black"));
    }

    @AfterClass
    public void tearDown(){
        webDriver.quit();
    }

}
