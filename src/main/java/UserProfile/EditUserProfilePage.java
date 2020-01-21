package UserProfile;

import BasePage;
import org.openqa.selenium.By;

public class EditUserProfilePage extends BasePage {
    private By firstName = new By.ById("firstName");
    private By lastName = new By.ById("lastName");
    private By phoneNumber = new By.ById("phoneNumber");
    private By homeLocation_select = new By.ById("currentLocation-primary");
    private By saveButton = new By.ByCssSelector("button[data-automation=\"personal-details-save-button\"]");
    private By cancelButton = new By.ByCssSelector("button[data-automation=\"personal-details-cancel-link\"]");
    private By addResumeButton = new By.ByCssSelector("button[data-automation=\"resume-edit-link\"]");
    private By resumeBrowse = new By.ById("resumeFileInput");

    public EditUserProfilePage selectLocation(String option){
        select(homeLocation_select, option);
        return this;
    }

    public EditUserProfilePage inputFirstName(String firstName){
        inputText(this.firstName, firstName);
        return this;
    }

    public EditUserProfilePage inputLastName(String lastName){
        inputText(this.lastName, lastName);
        return this;
    }
    public EditUserProfilePage inputPhoneNumber(String phoneNumber){
        inputText(this.phoneNumber, phoneNumber);
        return this;
    }

    public UserProfilePage clickSave(){
        clickButton(saveButton);
        return new UserProfilePage();
    }

    public EditUserProfilePage clickCancel(){
        clickButton(cancelButton);
        return this;
    }

    public EditUserProfilePage clickAddResume(){
        clickButton(addResumeButton);
        return this;
    }

    public void upLoadResume(String filePath){
        uploadFile(resumeBrowse, filePath);
    }

}
