import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage{
    private By signInLink = By.cssSelector("a._2l410Lj[title=\"Sign in\"]");

    public HomePage(WebDriver driver, WebDriverWait wait){
        BasePage.driver = driver;
        BasePage.wait = wait;
    }
    public SignInPage clickSignIn(){
        wait.until(ExpectedConditions.elementToBeClickable(signInLink));
        driver.findElement(signInLink).click();
        return new SignInPage();
    }
}
