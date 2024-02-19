package Pages;

import Utilities.CommonMethods;
import Utilities.DriverClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ECommercePage extends CommonMethods {
    public ECommercePage() {
        PageFactory.initElements(DriverClass.getDriver(),this);
    }

    @FindBy(xpath = "(//ul[@class='top-menu notmobile']//ul)[1]//a")
    public List<WebElement> computerList;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[text()='Computers ']")
    public WebElement computer;

    @FindBy(xpath = "(//ul[@class='top-menu notmobile']//ul)[1]//a")
    public List<WebElement> electronicsList;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[text()='Computers ']")
    public WebElement electronics;

    @FindBy(xpath = "(//ul[@class='top-menu notmobile']//ul)[1]//a")
    public List<WebElement> apparelList;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[text()='Computers ']")
    public WebElement apparel;
}
