package LIDLProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginUS extends DriverClass{
    public static void main(String[] args) {
//        login with happy path
        MyMethods.login("qwerty1234@gmail.com","Qwerty123");
        WebElement myUsersName = driver.findElement(By.xpath("//span[contains(text(),'Abraham')]"));
        if (myUsersName.isDisplayed()){
            System.out.println("test passed");
        }else {
            System.out.println("test failed");
        }
        quitMethod();
    }
}
