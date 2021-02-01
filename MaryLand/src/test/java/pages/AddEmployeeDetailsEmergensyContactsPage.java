package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.commonMethods;

public class AddEmployeeDetailsEmergensyContactsPage extends commonMethods {

    @FindBy (xpath = "//input[@id='emgcontacts_name']")
    public WebElement nameBar;

    @FindBy (xpath = "//input[@id='emgcontacts_relationship']")
    public WebElement relationshipContact;

    @FindBy (xpath = "//input[@id='emgcontacts_homePhone']")
    public WebElement homePhoneContact;

    @FindBy (xpath = "//input[@id='emgcontacts_mobilePhone']")
    public WebElement cellPhoneContact;

    @FindBy (xpath = "//input[@id='emgcontacts_workPhone']")
    public WebElement workPhoneContact;

    @FindBy (xpath = "//input[@id='btnSaveEContact']")
    public WebElement saveBtn;


    public AddEmployeeDetailsEmergensyContactsPage() {
        PageFactory.initElements(driver, this);
    }

    public void setNameBar (String nameBar1){
        sendText(nameBar, nameBar1);
    }
    public void setRelationshipContact (String relationshipContact1){
        sendText(relationshipContact,relationshipContact1);
    }
    public void setHomePhoneContact (String homePhoneContact1){
        sendText(homePhoneContact,homePhoneContact1);
    }
    public void setCellPhoneContact (String cellPhoneContact1){
        sendText(cellPhoneContact,cellPhoneContact1);
    }
    public void setWorkPhoneContact (String workPhoneContact1){
        sendText(workPhoneContact, workPhoneContact1);
    }
    public void clickOnSaveBtn(){
        click(saveBtn);
    }
}


