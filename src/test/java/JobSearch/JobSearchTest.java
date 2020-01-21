package JobSearch;

import Base.TestBase;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class JobSearchTest extends TestBase {
    @Test
    public void testJobSearch() {
        // Act
        SignedInPage signedInPage = new SignedInPage();
        JobSearchPage jobSearchPage = signedInPage.clickJobSearchTab();
        jobSearchPage.inputSearchKeyWords("adviser");
        jobSearchPage.tickCheckBox(29);
        jobSearchPage.inputArea("auckland");
        jobSearchPage.choseArea(1);
        jobSearchPage.clickSearchButton();

        // Assert
        assertTrue(jobSearchPage.searchSuccessful());
    }

    @Test(dependsOnMethods = "testJobSearch")
    public void testJobSearchResult(){

    }
}
