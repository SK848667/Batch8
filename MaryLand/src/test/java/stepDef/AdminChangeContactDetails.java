package stepDef;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utils.commonMethods;

public class AdminChangeContactDetails extends commonMethods {
    @When("click on PIM")
    public void click_on_pim() throws InterruptedException {
        Thread.sleep(2000);
        dashboardPage.clickOnPIMBtn();
        Thread.sleep(2000);
    }

    @When("click on Employee List")
    public void click_on_employee_list() throws InterruptedException {
        pimpage.clickAdele();
        Thread.sleep(2000);
    }

    @Then("click on contact details button")
    public void click_on_contact_details_button() throws InterruptedException {
        personalDetailsPage.clickOnContactDetails();
        Thread.sleep(2000);
    }

    @Then("click on Edit and change information")
    public void click_on_edit_and_change_information() throws InterruptedException {
        personalDetailsPage.clickONsave_editBtn();
        personalDetailsPage.setAddressStreet1("111 new adress");
        personalDetailsPage.setAddressStreet2("222 Second new address");
        personalDetailsPage.setCity("Newcity");
        personalDetailsPage.SetState("Maryland");
        personalDetailsPage.setZipCode("6666666");
        personalDetailsPage.SetCountry("Togo");
        personalDetailsPage.setHomePhone("9998885544");
        personalDetailsPage.setWorkPhone("7775559966");
        personalDetailsPage.setMobile("11122233344");
        Thread.sleep(2000);
    }

    @Then("add {string} email")
    public void add_email(String email) {
        personalDetailsPage.setWorkEmail(email);
    }

    @Then("save it")
    public void save_it() throws InterruptedException {
        personalDetailsPage.clickONsave_editBtn();
        Thread.sleep(2000);
    }

    @Then("verify that {string} saved correctly")
    public void verify_that_saved_correctly(String email) {
        Assert.assertTrue(personalDetailsPage.getWorkedEmail().contains(email));
    }
}

