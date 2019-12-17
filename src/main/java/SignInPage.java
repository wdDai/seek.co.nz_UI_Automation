import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SignInPage extends BasePage{
    private By emailInput = By.id("email");
    private By passwordInput = By.id("password");
    private By signInButton = By.cssSelector("button[type=\"submit\"]");

    public void enterEmail(String emailAddress){
//        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(emailInput)));
        driver.findElement(emailInput).sendKeys(emailAddress);
    }
    public void enterPassword(String password){
        driver.findElement(passwordInput).sendKeys(password);
    }
    public ProfilePage clickSignIn(){
        driver.findElement(signInButton).click();
        return new ProfilePage();
    }
}
