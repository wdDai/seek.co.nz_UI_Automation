# UI Test - seek.co.nz
This is a personal project UI testing seek.co.nz, which is a website for New Zealand's employment market.

## Running the tests
### Using Maven
This method uses TestNG framework. Located test report is at target/surefire-reports/
```
mvn test
```

## Built With
- Java
- Maven
- Selenium WebDriver
- TestNG
- Cucumber
- JUnit
- Jenkins

### Using Cucumber

Right click on src/test/resources/UITest/*.feature to run

## Code details

BasePage encapsulates the basic methods for page classes
```
public class BasePage {
    protected static WebDriver driver;
    protected static WebDriverWait wait;

    protected void click(By element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
        driver.findElement(element).click();
    }
}
```

Page classes extends BasePage class containing actions to be tested:
```
public class HomePage extends BasePage {
    private By signInLink = By.cssSelector("a._2l410Lj[title=\"Sign in\"]");
    public SigningInPage clickSignIn() {
        click(signInLink);
        return new SigningInPage();
    }
}
```

## Author
Alex Dai


