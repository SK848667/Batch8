package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.commonMethods;

import java.util.List;

public class PersonalDetailsPage extends commonMethods {
    @FindBy(linkText = "Dependents")
    public WebElement dependent;
    @FindBy(id = "btnAddDependent")
    public WebElement addDependantsButton;
    @FindBy(id = "dependent_name")
    public WebElement dependantName;
    @FindBy(id = "dependent_relationshipType")
    public WebElement relationshipDD;
    @FindBy(id = "dependent_dateOfBirth")
    public WebElement dateOfBirth;
    @FindBy(id = "btnSaveDependent")
    public WebElement saveDependent;

    //Masuma
    @FindBy(xpath = "//a[text()='Contact Details']")
    public WebElement ContactDetails;
    @FindBy(xpath = "//input[@id='btnSave']")
    public WebElement editBtn_SaveBtn;
    @FindBy(xpath = "//input[@id='contact_street1']")
    public WebElement addressStreet1;
    @FindBy(xpath = "//input[@id='contact_street2']")
    public WebElement addressStreet2;
    @FindBy(xpath = "//input[@id='contact_city']")
    public WebElement city;
    @FindBy(xpath = "//select[@id = 'contact_state']")
    public WebElement state;
    @FindBy(xpath = "//input[@id='contact_emp_zipcode']")
    public WebElement zipCode;
    @FindBy(xpath = "//select[@id = 'contact_country']")
    public WebElement country;
    @FindBy(xpath = "//input[@id='contact_emp_hm_telephone']")
    public WebElement homePhone;
    @FindBy(xpath = "//input[@id='contact_emp_mobile']")
    public WebElement mobile;
    @FindBy(xpath = "//input[@id='contact_emp_work_telephone']")
    public WebElement workPhone;
    @FindBy(xpath = "//input[@id='contact_emp_work_email']")
    public WebElement workEmail;
    @FindBy(xpath = "//input[@id='contact_emp_work_email']")
    public WebElement confirmationEmail;

//Khaliqyar
    @FindBy(xpath = "//a[text()='Qualifications']")
    public WebElement qualification;

    @FindBy(xpath = "(//table[@id='dependent_list']/tbody/tr/td/a)[1]")
    public WebElement VerifyAddedDependents;

    public void clickOnSaveDependent() {
        click(saveDependent);
    }
    public void clickOnDependent() {
        click(dependent);
    }
    public void clickOnDependentsAddButton() {
        click(addDependantsButton);
    }
    public void dependantName(String name) {
        sendText(dependantName, name);
    }
    public void clickOnDateOfBirth(String string) {
        click(dateOfBirth);
        sendText(dateOfBirth, string);
    }
    public void clickONsave_editBtn(){
        click(editBtn_SaveBtn);
    }
    public void setAddressStreet1 (String addressStreet11){
        sendText(addressStreet1,addressStreet11);
    }
    public void setAddressStreet2 (String addressStreet22){
        sendText(addressStreet2,addressStreet22);
    }
    public void setCity(String city1){
        sendText(city,city1);
    }
    public void SetState(String state1){
        selectDDValue(state,state1);
    }
    public void setZipCode(String zipCode1){
        sendText(zipCode,zipCode1);
    }
    public void SetCountry(String country1){
        selectDDValue(country,country1);
    }
    public void setHomePhone(String homePhone1){
        sendText(homePhone,homePhone1);
    }
    public void setMobile(String mobile1){
        sendText(mobile,mobile1);
    }
    public void setWorkPhone(String workPhone1){
        sendText(workPhone,workPhone1);
    }
    public void setWorkEmail(String workEmail1){
        sendText(workEmail,workEmail1);
    }
    public void clickOnContactDetails(){
        click(ContactDetails);
    }
    public String verifiedAddedDependentsEmployee () {
        return VerifyAddedDependents.getText();
    }
    public String getWorkedEmail(){
        String email;
        email=confirmationEmail.getAttribute("value");
        return email;
    }


    public PersonalDetailsPage() {
        PageFactory.initElements(driver, this);
    }
}
