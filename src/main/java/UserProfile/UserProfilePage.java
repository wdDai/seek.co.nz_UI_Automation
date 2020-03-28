package UserProfile;


import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class UserProfilePage extends BasePage {
    By editPersonalDetailButton = By.cssSelector("button[data-automation=\"personal-details-edit\"]");

    public boolean editPersonalDetailIsDisplayed() {
        BasePage.wait.until(ExpectedConditions.visibilityOfElementLocated(editPersonalDetailButton));
        return BasePage.driver.findElement(editPersonalDetailButton).isDisplayed();
    }

    public EditUserProfilePage clickEditPersonalDetails(){
        click(editPersonalDetailButton);
        return new EditUserProfilePage();
    }
}
