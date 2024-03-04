package CucumberFramework.StepDefinitions;

import CucumberFramework.Pages.CampusPage;
import Utilities.CommonMethods;
import Utilities.DriverClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class LumaStepsTatiana {
    CampusPage page = new CampusPage();
    @Given("navigate to LUma")
    public void navigateToLUma() {
        DriverClass.getDriver().get("https://magento.softwaretestingboard.com/");
    }

    @When("click on signin")
    public void clickOnSignin() {
        page.clickMethod(page.registerBtn);
    }
}
