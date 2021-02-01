package stepDef;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utils.commonMethods;


public class AdminCanAddLicenseStepDef extends commonMethods {

    @Then("select license under")
    public void select_license_under() throws InterruptedException {
        Thread.sleep(1000);
        dashboardPage.movetoQuLicense();
    }

    @Then("Enter license {string}")
    public void enter_license(String theLicense) throws InterruptedException {
        Thread.sleep(2000);
        licensePage.SendLicense(theLicense);
    }

    @Then("verify that  license {string} have been added")
    public void verify_that_license_have_been_added(String license) throws InterruptedException {
        Thread.sleep(300);
        Assert.assertTrue(licensePage.myTableofLicense().contains(license));
    }

//
//    @Then("select license under")
//    public void select_license_under() throws InterruptedException {
//        Thread.sleep(1000);
//dashboardPage.movetoQu();
//    }
//
//    @Then("click on Add Button")
//    public void click_on_add_button() throws InterruptedException {
//        Thread.sleep(2000);
//licensePage.clickinOnAddbtn();
//    }
//
//    @Then("Enter license {string}")
//    public void enter_license(String theLicense) throws InterruptedException {
//        Thread.sleep(2000);
//       licensePage.SendLicense(theLicense);
//    }
//
//    @Then("Click on Save Button")
//    public void click_on_save_button() {
//       licensePage.clickSaveBtn();
//    }
//
//    @Then("verify that  license {string} have been added")
//    public void verify_that_license_have_been_added(String license) throws InterruptedException {
//        Thread.sleep(300);
//
//         Assert.assertTrue(licensePage.myTableofLicense().contains(license));
//    }
}
