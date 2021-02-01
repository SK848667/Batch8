package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.commonMethods;

public class EmployeeEmergencyContactsPage extends commonMethods {

    @FindBy (xpath = "//input[@id='btnAddContact']")
    public WebElement addContactBtn;

    public EmployeeEmergencyContactsPage() {
        PageFactory.initElements(driver, this);
    }

    public void clickOnAddEmergencyContact(){
        click(addContactBtn);
    }

}
