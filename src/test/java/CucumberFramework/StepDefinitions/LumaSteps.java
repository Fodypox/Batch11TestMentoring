package CucumberFramework.StepDefinitions;

import CucumberFramework.Pages.LumaPage;
import Utilities.DriverClass;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LumaSteps {

    LumaPage page = new LumaPage();

    @Given("Navigate to luma webpage")
    public void navigateToLumaWebpage() {
        DriverClass.getDriver().get("https://magento.softwaretestingboard.com/");
    }

    @When("I click on Create an account link")
    public void iClickOnCreateAnAccountLink() {
        page.clickMethod(page.createAccountLink);

    }

    @And("I fill the registration form")
    public void iFillTheRegistrationForm(DataTable dataTable) {
        List<List<String>> dataList = dataTable.asLists(String.class);

        page.sendKeysMethod(page.firstName, dataList.get(0).get(1) + Keys.TAB +
                dataList.get(1).get(1)+ Keys.TAB + dataList.get(2).get(1)+ Keys.TAB +
                dataList.get(3).get(1)+ Keys.TAB + dataList.get(4).get(1)+Keys.ENTER);



    }

    @And("I click on Create an account button")
    public void iClickOnCreateAnAccountButton() {
    }

    @Then("New account should be created")
    public void newAccountShouldBeCreated() {
    }

    @Given("navigate")
    public void navigate() {
    }

    @When("click on my account and click on add address button")
    public void clickOnMyAccountAndClickOnAddAddressButton() {
    }

    @And("fill address form of {string} and {string} and {string} and {string}")
    public void fillAddressFormOfAndAndAnd(String arg0, String arg1, String arg2, String arg3) {
    }

    @Then("new address should be added")
    public void newAddressShouldBeAdded() {
    }

    @When("I click on login link")
    public void iClickOnLoginLink() {

        page.clickMethod(page.loginLink);

    }

    @And("I enter {string} and {string}")
    public void iEnterAnd(String username, String password) {
        page.sendKeysMethod(page.emailField, username+Keys.TAB+password+Keys.ENTER);
    }
}
