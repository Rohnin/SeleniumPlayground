package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class driver {
    protected static WebDriver driver;

    protected static String setPropertyPathChrome = "local_chromedriver_path";

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", setPropertyPathChrome);
        driver = new ChromeDriver();
    }

    @AfterSuite
    public void turnOff() {
        driver.quit();
    }

}
