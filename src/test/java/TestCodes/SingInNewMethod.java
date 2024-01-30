package TestCodes;

import LIDLProject.MyMethods;
import Utilities.DriverClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SingInNewMethod {
    @Test
    public void signInTest(){
        MyMethods.cookies();
        MyMethods.myWait(3);
        WebElement signInBtn = DriverClass.getDriver().findElement(By.cssSelector(".sign-in>a"));
        signInBtn.click();
        MyMethods.myWait(3);


        WebElement myLidl = DriverClass.getDriver().findElement(By.xpath("//a[@data-test='joinButton']"));
        myLidl.click();
        MyMethods.myWait(3);

        WebElement fName = DriverClass.getDriver().findElement(By.xpath("//input[@name='firstName']"));
        fName.sendKeys("John"+ Keys.TAB+"Smith"+Keys.TAB+"johnsmith12345@gmail.com"
                +Keys.TAB+"johnsmith12345@gmail.com"+Keys.TAB+"Qwerty123"+Keys.TAB+"(111) 567-8944"
                +Keys.TAB+"76457"+Keys.TAB+"11/11/1987"+Keys.TAB+Keys.TAB+"123 Main st"+Keys.TAB
                +"New York"+Keys.TAB+Keys.ARROW_DOWN+"n"+Keys.ARROW_DOWN+Keys.ARROW_DOWN+Keys.ARROW_DOWN
                +Keys.ARROW_DOWN+Keys.ARROW_DOWN+Keys.ENTER+Keys.TAB+Keys.TAB+Keys.ENTER);
    }
}
