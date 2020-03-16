package UserProfile;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class EditUserProfilePage extends BasePage {
    private By firstName = new By.ById("firstName");
    private By lastName = new By.ById("lastName");
    private By phoneNumber = new By.ById("phoneNumber");
    private By homeLocation_select = new By.ById("currentLocation-primary");
    private By personalDetailsSaveButton = new By.ByCssSelector("button[data-automation=\"personal-details-save-button\"]");
    private By cancelButton = new By.ByCssSelector("button[data-automation=\"personal-details-cancel-link\"]");
    private By addResumeButton = new By.ByCssSelector("button[data-automation=\"resume-edit-link\"]");
    private By resumeBrowse = new By.ById("resumeFileInput");
    private By resumeUploadDoneButton = new By.ByCssSelector("#resume button[data-automation=\"manage-resume-done\"]");
    private By resumeDownloadLinks =  new By.ByCssSelector("._3l8DL");
    private By addOrManageResumeButton = new By.ByCssSelector("button[data-automation='resume-edit-link']");

    public EditUserProfilePage selectLocation(String option) {
        select(homeLocation_select, option);
        return this;
    }

    public EditUserProfilePage inputFirstName(String firstName) {
        inputText(this.firstName, firstName);
        return this;
    }

    public EditUserProfilePage inputLastName(String lastName) {
        inputText(this.lastName, lastName);
        return this;
    }

    public EditUserProfilePage inputPhoneNumber(String phoneNumber) {
        inputText(this.phoneNumber, phoneNumber);
        return this;
    }

    public UserProfilePage personalDetailClickSave() {
        clickButton(personalDetailsSaveButton);
        return new UserProfilePage();
    }

    public EditUserProfilePage clickCancel() {
        clickButton(cancelButton);
        return this;
    }

    public EditUserProfilePage clickAddResume() {
        clickButton(addResumeButton);
        return this;
    }

    public void upLoadResume(String filePath) {
        uploadFile(resumeBrowse, filePath);
    }

    public void uploadResumeClickDone() throws InterruptedException {
        Thread.sleep(3000);
        clickButton(resumeUploadDoneButton);
    }

    public ArrayList<String> getResumeDownloadLinkTexts(){
        ArrayList<String> resumeLinkTexts = new ArrayList<>();
        List<WebElement> resumeLinks = driver.findElements(resumeDownloadLinks);
        resumeLinks.forEach(resumeLink -> resumeLinkTexts.add(resumeLink.getText()));
        return resumeLinkTexts;
    }

    public void clickAddOrManageResumeButton(){
        clickButton(addOrManageResumeButton);
    }

}
