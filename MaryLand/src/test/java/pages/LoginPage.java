package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.commonMethods;

public class LoginPage extends commonMethods {
    @FindBy(id = "txtUsername")
    public WebElement usernameBox;

    @FindBy(xpath = "//input[@id='txtPassword']")
    public WebElement passwordBox;

    @FindBy(css = "input#btnLogin")
    public WebElement loginBtn;



    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    public void login(String username, String password){
        sendText(usernameBox, username);
        sendText(passwordBox, password);
        int moon;

    }

    public void clickOnLoginBtn() {
        click(loginBtn);
    }
}
