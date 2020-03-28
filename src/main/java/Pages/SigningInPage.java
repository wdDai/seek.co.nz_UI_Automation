package Pages;


import Base.BasePage;
import org.openqa.selenium.By;

public class SigningInPage extends BasePage {
    private By emailInput = By.id("email");
    private By passwordInput = By.id("password");
    private By signInButton = By.cssSelector("button[type=\"submit\"]");

    public void enterEmail(String emailAddress) {
        inputText(emailInput, emailAddress);
    }

    public void enterPassword(String password) {
        inputText(passwordInput, password);
    }

    public SignedInPage clickSignIn() {
        click(signInButton);
        return new SignedInPage();
    }
}
