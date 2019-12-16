import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTests {
    private WebDriver driver;

    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://seek.co.nz");
//        driver.close();
    }

    public static void main(String args[]){
        BaseTests test = new BaseTests();
        test.setUp();
    }
}
