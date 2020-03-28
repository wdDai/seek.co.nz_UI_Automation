package TestUtils;

import Base.TestBase;
import Pages.HomePage;
import Pages.SignedInPage;
import Pages.SigningInPage;

public class TestUtils extends TestBase {
    public static void signIn() {
        SigningInPage signingInPage = new HomePage().clickSignIn();
        signingInPage.enterEmail("testeryouknowwho@gmail.com");
        signingInPage.enterPassword("testeryouknowwho");
        signingInPage.clickSignIn();
    }


    public static void signOut() throws InterruptedException {
        SignedInPage signedInPage = new SignedInPage();
        signedInPage.clickUserDropdownMenu().clickSignOut();
    }
}
