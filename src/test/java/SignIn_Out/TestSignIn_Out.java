package SignIn_Out;

import Base.TestBase;
import Pages.SignedInPage;
import TestUtils.TestUtils;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;

public class TestSignIn_Out extends TestBase {
    @Test
    public void testSignIn() {
        // Assert
        SignedInPage signedInPage = new SignedInPage();
        assertEquals(signedInPage.getUserName(), "tester");
    }

    @Test
    public void testSignOut() throws InterruptedException {
        // Act
        TestUtils.signOut();

        //Assert
        assertFalse(homePage.isSignedIn());
    }
}
