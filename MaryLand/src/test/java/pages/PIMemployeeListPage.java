package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.commonMethods;

import java.util.List;

public class PIMemployeeListPage extends commonMethods {

    @FindBy(xpath = "//a[text()='Emergency Contacts']")
    public WebElement EmergencyContacts;

    @FindBy(xpath = "//input[@id='empsearch_id']")
    public WebElement EmployeeIDSearch;

    @FindBy(xpath = "//input[@id='searchBtn']")
    public WebElement searchBtn;

    @FindBy(xpath = "(//table [@id = 'resultTable']/tbody/tr/td /a)[1]")
    public WebElement empIdClick;




    public PIMemployeeListPage() {
        PageFactory.initElements(driver, this);
    }
    public void AddEmergencyContact (){
        click(EmergencyContacts);
    }
    public void setEmployeeIDSearch(String employeeIDSearch1){
        sendText(EmployeeIDSearch,employeeIDSearch1);
    }
    public void clickOnSearchBtn(){
        click(searchBtn);
    }
    public void clickOnAddedEmployeeID(){
    click(empIdClick);
    }

}


