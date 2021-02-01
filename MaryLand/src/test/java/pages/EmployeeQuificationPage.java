package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.commonMethods;

import java.util.List;

public class EmployeeQuificationPage extends commonMethods {

    @FindBy(xpath = "//input[@id='addSkill']")
    public WebElement addSkill;
    @FindBy(xpath = "//select[@id='skill_codel']")
    public List<WebElement> skillList;
    @FindBy(xpath = "//input[@id='btnSkillSave']")
    public WebElement saveBtn;
    @FindBy(xpath = "//p[@id='actionSkill']//following-sibling::table//a")
    public List<WebElement> employeequlificationSkillList;
    @FindBy(xpath = "//select[@id = 'skill_code']")
    public WebElement clickOnList;
    @FindBy(xpath = "//option[@value= '35']")
    public WebElement clickValueFromList;
    @FindBy(xpath = "//*[@id=\"skill_code\"]")
    public WebElement selectAllSkills;

    public EmployeeQuificationPage() {
        PageFactory.initElements(driver, this);
    }

    public void clickOnAddSkill() {
        click(addSkill);

    }
    public void setAddSkill (String addSkills){
        click(clickOnList);
        selectDDValue(selectAllSkills, addSkills);
        }
    public void clickOnSaveBtn(){
        click(saveBtn);
    }


}
