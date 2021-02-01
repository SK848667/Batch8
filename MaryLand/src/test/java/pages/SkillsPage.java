package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.commonMethods;

import java.util.ArrayList;
import java.util.List;

public class SkillsPage extends commonMethods {

    @FindBy(xpath = "//input[@id='btnAdd']")
    public WebElement AddBtn;

    @FindBy(id = "skill_name")
    public WebElement skillsTextBar;

    @FindBy(id = "btnSave")
    public WebElement SaveBtn;

    @FindBy(xpath = "//table[@id='recordsListTable']/tbody/tr/td/a")
    public List<WebElement> mytable;

    public SkillsPage() {
        PageFactory.initElements(driver, this);
    }

    public List<String> myTableofSkills() {

        List<String> myTextSkills = new ArrayList<>();
        for (WebElement myTableelem : mytable
        ) {
            myTextSkills.add(myTableelem.getText());
        }
        System.out.println(myTextSkills);
        return myTextSkills;
    }

    public void clickinOnAddbtn() {
        click(AddBtn);
    }

    public void clickSaveBtn() {
        click(SaveBtn);
    }

    public void SendLicense(String mySkills) {
        sendText(skillsTextBar, mySkills);
    }
}
