package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.commonMethods;

import java.util.ArrayList;
import java.util.List;

public class ConfirmationEmployeeEmergencyContactPage  extends commonMethods {

    @FindBy (xpath = "//table[@id='emgcontact_list']/tbody/tr/td/a")
    public List<WebElement> EmergencyContactList;


    public ConfirmationEmployeeEmergencyContactPage() {
        PageFactory.initElements(driver, this);
    }

    public List<String> getEmergencyContactList (){
        List <String> emergencyContactName = new ArrayList<>();
        for (WebElement emenName:EmergencyContactList) {
            emergencyContactName.add(emenName.getText());
        }
        return emergencyContactName;

    }
}
