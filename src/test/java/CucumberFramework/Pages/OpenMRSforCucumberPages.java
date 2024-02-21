package CucumberFramework.Pages;

import Utilities.CommonMethods;
import Utilities.DriverClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class OpenMRSforCucumberPages extends CommonMethods {
    public OpenMRSforCucumberPages() {
        PageFactory.initElements(DriverClass.getDriver(),this);


    }
    @FindBy(id = "username")
    public WebElement username;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(id = "loginButton")
    public WebElement loginBtn;

    @FindBy(css = "ul#sessionLocation>li")
    public List<WebElement> locations;
}
