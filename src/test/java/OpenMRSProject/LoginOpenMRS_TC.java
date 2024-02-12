package OpenMRSProject;

import Pages.OpenMRSPage;
import Utilities.DriverClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Random;

public class LoginOpenMRS_TC {
    @Test
    public void loginTC(){
        OpenMRSPage pages = new OpenMRSPage();
        DriverClass.getDriver().get("https://demo.openmrs.org/openmrs/login.htm");
        pages.sendKeysMethod(pages.username, "admin");
        pages.sendKeysMethod(pages.password, "Admin123");

        ArrayList<WebElement> elements = (ArrayList<WebElement>) DriverClass.getDriver().findElements(By.cssSelector("ul#sessionLocation>li"));
        Random rand = new Random();

        // Generate a random number between 1 and 6 (inclusive)
        int randomNumber = rand.nextInt(6) + 1;
        pages.clickMethod(elements.get(randomNumber));

        pages.clickMethod(pages.loginBtn);

        String expectedTitle = "Home";
        String actualTitle = DriverClass.getDriver().getTitle();

        pages.assertTrueMethod(expectedTitle.equals(actualTitle));

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        DriverClass.quitDriver();

    }
}
