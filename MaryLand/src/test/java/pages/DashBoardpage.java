package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.commonMethods;


public class DashBoardpage extends commonMethods {

    @FindBy(xpath = "//b[text()='Admin']")
    public WebElement AdminBtn;
    @FindBy(xpath = "//a[@id='menu_admin_viewSkills']")
    public WebElement skillsBtn;

    @FindBy(xpath = "//a[@id='menu_admin_viewLicenses']")
    public WebElement licenseBtn;

    @FindBy(xpath = "//a[@id='menu_admin_Qualifications']")
    public WebElement QulificationBtn;
    @FindBy(xpath = "//a[@id='menu_pim_viewPimModule']")
    public WebElement PIMBtn;

    public DashBoardpage() {
        PageFactory.initElements(driver, this);
    }
    public void clickOnAdminbtn() {
        click(AdminBtn);
    }


    public void clickOnPIMBtn(){
        click(PIMBtn);
    }

    public void clickonlicensebtn(){
        click(licenseBtn);
    }


    public void movetoQu() throws InterruptedException {
        Actions action = new Actions(driver);
        action.moveToElement(QulificationBtn).perform();
        Thread.sleep(2000);
        action.moveToElement(skillsBtn).perform();
        action.click().perform();

    }
        public void movetoQuLicense() throws InterruptedException {
            Actions action = new Actions(driver);
            action.moveToElement(QulificationBtn).perform();
            Thread.sleep(2000);
            action.moveToElement(licenseBtn).perform();
            action.click().perform();

    }
}
