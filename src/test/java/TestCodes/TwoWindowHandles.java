package TestCodes;

import LIDLProject.MyMethods;
import Utilities.DriverClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class TwoWindowHandles {
    public void waitMethod(int sec){
        try {
            Thread.sleep(sec*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    @Test
    public void twoWindow(){

        DriverClass.getDriver().get("https://sumoquoteweb-qa.azurewebsites.net/new-account");
        waitMethod(10);
        ((JavascriptExecutor) DriverClass.getDriver()).executeScript("window.open()");

        ArrayList<String> tabs = new ArrayList<>(DriverClass.getDriver().getWindowHandles());
        DriverClass.getDriver().switchTo().window(tabs.get(1));
        waitMethod(3);
        DriverClass.getDriver().get("https://generator.email/");
        waitMethod(3);
        String emailAddress = DriverClass.getDriver().findElement(By.cssSelector("span[id=email_ch_text]")).getText();
        waitMethod(3);
        DriverClass.getDriver().switchTo().window(tabs.get(0));
        waitMethod(3);
        WebElement emailField = DriverClass.getDriver().findElement(By.id("emailAddress"));
        emailField.sendKeys(emailAddress);

        DriverClass.quitDriver();
    }
}
