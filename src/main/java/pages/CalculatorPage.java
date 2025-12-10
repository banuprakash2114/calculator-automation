package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CalculatorPage {

    private final AndroidDriver driver;

    public CalculatorPage(AndroidDriver driver) {
        this.driver = driver;
    }

    // Dynamic digit locator: digit(1), digit(2), etc.
    public WebElement digit(int n) {
        return driver.findElement(By.id(Locators.DIGIT + n));
    }

    public WebElement plusButton() {
        return driver.findElement(By.id(Locators.PLUS));
    }

    public WebElement minusButton() {
        return driver.findElement(By.id(Locators.MINUS));
    }

    public WebElement multiplyButton() {
        return driver.findElement(By.id(Locators.MULTIPLY));
    }

    public WebElement divideButton() {
        return driver.findElement(By.id(Locators.DIVIDE));
    }

    public WebElement equalsButton() {
        return driver.findElement(By.id(Locators.EQUALS));
    }

    public WebElement result() {
        return driver.findElement(By.id(Locators.RESULT));
    }
}
