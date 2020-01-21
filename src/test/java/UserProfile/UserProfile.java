package UserProfile;

import Base.TestBase;
import Pages.SignedInPage;
import org.testng.annotations.Test;
import UserProfile.*;
import static org.testng.Assert.assertTrue;


public class UserProfile extends TestBase {
    @Test
    public void testGotoUserProfilePage(){
        // Act
        SignedInPage signedInPage = new SignedInPage();
        UserProfilePage userProfilePage = signedInPage.clickUserDropdownMenu().clickProfile();

        // Assert
        assertTrue(userProfilePage.editPersonalDetailIsDisplayed());
    }

    @Test(dependsOnMethods = "testGotoUserProfilePage")
    public void testEditUserProfile(){
        // Act
        UserProfilePage userProfilePage = new UserProfilePage();
        EditUserProfilePage editUserProfilePage = userProfilePage.clickEditPersonalDetails();
        editUserProfilePage.inputFirstName("Albert").inputLastName("Einstein").inputPhoneNumber("02103134873").selectLocation("Auckland").clickSave();

        // Assert
        assertTrue(userProfilePage.editPersonalDetailIsDisplayed());
    }

    @Test
    public void testAddResume(){
        EditUserProfilePage editUserProfilePage = new EditUserProfilePage();
        editUserProfilePage.upLoadResume("/Users/dailex/Documents/Wending_learn_group/IntelliJIDEA_ReferenceCard.pdf ");
    }
}
