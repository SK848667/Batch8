package com.syntax.class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

//As an Admin i should be able to logit into HRMS
//logo is displayed
//user is successfully logged in

public class SoftAssertionDemo {
    WebDriver driver;

    @BeforeMethod
    public void openAndNavigate() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("http://hrmstest.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void closeBrowser() {
        driver.quit();
    }

    @Test
    public void logoAndValidLogin() {
        //verifying that logo is displayed
        WebElement element = driver.findElement(By.xpath("//div[@id='divLogo']/img"));
        //creating an object of soft assertion
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(element.isDisplayed(), "Logo is NOT displayed");

        //entering valig credentials to login
        String username = "Admin";
        driver.findElement(By.id("txtUsername")).sendKeys(username);
        driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
        driver.findElement(By.id("btnLogin")).click();

        //Validating that we are logged in
        WebElement welcomeMessage = driver.findElement(By.cssSelector("a#welcome"));
        softAssert.assertTrue(welcomeMessage.isDisplayed(), "Welcome message is not displayed");
        softAssert.assertEquals(welcomeMessage.getText(), "Welcome " + username,"Welcome text in not appear");
        System.out.println("End of the test case");

        softAssert.assertAll();
    }


}


