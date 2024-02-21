package CucumberFramework.StepDefinitions;

import CucumberFramework.Pages.OpenMRSforCucumberPages;
import Utilities.DriverClass;
import io.cucumber.java.en.*;
import org.testng.Assert;

public class NewStepDefinitions {
    OpenMRSforCucumberPages page = new OpenMRSforCucumberPages();
    @When("I navigate to openMRS login page")
    public void iNavigateToOpenMRSLoginPage() {
        DriverClass.getDriver().get("https://demo.openmrs.org/openmrs/login.htm");
    }

    @When("I enter valid credentials")
    public void iEnterValidCredentials() {
        page.sendKeysMethod(page.username, "admin");
        page.sendKeysMethod(page.password, "Admin123");

    }

    @And("I click on login button")
    public void iClickOnLoginButton() {

        page.clickMethod(page.loginBtn);
    }

    @Then("I should be logged in")
    public void iShouldBeLoggedIn() {
//        Assert.assertEquals(DriverClass.getDriver().getTitle(),"Home");
        page.assertEqualMethod(DriverClass.getDriver().getTitle(),"Home");

    }

    @And("I select a location")
    public void iSelectALocation() {
        page.clickMethod(page.locations.get(1));

    }
}
