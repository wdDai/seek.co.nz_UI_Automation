package Base;

import Pages.HomePage;
import TestUtils.TestUtils;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class TestBase {
    protected static WebDriver driver;
    protected static WebDriverWait wait;


    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/UITest/chromedriver");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 5);
        BasePage.setDriver(driver);
        BasePage.setWait(wait);
    }


    @BeforeClass
    public void goHome() {
        new HomePage().goHome();
        TestUtils.signIn();
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }

}
