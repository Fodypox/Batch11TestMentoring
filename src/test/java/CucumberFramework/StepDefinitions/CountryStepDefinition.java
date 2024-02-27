package CucumberFramework.StepDefinitions;

import CucumberFramework.Pages.CampusPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

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
}
