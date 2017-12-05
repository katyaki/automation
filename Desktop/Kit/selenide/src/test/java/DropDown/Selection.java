package DropDown;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import static org.testng.Assert.assertTrue;

public class Selection {   //https://developer.mozilla.org/en-US/docs/Web/HTML/Element/select


    private WebDriver webDriver;

    @BeforeClass
    public void setUp() {
            ChromeDriverManager.getInstance().setup();
            webDriver = new ChromeDriver();
            webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.MINUTES);
            webDriver.manage().window().maximize();
            webDriver.get("https://www.loveknitting.com/knitting-yarns");

        }


        @Test
        public void selectItemInDropDown() {
            WebElement selElem = webDriver.findElement(By.id("by-price-top"));
            Select selectObject = new Select(selElem);

        }



    @AfterClass
    public void tearDown(){
        webDriver.quit();
    }


}
