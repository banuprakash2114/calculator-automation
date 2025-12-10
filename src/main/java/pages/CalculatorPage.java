package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CalculatorPage {

    private final AndroidDriver driver;

    public CalculatorPage(AndroidDriver driver) {
        this.driver = driver;
    }

    public WebElement digit(int n) {
        return driver.findElement(By.id("com.motorola.cn.calculator:id/digit_" + n));
    }

    public WebElement plusButton() {
        return driver.findElement(By.id("com.motorola.cn.calculator:id/op_add"));
    }

    public WebElement minusButton() {
        return driver.findElement(By.id("com.motorola.cn.calculator:id/op_sub"));
    }

    public WebElement multiplyButton() {
        return driver.findElement(By.id("com.motorola.cn.calculator:id/op_mul"));
    }

    public WebElement divideButton() {
        return driver.findElement(By.id("com.motorola.cn.calculator:id/op_div"));
    }

    public WebElement equalsButton() {
        return driver.findElement(By.id("com.motorola.cn.calculator:id/eq"));
    }

    public WebElement result() {
        return driver.findElement(By.id("com.motorola.cn.calculator:id/formula_or_result"));
    }
}
