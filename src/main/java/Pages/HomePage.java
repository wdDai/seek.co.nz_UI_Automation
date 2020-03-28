package Pages;


import Base.BasePage;
import Pages.SigningInPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {
    private By signInLink = By.cssSelector("a._2l410Lj[title=\"Sign in\"]");

    public SigningInPage clickSignIn() {
        click(signInLink);
        return new SigningInPage();
    }

    public void goHome(){
        driver.get(HOME_URL);
    }
    public boolean isSignedIn() {
        return driver.findElement(signInLink).isDisplayed();
    }
}
