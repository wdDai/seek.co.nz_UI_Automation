package TestUtils;

import Base.TestBase;
import Pages.SignedInPage;
import Pages.SigningInPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;

public class TestUtils extends TestBase {
    public static void signIn(){
        SigningInPage signingInPage = homePage.clickSignIn();
        signingInPage.enterEmail("testeryouknowwho@gmail.com");
        signingInPage.enterPassword("testeryouknowwho");
        SignedInPage signedInPage = signingInPage.clickSignIn();;

    }


    public static void signOut(){
        SignedInPage signedInPage = new SignedInPage();
        signedInPage.clickUserDropdownMenu().clickSignOut();

    }
}
