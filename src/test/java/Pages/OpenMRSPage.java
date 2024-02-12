package Pages;

import Utilities.CommonMethods;
import Utilities.DriverClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpenMRSPage extends CommonMethods {
    public OpenMRSPage() {
        PageFactory.initElements(DriverClass.getDriver(),this);
    }

    @FindBy(id = "username")
    public WebElement username;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(id = "loginButton")
    public WebElement loginBtn;

}
