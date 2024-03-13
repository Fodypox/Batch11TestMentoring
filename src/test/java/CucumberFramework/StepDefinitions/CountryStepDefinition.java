package CucumberFramework.StepDefinitions;

import CucumberFramework.Pages.CampusPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.poi.ss.usermodel.*;
import org.testng.Assert;

import java.io.FileInputStream;
import java.io.IOException;

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

    @When("I create a new Country using excel data")
    public void iCreateANewCountryUsingExcelData() throws IOException {
//        String path = "src/test/java/Resources/CampusData.xlsx";
//        FileInputStream fileInputStream = new FileInputStream(path);
//        Workbook workbook = WorkbookFactory.create(fileInputStream);
//        Sheet sheet = workbook.getSheet("OurSheet");
//        Row row = sheet.getRow(3);
//        Cell countryName = row.getCell(0);
//        Cell countryCode = row.getCell(1);
        String newCountry = page.generateRandomWord();
        page.writeInExcel("src/test/java/Resources/CampusData.xlsx","OurSheet",3,0,newCountry);
        String textFromExcel = page.readFromExcel("src/test/java/Resources/CampusData.xlsx","OurSheet",3,0);
        page.clickMethod(page.getAddBtn());
        page.sendKeysMethod(page.getNameField(), textFromExcel);
        page.sendKeysMethod(page.getCodeField(), "111");
        page.clickMethod(page.getSaveBtn());
    }

    @Then("New Country should be created")
    public void newCountryShouldBeCreated() {
    }
}
