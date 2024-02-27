package CucumberFramework.Pages;

import Utilities.CommonMethods;
import Utilities.DriverClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CampusPage extends CommonMethods {
    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    private WebElement MainSetup;
    @FindBy(xpath = "//span[text()='Parameters']")
    private WebElement Parameters;
    @FindBy(xpath = "//span[text()='Countries']")
    private WebElement CountryBtn;
    @FindBy(xpath = "(//span[@class='mat-mdc-focus-indicator'])[10]")
    private WebElement addBtn;
    @FindBy(xpath = "(//input[@data-placeholder='Name'])[2]")
    private WebElement nameField;
    @FindBy(xpath = "(//input[@data-placeholder='Code'])[2]")
    private WebElement codeField;

    @FindBy(xpath = "//span[text()='Save']")
    private WebElement saveBtn;

    public CampusPage() {
        PageFactory.initElements(DriverClass.getDriver(), this);
    }

    public WebElement getMainSetup() {
        return MainSetup;
    }

    public WebElement getParameters() {
        return Parameters;
    }

    public WebElement getCountryBtn() {
        return CountryBtn;
    }

    public WebElement getAddBtn() {
        return addBtn;
    }

    public WebElement getNameField() {
        return nameField;
    }

    public WebElement getCodeField() {
        return codeField;
    }

    public WebElement getSaveBtn() {
        return saveBtn;
    }
}
