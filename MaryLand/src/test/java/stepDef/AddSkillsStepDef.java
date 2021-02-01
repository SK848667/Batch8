package stepDef;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utils.commonMethods;

public class AddSkillsStepDef extends commonMethods{

    @When("log in to hrms")
    public void log_in_to_hrms() throws InterruptedException {

       Thread.sleep(2000);

       loginPage.login("Admin","Hum@nhrm123");
       loginPage.clickOnLoginBtn();
    }

    @When("click on Admin Button")

    public void click_on_admin_button() throws InterruptedException {
        Thread.sleep(1000);
        dashboardPage.clickOnAdminbtn();
    }

    @Then("select Skills")
    public void select_Skills() throws InterruptedException {
        Thread.sleep(1000);
dashboardPage.movetoQu();
    }

    @Then("click on Add Button")
    public void click_on_add_button() throws InterruptedException {
        Thread.sleep(2000);
skillsPage.clickinOnAddbtn();
    }

    @Then("Enter skills {string}")
    public void enter_skills(String theSkills) throws InterruptedException {
        Thread.sleep(2000);
       skillsPage.SendLicense(theSkills);
    }

    @Then("Click on Save Button")
    public void click_on_save_button() {
       skillsPage.clickSaveBtn();
    }

    @Then("verify that skills {string} have been added")
    public void verify_that_skills_have_been_added(String skills) throws InterruptedException {
        Thread.sleep(300);

         Assert.assertTrue(skillsPage.myTableofSkills().contains(skills));
    }
}
