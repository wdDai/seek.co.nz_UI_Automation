package Base;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BasePage {
    protected static WebDriver driver;
    protected static WebDriverWait wait;
    protected static final String HOME_URL = "http://seek.co.nz";

    public static void setDriver(WebDriver driver){
        BasePage.driver = driver;
    }

    public static void setWait(WebDriverWait wait){
        BasePage.wait = wait;
    }

    protected void click(By element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
        driver.findElement(element).click();
    }

    protected void scrollToElement(WebElement element) {
        String script = "arguments[0].scrollIntoView();";
        ((JavascriptExecutor) driver).executeScript(script, element);
    }

    protected void select(By by, String option) {
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(option);
    }

    protected void inputText(By inputField, String text) {
// TODO javascript
        wait.until(ExpectedConditions.elementToBeClickable(inputField));
        driver.findElement(inputField).sendKeys(Keys.COMMAND + "a");
        driver.findElement(inputField).sendKeys(Keys.BACK_SPACE);
        driver.findElement(inputField).sendKeys(text);
    }

    protected void uploadFile(By fileUploadField, String filePath){
        driver.findElement(fileUploadField).sendKeys(filePath);
    }

}
