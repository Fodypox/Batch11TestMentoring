package LIDLProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SignInSteps extends DriverClass{
    public static void main(String[] args) {

//        MyMethods.myWait(2);
//        WebElement cookiesButton = driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']"));
//        cookiesButton.click();
        MyMethods.cookies();

        WebElement signInBtn = driver.findElement(By.xpath("//a[text()='sign in']"));
        signInBtn.click();


        WebElement myLidl = driver.findElement(By.xpath("//a[@data-test='joinButton']"));
        myLidl.click();

        WebElement fName = driver.findElement(By.xpath("//input[@name='firstName']"));
        fName.sendKeys("Abraham");
        WebElement lName = driver.findElement(By.xpath("//input[@name='lastName']"));
        lName.sendKeys("Lincoln");

        WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
        email.sendKeys("qwerty1234@gmail.com");
        WebElement confirmEmail = driver.findElement(By.xpath("//input[@name='confirm_email']"));
        confirmEmail.sendKeys("qwerty1234@gmail.com");
        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
        password.sendKeys("Qwerty123");

        WebElement phone = driver.findElement(By.xpath("//input[@name='phone']"));
        phone.sendKeys("(911) 111-1108");

        WebElement zip = driver.findElement(By.xpath("//input[@name='zip']"));
        zip.sendKeys("09045");


        WebElement bd = driver.findElement(By.xpath("//input[@name='birthday']"));
        bd.sendKeys("05/13/2009");
        MyMethods.myWait(1);
        WebElement stateSelection = driver.findElement(By.xpath("//option[text()='Alabama']/.."));
        stateSelection.click();
        MyMethods.myWait(1);
        WebElement coloradoState = driver.findElement(By.xpath("//option[text()='Colorado']"));
        coloradoState.click();
//        Select select = new Select(stateSelection);
//        select.deselectByVisibleText("Colorado");
        MyMethods.myWait(1);

        WebElement confirm = driver.findElement(By.cssSelector(".spinnie-container"));
        confirm.click();
        quitMethod();
    }
}
