package com.hrms.stepdefinitions;

import com.hrms.utils.CommonMethods;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AddEmployeeStepDefinition extends CommonMethods {
    @When("click on PIM")
    public void click_on_pim() {
dashboardPage.clickOnPIM();
    }
    @When("click on add employee button")
    public void click_on_add_employee_button() {
dashboardPage.clickOnAddEmployeeBtn();
    }
    @Then("enter first and last name")
    public void enter_first_and_last_name() {
addEmployeePage.enterFirstAndLastName("Harry", "Potter");
    }
    @Then("click on save button")
    public void click_on_save_button() {
addEmployeePage.clickOnSaveBtn();
    }
    @Then("verify employee is added successfully")
    public void verify_employee_is_added_successfully() {
String actualProfileName = personalDetailsPage.getUserProfileName();
        Assert.assertEquals("Verifying profile name","Harry Potter", actualProfileName);
    }

}
