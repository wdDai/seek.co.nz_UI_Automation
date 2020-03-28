package UITest;

import Base.BasePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestBase {
    protected static WebDriver driver;
    protected static WebDriverWait wait;


    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/UITest/chromedriver");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 5);
        BasePage.setDriver(driver);
        BasePage.setWait(wait);
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}