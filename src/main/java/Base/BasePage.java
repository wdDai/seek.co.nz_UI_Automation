package Base;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BasePage {
    protected static WebDriver driver;
    protected static WebDriverWait wait;

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
        driver.findElement(inputField).sendKeys(Keys.COMMAND + "a");
        driver.findElement(inputField).sendKeys(Keys.BACK_SPACE);
        driver.findElement(inputField).sendKeys(text);
    }

    protected void clickButton(By button) {
        wait.until(ExpectedConditions.elementToBeClickable(button));
        driver.findElement(button).click();
    }

    protected void uploadFile(By fileUploadField, String filePath){
        driver.findElement(fileUploadField).sendKeys(filePath);
    }

}
