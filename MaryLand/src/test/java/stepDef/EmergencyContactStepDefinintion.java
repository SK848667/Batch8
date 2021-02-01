package stepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.commonMethods;

public class EmergencyContactStepDefinintion extends commonMethods {

    @When("select a employee")
    public void select_a_employee() throws InterruptedException {
        Thread.sleep(2000);
       pimpage.clickAdele();
    }

    @Then("click on emergency contact details")
    public void click_on_emergency_contact_details() throws InterruptedException {
        Thread.sleep(2000);
       piMemployeeListPage.AddEmergencyContact();
    }

    @When("click add")
    public void click_add() throws InterruptedException {
        Thread.sleep(2000);
       addEmployeeEmergencyContactPage.clickOnAddEmergencyContact();
    }

    @Then("write all emergency contact info")
    public void write_all_emergency_contact_info() throws InterruptedException {
        Thread.sleep(2000);
        addEmployeeDetailsEmergensyContactsPage.setNameBar("Gabbi");
        addEmployeeDetailsEmergensyContactsPage.setRelationshipContact("daughter");
        addEmployeeDetailsEmergensyContactsPage.setHomePhoneContact("1112223344");
        addEmployeeDetailsEmergensyContactsPage.setCellPhoneContact("2223334455");
        addEmployeeDetailsEmergensyContactsPage.setWorkPhoneContact("4445556677");

    }

    @Then("save")
    public void save() {
       addEmployeeDetailsEmergensyContactsPage.clickOnSaveBtn();

    }

    @Then("verify that have been added")
    public void verify_that_have_been_added() {

    }
}
