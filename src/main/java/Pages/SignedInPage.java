package Pages;


import Base.BasePage;
import UserProfile.UserProfilePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;

public class SignedInPage extends BasePage {
    private By jobSearchTab = By.cssSelector("a[href=\"/\"]._17m4m-C");
    private By userName = By.cssSelector("span[data-automation=\"user-account-name\"]");
    private By userAccountMenuToggle = By.cssSelector("label[data-automation=\"user-account-menu-toggle\"]");

    public String getUserName() {
        wait.until((ExpectedCondition<Boolean>) driver -> driver.findElement(userName).getText().length() != 0);
        return driver.findElement(userName).getText();
    }

    public DropDownMenu clickUserDropdownMenu() throws InterruptedException {
        Thread.sleep(3000);
        click(userAccountMenuToggle);
        return new DropDownMenu();
    }

    public JobSearchPage clickJobSearchTab() {
        click(jobSearchTab);
        return new JobSearchPage();
    }

    public class DropDownMenu {
        private By signOut = By.cssSelector(".K1Fdmkw a._3mf0vNI[href*=\"Logout\"]");
        private By profile = By.cssSelector("._3mf0vNI[href=\"/profile/\"]");

        public void clickSignOut() {
            click(signOut);
        }

        public UserProfilePage clickProfile() {
            click(profile);
            return new UserProfilePage();
        }
    }
}
