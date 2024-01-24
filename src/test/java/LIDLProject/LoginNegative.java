package LIDLProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginNegative extends DriverClass{
    public static void main(String[] args) {
        MyMethods.login("qwerty1234@gmail.com","");
        WebElement errorMessage = driver.findElement(By.xpath("//li[text()='Enter a valid password.']"));
        if (errorMessage.isDisplayed()){
            System.out.println("test passed");
        }else {
            System.out.println("test failed");
        }
        quitMethod();
    }
}
