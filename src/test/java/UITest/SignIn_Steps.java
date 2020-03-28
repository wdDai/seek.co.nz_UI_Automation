package UITest;

import Pages.HomePage;
import Pages.SignedInPage;
import Pages.SigningInPage;
import io.cucumber.java.en.*;

import static org.junit.Assert.assertEquals;


public class SignIn_Steps {
    @Given("I'm on homepage")
    public void i_m_on_homepage() {
        new HomePage().goHome();
    }

    @Given("I've clicked sign in link")
    public void i_ve_clicked_sign_in_link() {
        new HomePage().clickSignIn();
    }

    @Given("I've entered testeryouknowwho@gmail.com and testeryouknowwho")
    public void i_ve_entered_testeryouknowwho_gmail_com_and_testeryouknowwho() {
        SigningInPage signingInPage = new SigningInPage();
        signingInPage.enterEmail("testeryouknowwho@gmail.com");
        signingInPage.enterPassword("testeryouknowwho");
    }

    @When("I click sign in button")
    public void i_click_sign_in_button() {
        new SigningInPage().clickSignIn();
    }

    @Then("I should be logged in")
    public void i_should_be_logged_in() {
        SignedInPage signedInPage = new SignedInPage();
        assertEquals(signedInPage.getUserName(), "tester");
    }
}
