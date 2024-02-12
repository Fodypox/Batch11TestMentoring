package TestCodes;

import Pages.OrangeHRMPages;
import Utilities.CommonMethods;
import Utilities.DriverClass;
import org.testng.annotations.Test;

public class HRMLogin {
    OrangeHRMPages orange = new OrangeHRMPages();

    @Test
    public void loginSteps(){
        DriverClass.getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        orange.sendKeysMethod(orange.username, "Admin");
        orange.sendKeysMethod(orange.password, "admin123");
        orange.clickMethod(orange.loginBtn);
        String expectedTitle = "OrangeHRM";
        String actualTitle = DriverClass.getDriver().getTitle();
        orange.assertTrueMethod(expectedTitle.equals(actualTitle));
        DriverClass.quitDriver();


    }
}
