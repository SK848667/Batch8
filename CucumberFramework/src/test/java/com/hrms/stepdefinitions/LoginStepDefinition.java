package com.hrms.stepdefinitions;

import com.hrms.utils.CommonMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefinition extends CommonMethods {

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

    @Then("verify dashboard is displayed")
    public void verify_dashboard_is_displayed() {
        Assert.assertTrue(dashboardPage.welcomeMessage.isDisplayed());
    }

    @Then("quit the browser")
    public void quit_the_browser() {
        tearDown();
    }

    @When("enter invalid credentials")
    public void enter_invalid_credentials() {
        loginPage.login("Admin343", "Hum@nhrm12sdfad3");
    }

    @Then("verify error message")
    public void verify_error_message() {
        Assert.assertEquals("Verifying error message", "Invalid credentials", loginPage.getErrorMessageText());
    }

    //HW------------------------------------------------------------------
    @When("leave the username empty and enter password")
    public void leave_the_user_name_empty_and_enter_password() {
        loginPage.login("", "Hum@nhrm123");
    }

    @Then("verify user cannot be empty message")
    public void verify_user_cannot_be_empty_message() {
        Assert.assertEquals("Verifying user cannot be empty message", "Username cannot be empty", loginPage.getErrorMessageText());
    }

    @When("entering username and leaving password empty")
    public void entering_username_and_leaving_password_empty() {
        loginPage.login("Admin", "");

    }

    @Then("verify password cannot be empty message")
    public void verify_password_cannot_be_empty_message() {
        Assert.assertEquals("Verifying password cannot be empty message", "Password cannot be empty", loginPage.getErrorMessageText());
    }
//---------------------------------------------------------------------------------------------------


}
