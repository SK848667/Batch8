package com.syntax.class1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginTest {

    WebDriver driver;

    @BeforeMethod
    public void openAndNavigate(){
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver =new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    @Test
    public void validAdminLogin(){
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
        driver.findElement(By.id("btnLogin")).click();
        WebElement welcomeMessage = driver.findElement(By.cssSelector("a#welcome"));

        if (welcomeMessage.isDisplayed()) {
            System.out.println("Test Pass");
        }else{
            System.out.println("Test Fail");
        }
    }

    @Test
    public void titleValidation(){
        String expectedTitle= "Human Management System";
        String actualTitle=driver.getTitle();

        if (expectedTitle.equals(actualTitle)) {
            System.out.println("This is matched.  Valid");
        }else{
            System.out.println("This is not matched. Fail");
        }
    }

    @AfterMethod
    public void closeBrowser(){
        driver.quit();
    }

}
