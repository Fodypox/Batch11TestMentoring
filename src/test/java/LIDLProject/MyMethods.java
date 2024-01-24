package LIDLProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MyMethods extends DriverClass{
    public static void myWait(int seconds){
        try {
            Thread.sleep(seconds*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static void login(String username, String password){
        cookies();
        WebElement signInBtn = driver.findElement(By.xpath("//a[text()='sign in']"));
        signInBtn.click();
        myWait(2);
        WebElement emailField = driver.findElement(By.xpath("//input[@name='email']"));
        emailField.sendKeys(username);
        WebElement passwordField = driver.findElement(By.xpath("//input[@name='password']"));
        passwordField.sendKeys(password);
        WebElement loginBtn = driver.findElement(By.xpath("//button[text()='sign in']"));
        loginBtn.click();
        myWait(2);
    }
    public static void cookies(){
        MyMethods.myWait(2);
        WebElement cookiesButton = driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']"));
        if (!(cookiesButton==null))
            cookiesButton.click();
    }
}
