import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ProfilePage extends BasePage{
    private By userName = By.cssSelector("span[data-automation=\"user-account-name\"]");
    private By userAccountMenuToggle = By.cssSelector("label[data-automation=\"user-account-menu-toggle\"]");
    public String getUserName(){
        wait.until((ExpectedCondition<Boolean>) driver -> driver.findElement(userName).getText().length() !=0);
        return driver.findElement(userName).getText();
    }
    public void clickUserAccountMenuToggle(){
        wait.until(ExpectedConditions.elementToBeClickable(userAccountMenuToggle));
        driver.findElement(userAccountMenuToggle).click();
    }

    // TODO dropdown menu
}
