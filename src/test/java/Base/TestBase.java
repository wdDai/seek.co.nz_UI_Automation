package Base;

import HomePage.HomePage;
import TestUtils.TestUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;


import static org.testng.Assert.*;

public class TestBase {
    protected static WebDriver driver;
    protected static HomePage homePage;
    protected static WebDriverWait wait;

    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 5);
    }

    @BeforeClass
    public void goHome() {
        driver.get("http://seek.co.nz");
        homePage = new HomePage(driver, wait);
        TestUtils.signIn();
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }

}
