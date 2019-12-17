import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestWeb {
    private WebDriver driver;
    private HomePage homePage;
    private WebDriverWait wait;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 5);
    }

    @BeforeMethod
    public void goHome(){
        driver.get("http://seek.co.nz");
        homePage = new HomePage(driver, wait);
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void testSignIn() {
        // Act
        SignInPage signInPage = homePage.clickSignIn();
        signInPage.enterEmail("testeryouknowwho@gmail.com");
        signInPage.enterPassword("testeryouknowwho");
        ProfilePage profilePage = signInPage.clickSignIn();

        // Assert
        assertEquals(profilePage.getUserName(),"tester");
    }
}
