package stepDef;

import testBase.BaseClass;
import utils.commonMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefinition extends commonMethods {

    @Given("navigate to HRMS login page")
    public void navigate_to_hrms_login_page() {
        setUp();
    }

    @When("enter valid credentials")
    public void enter_valid_credentials() {
        loginPage.login("Admin", "Hum@nhrm123");
    }

    @When("click on login button")
    public void click_on_login_button() {
        loginPage.clickOnLoginBtn();
    }

    @Then("quit the browser")
    public void quit_the_browser() {
        commonMethods.takeScreenshot(getTimeStamp("yyyy-MM-dd-HH-mm-ss"));
        BaseClass.tearDown();
    }




}
