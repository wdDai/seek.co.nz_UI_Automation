package Pages;


import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SigningInPage extends BasePage {
    private By emailInput = By.id("email");
    private By passwordInput = By.id("password");
    private By signInButton = By.cssSelector("button[type=\"submit\"]");

    public void enterEmail(String emailAddress) {
        wait.until(ExpectedConditions.elementToBeClickable(emailInput));
        driver.findElement(emailInput).sendKeys(emailAddress);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordInput).sendKeys(password);
    }

    public SignedInPage clickSignIn() {
        driver.findElement(signInButton).click();
        return new SignedInPage();
    }
}
