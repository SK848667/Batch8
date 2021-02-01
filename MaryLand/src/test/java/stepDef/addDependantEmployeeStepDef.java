package stepDef;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.PIMemployeeListPage;
import utils.commonMethods;

public class addDependantEmployeeStepDef extends commonMethods {
    @When("enter Id of employee")
    public void enter_id_of_employee() {
        piMemployeeListPage.setEmployeeIDSearch("2021");
    }

    @When("click  on search")
    public void click_on_search() throws InterruptedException {
        piMemployeeListPage.clickOnSearchBtn();
        Thread.sleep(2000);
    }

    @Then("click on employee on the table")
    public void click_on_employee_on_the_table() {
   piMemployeeListPage.clickOnAddedEmployeeID();

    }

    @When("click on Dependants")
    public void click_on_dependants() {
        personalDetailsPage.clickOnDependent();
    }

    @When("click on Add Dependants Button")
    public void click_on_add_dependants_button() throws InterruptedException {
        Thread.sleep(2000);
        personalDetailsPage.clickOnDependentsAddButton();
    }

    @When("enter name of dependant {string}")
    public void enter_name_of_dependant(String string) {
        personalDetailsPage.dependantName(string);
    }

    @When("enter relationship dependant's employee")
    public void enter_relationship_dependant_s_employee() {
        selectDDValue(personalDetailsPage.relationshipDD, "Child");
    }

    @When("enter Date of Birth")
    public void enter_date_of_birth() {
        personalDetailsPage.clickOnDateOfBirth("2008-02-02");
    }

    @When("click on save button")
    public void click_on_save_button() {
      personalDetailsPage.clickOnSaveDependent();
    }


    @Then("verify if dependent {string} is added")
    public void verify_if_dependent_is_added(String string) {
        Assert.assertTrue(personalDetailsPage.verifiedAddedDependentsEmployee().contains(string));
    }

}
