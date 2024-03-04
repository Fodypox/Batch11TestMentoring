package CucumberFramework.Pages;

import Utilities.CommonMethods;
import Utilities.DriverClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LumaPage extends CommonMethods {
    public LumaPage() {
        PageFactory.initElements(DriverClass.getDriver(),this);
    }

    @FindBy(xpath = "//header//a[text()='Create an Account']")
    public WebElement createAccountLink;

    @FindBy(id = "firstname")
    public WebElement firstName;

    @FindBy(xpath = "//header//a[contains(text(),'Sign In')]")
    public WebElement loginLink;

    @FindBy(id="email")
    public WebElement emailField;


}
