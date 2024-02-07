package Pages;

import Utilities.CommonMethods;
import Utilities.DriverClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRMPages extends CommonMethods {
    public OrangeHRMPages() {
        PageFactory.initElements(DriverClass.getDriver(),this);
    }

    @FindBy(css = "input[name='username']")
    public WebElement username;

    @FindBy(css = "input[name='password']")
    public WebElement password;

    @FindBy(css = "button[type='submit']")
    public WebElement loginBtn;
}
