import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SimpleTest {

    static WebDriver driver;
    static WebDriverWait wait;

    public static void main(String args[]) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 5);
        driver.get("http://seek.co.nz");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a._2l410Lj[title=\"Sign in\"]")));
//        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("a._2l410Lj[title=\"Sign in\"]"))));
        driver.findElement(By.cssSelector("a._2l410Lj[title=\"Sign in\"]")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("email")));
        driver.findElement(By.id("email")).sendKeys("eeeee");
    }

}
