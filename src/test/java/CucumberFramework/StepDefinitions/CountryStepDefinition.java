package CucumberFramework.StepDefinitions;

import CucumberFramework.Pages.CampusPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class CountryStepDefinition {
    CampusPage page = new CampusPage();
    @Given("I navigate to Country page")
    public void iNavigateToCountryPage() {
        page.clickMethod(page.getMainSetup());
        page.clickMethod(page.getParameters());
        page.clickMethod(page.getCountryBtn());

    }



    @When("I create new Country")
    public void iCreateNewCountry() {
        page.clickMethod(page.getAddBtn());
        page.sendKeysMethod(page.getNameField(), "Neverlands");
        page.sendKeysMethod(page.getCodeField(), "111");
        page.clickMethod(page.getSaveBtn());
    }

    @Then("Error message with {string} already exists should appear")
    public void errorMessageWithAlreadyExistsShouldAppear(String countryName) {
//        page.waitMethod(2);
        Assert.assertTrue(page.dynamicXpath(countryName).isDisplayed());

    }

    @Given("I navigate to State page")
    public void i_navigate_to_state_page() {
        page.clickMethod(page.getMainSetup());
        page.clickMethod(page.getParameters());
        page.clickMethod(page.getStateBtn());

    }
    @When("I create new State")
    public void i_create_new_state() {
        page.clickMethod(page.getAddBtn());
        page.sendKeysMethod(page.getNameField(), "New Jersey");
        page.sendKeysMethod(page.getShortName(), "NJ");
        page.clickMethod(page.getSaveBtn());
    }
}
