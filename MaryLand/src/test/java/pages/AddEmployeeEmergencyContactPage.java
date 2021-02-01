package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.commonMethods;

public class AddEmployeeEmergencyContactPage  extends commonMethods {

    @FindBy(xpath = "//input[@id='emgcontacts_name']")
    public WebElement emergencyContactName;

    @FindBy (xpath = "//input[@id='btnAddContact']")
    public WebElement addContactBtn;


    public AddEmployeeEmergencyContactPage() {
        PageFactory.initElements(driver, this);
    }

    //public void setEmergencyContactName

    public void clickOnAddEmergencyContact() {
        click(addContactBtn);
    }



}
