package Pages;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class JobSearchPage extends BasePage {
    private By jobSearch = By.cssSelector("a[href=\"/\"]._17m4m-C");
    private By keyWordsInput = By.id("keywords-input");
    private By jobClassificationsBar = By.cssSelector("[data-automation=\"classificationDropDownList\"]");
    private By jobAreaSearchBar = By.id("SearchBar__Where");
    private By searchButton = By.cssSelector("button[data-automation=\"searchButton\"]");
    private By searchSummary = By.id("SearchSummary");
    private By classificationList = By.id("classificationsPanel");

    public void inputSearchKeyWords(String keyWords){
        driver.findElement(keyWordsInput).sendKeys(keyWords);
    }

    public void tickCheckBox(int index) {
        click(jobClassificationsBar);
        WebElement jobClassificationCheckBox = driver.findElement(By.cssSelector("._1E4RZFi:nth-of-type(" + index + ")"));
        jobClassificationCheckBox.click();
        click(jobClassificationsBar);
    }


    public void choseArea(int index) {
        click(jobAreaSearchBar);
        By area = By.id("react-autowhatever-1-section-0-item-" + index);
        click(area);
    }

    public void inputArea(String area) {
//        driver.findElement(jobAreaSearchBar).clear();
        driver.findElement(jobAreaSearchBar).sendKeys(area);
    }


    public void clickSearchButton() {
        click(searchButton);
    }

    public boolean searchSuccessful() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(searchSummary));
        return driver.findElement(searchSummary).isDisplayed();
    }
}
