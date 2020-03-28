package UserProfile;

import Base.TestBase;
import Pages.SignedInPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;


public class TestUserProfile extends TestBase {
    @Test
    public void testGotoUserProfilePage() throws InterruptedException {
        // Act
        SignedInPage signedInPage = new SignedInPage();
        UserProfilePage userProfilePage = signedInPage.clickUserDropdownMenu().clickProfile();

        // Assert
        assertTrue(userProfilePage.editPersonalDetailIsDisplayed());
    }

    @Test(dependsOnMethods = "testGotoUserProfilePage")
    public void testEditUserProfile() {
        // Act
        UserProfilePage userProfilePage = new UserProfilePage();
        EditUserProfilePage editUserProfilePage = userProfilePage.clickEditPersonalDetails();
        editUserProfilePage.inputFirstName("Albert").inputLastName("Einstein").inputPhoneNumber("02103134873").selectLocation("Auckland").personalDetailClickSave();

        // Assert
        assertTrue(userProfilePage.editPersonalDetailIsDisplayed());
    }

    @Test(dependsOnMethods = "testGotoUserProfilePage")
    public void testAddResume() {
        // Act
        EditUserProfilePage editUserProfilePage = new EditUserProfilePage();
        editUserProfilePage.clickAddOrManageResumeButton();
        // TODO use relative path to upload file
        editUserProfilePage.upLoadResume("/Users/dailex/Documents/Wending_learn_group/CV.pdf ");

        // Assert
        assertTrue(editUserProfilePage.getResumeDownloadLinkTexts().contains("CV.pdf"));
    }
}
