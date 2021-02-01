package pages;

import org.omg.PortableServer.LIFESPAN_POLICY_ID;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.commonMethods;

import java.util.List;

public class PIMpage  extends commonMethods {
    @FindBy(xpath = "//a[@id='menu_pim_viewEmployeeList']")
    public WebElement ViewEmployeeList;

    @FindBy(xpath = "//table[@id='resultTable']/tbody/tr/td/a")
    public List<WebElement> tablePIMpage;

    @FindBy(xpath = "//input[@id='empsearch_id']")
    public WebElement EmployeeSearchID;

    @FindBy(xpath = "//input[@id='searchBtn']")
    public WebElement searchBtn;
    @FindBy(xpath = "//a[@id='menu_pim_viewPimModule']")
    public WebElement PIMBtn;
    @FindBy(xpath = "(//table[@id='resultTable']/tbody/tr/td/a)[1]")
    public WebElement Adele;

    public PIMpage() {
        PageFactory.initElements(driver, this);
    }

   public void clickPIMBtn(){
       click(PIMBtn);
    }
    public void clickAdele(){
        click(Adele);
    }

}
