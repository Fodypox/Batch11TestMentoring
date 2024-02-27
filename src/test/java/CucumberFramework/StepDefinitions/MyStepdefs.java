package CucumberFramework.StepDefinitions;

import CucumberFramework.Pages.OpenMRSforCucumberPages;
import Utilities.DriverClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

public class MyStepdefs {
    OpenMRSforCucumberPages pages = new OpenMRSforCucumberPages();
    @Given("I navigate to {string}")
    public void iNavigateTo(String url) {
        DriverClass.getDriver().get(url);
    }

    @When("I enter text as {string} into element with xpath {string}")
    public void iEnterTextAsIntoXpath(String text, String xpath) {
        pages.sendKeysMethod(DriverClass.getDriver().findElement(By.xpath(xpath)),text);
    }

    @And("I click on element with xpath {string}")
    public void iClickOnElementWithXpath(String xpath) {
        pages.clickMethod(DriverClass.getDriver().findElement(By.xpath(xpath)));

    }

    @And("I wait for {int} seconds")
    public void iWaitForSeconds(int seconds) {
        try {
            Thread.sleep(seconds*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @And("I assert that title is {string}")
    public void iAssertThatTitleIs(String expectedTitle) {
        Assert.assertEquals(DriverClass.getDriver().getTitle(),expectedTitle);
    }

    @And("I quit the driver")
    public void iQuitTheDriver() {
        DriverClass.quitDriver();
    }


    @And("I assert that element with xpath {string} is present")
    public void iAssertThatElementWithXpathIsPresent(String xpath) {
        Assert.assertTrue(DriverClass.getDriver().findElement(By.xpath(xpath)).isDisplayed());
    }

    @And("I assert that {string} is equal to element with xpath {string}")
    public void iAssertThatIsEqualToElementWithXpath(String expected, String xpath) {
        pages.waitUntilVisible(DriverClass.getDriver().findElement(By.xpath(xpath)));
        Assert.assertEquals(expected,DriverClass.getDriver().findElement(By.xpath(xpath)).getText());
    }
}
