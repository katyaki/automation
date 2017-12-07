package selenide.core;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.WebDriverRunner.CHROME;
import static selenide.util.PropertiesCache.getProperty;

@Listeners({selenide.core.TestListener.class})

public class WebDriverTestBase {

    public WebDriver webDriver;
    private String browser = System.getProperty("browser", CHROME);
    private long implicitWait = Long.parseLong("30");
    private long pageWait = Long.parseLong("30");
    private long scriptWait = Long.parseLong("30");


    public DesiredCapabilities setDesiredCapabilities(String platform, String remoteBrowser) throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        if (platform.equalsIgnoreCase("MAC")) {
            caps.setPlatform(Platform.MAC);
            caps.setBrowserName(remoteBrowser);
        }
        return caps;
    }

    @Parameters({"platform", "remoteBrowser"})
    @BeforeClass
    public void setUp(@Optional String platform, @Optional String remoteBrowser) throws MalformedURLException {
        if (browser.equals("remote")) {
            DesiredCapabilities caps = setDesiredCapabilities(platform, remoteBrowser);
            webDriver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), caps);

        } else if (browser.equals(BrowserType.CHROME)) {
            ChromeDriverManager.getInstance().setup();
            webDriver = new ChromeDriver();

        }

        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(implicitWait, TimeUnit.SECONDS);
        webDriver.manage().timeouts().pageLoadTimeout(pageWait, TimeUnit.SECONDS);
        webDriver.manage().timeouts().setScriptTimeout(scriptWait, TimeUnit.SECONDS);
    }

    @AfterClass
    public void tearDown() {
        webDriver.quit();
    }
}
