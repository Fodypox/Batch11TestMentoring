package Utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page extends CommonMethods{
    public Page() {
        PageFactory.initElements(DriverClass.getDriver(),this);
    }

    @FindBy(xpath = "//button[text()='Hover Over Me First!']")
    public WebElement hoverMeFirst;

    @FindBy(xpath = "//button[text()='Hover Over Me First!']/../div/a")
    public WebElement link1;

    @FindBy(css = "div[id='click-box']")
    public WebElement clickAndHold;
}
