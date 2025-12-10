package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CalculatorPage;

public class CalculatorTests extends BaseTest {

    @Test
    public void testAddition() throws InterruptedException {
        CalculatorPage calc = new CalculatorPage(driver);

        calc.digit(7).click();
        calc.plusButton().click();
        calc.digit(3).click();
        calc.equalsButton().click();

        Thread.sleep(1000);

        String value = calc.result().getText();
        System.out.println("Addition Result: " + value);

        Assert.assertEquals(value.trim(), "10", "Addition FAILED!");
    }

    @Test
    public void testSubtraction() throws InterruptedException {
        CalculatorPage calc = new CalculatorPage(driver);

        calc.digit(1).click();
        calc.digit(0).click();

        calc.minusButton().click();

        calc.digit(4).click();
        calc.equalsButton().click();

        Thread.sleep(1000);

        String value = calc.result().getText();
        System.out.println("Subtraction Result: " + value);

        Assert.assertEquals(value.trim(), "6");
    }


    @Test
    public void testMultiplication() throws InterruptedException {
        CalculatorPage calc = new CalculatorPage(driver);

        calc.digit(5).click();
        calc.multiplyButton().click();
        calc.digit(6).click();
        calc.equalsButton().click();

        Thread.sleep(1000);

        String value = calc.result().getText();
        System.out.println("Multiplication Result: " + value);

        Assert.assertEquals(value.trim(), "30", "Multiplication FAILED!");
    }

    @Test
    public void testDivision() throws InterruptedException {
        CalculatorPage calc = new CalculatorPage(driver);

        calc.digit(2).click();
        calc.digit(0).click();

        calc.divideButton().click();

        calc.digit(4).click();
        calc.equalsButton().click();

        Thread.sleep(1000);

        String value = calc.result().getText();
        System.out.println("Division Result: " + value);

        Assert.assertEquals(value.trim(), "5");
    }

}
