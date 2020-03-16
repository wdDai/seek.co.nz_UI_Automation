package TestUtils;

import Base.TestBase;
import Pages.SignedInPage;
import Pages.SigningInPage;

public class TestUtils extends TestBase {
    public static void signIn() {
        SigningInPage signingInPage = homePage.clickSignIn();
        signingInPage.enterEmail("testeryouknowwho@gmail.com");
        signingInPage.enterPassword("testeryouknowwho");
    }


    public static void signOut() throws InterruptedException {
        SignedInPage signedInPage = new SignedInPage();
        signedInPage.clickUserDropdownMenu().clickSignOut();
    }
}
