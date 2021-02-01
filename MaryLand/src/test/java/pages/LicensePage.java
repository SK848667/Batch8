package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.commonMethods;

import java.util.ArrayList;
import java.util.List;


public class LicensePage extends commonMethods {

    @FindBy(xpath = "//input[@id='btnAdd']")
    public WebElement AddBtn;

    @FindBy(id ="license_name")
    public WebElement lecenseTextBar;

    @FindBy(id = "btnSave")
    public WebElement SaveBtn;

    @FindBy (xpath = "//table[@id='recordsListTable']/tbody/tr/td/a")
    public List<WebElement> mytable;

    public LicensePage() {
        PageFactory.initElements(driver, this);
    }

    public List<String> myTableofLicense(){

        List<String> myTextLicense =new ArrayList<>();
        for (WebElement myTableelem: mytable
        ) {
            myTextLicense.add(myTableelem.getText());
        }
        System.out.println(myTextLicense);
        return myTextLicense;
    }


    public void  clickinOnAddbtn(){
        click(AddBtn);
    }


    public void clickSaveBtn(){
        click(SaveBtn);
    }



    public void SendLicense(String myLicense){
        sendText(lecenseTextBar,myLicense);
    }
}


