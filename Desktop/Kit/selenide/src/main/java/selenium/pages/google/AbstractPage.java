package selenium.pages.google;

import org.openqa.selenium.WebDriver;

public class AbstractPage {

    protected WebDriver webDriver;

    public AbstractPage(WebDriver webDriver){
        this.webDriver = webDriver;
    }
}
