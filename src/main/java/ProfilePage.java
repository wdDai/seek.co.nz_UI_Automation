import org.openqa.selenium.By;

public class ProfilePage extends BasePage{
    private By userName = By.cssSelector("span[data-automation=\"user-account-name\"]");
    public String getUserName(){
        return driver.findElement(userName).getText();
    }
}
