package Utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class CommonMethods {
    public WebDriverWait wait = new WebDriverWait(DriverClass.getDriver(), Duration.ofSeconds(10));

    public void waitUntilVisible(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitUntilClickable(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void clickMethod(WebElement element){
        waitUntilClickable(element);
        scrollToElement(element);
        element.click();
    }

    public void sendKeysMethod(WebElement element, String text){
        waitUntilVisible(element);
        scrollToElement(element);
        element.sendKeys(text);
    }

    public void scrollToElement(WebElement element){
        JavascriptExecutor js = (JavascriptExecutor) DriverClass.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);",element);
    }

    public void assertTrueMethod(boolean assertion){
        Assert.assertTrue(assertion);
    }

    public void assertEqualMethod(String actual, String expected){
        Assert.assertEquals(actual,expected);
    }

    public void assertEqualMethod(int actual, int expected){
        Assert.assertEquals(actual,expected);
    }

    public void assertFalseMethod(boolean assertion){
        Assert.assertFalse(assertion);
    }

    public void assertNotEqualMethod(String actual, String expected){
        Assert.assertNotEquals(actual,expected);
    }

    public void assertNotEqualMethod(int actual, int expected){
        Assert.assertNotEquals(actual,expected);
    }







}
