package CucumberFramework.StepDefinitions;

import Utilities.DriverClass;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LumaSteps {
    @Given("Navigate to luma webpage")
    public void navigateToLumaWebpage() {
    }

    @When("I click on Create an account link")
    public void iClickOnCreateAnAccountLink() {

    }

    @And("I fill the registration form")
    public void iFillTheRegistrationForm(DataTable dataTable) {
        List<List<String>> dataList = dataTable.asLists(String.class);
        WebElement firstNameField = DriverClass.getDriver().findElement(By.xpath("jhdfjdh"));
//        firstNameField.sendKeys("Tester");
        firstNameField.sendKeys(dataList.get(0).get(1));
        for (int i = 0; i < dataList.size(); i++) {
            System.out.println(dataList.get(i).get(0)+" is "+dataList.get(i).get(1)+" additional info "+dataList.get(i).get(2));
        }

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
}
