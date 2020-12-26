package com.syntax.class1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class HW {
    /*
    US 17666 Syntax Logo should be present on the login page
    US 17667 Error message "Invalid credentials" should be displayed when user enters invalid credentials
     */
    WebDriver driver;
    @BeforeMethod
    public void openAndNavigate ( ) {
        System.setProperty ( "webdriver.chrome.driver", "drivers/chromedriver.exe" );
        driver = new ChromeDriver( );
        driver.get ( "http://hrmstest.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login" );
        driver.manage ( ).window ( ).maximize ( );
        driver.manage ( ).timeouts ( ).implicitlyWait ( 15, TimeUnit.SECONDS );
    }
    @Test
    public void syntaxLogo ( ) {
        WebElement syntaxLogo = driver.findElement ( By.xpath ( "//*[@id=\"divLogo\"]/img" ) );

        if (syntaxLogo.isDisplayed ( )) {
            System.out.println ( "Syntax Logo -> Test Pass");
        } else {
            System.out.println ( "Syntax Logo -> Test Fail" );
        }
    }
    @Test
    public void validAdminLogin ( ) {
        driver.findElement ( By.id ( "txtUsername" ) ).sendKeys ( "username" );
        driver.findElement ( By.id ( "txtPassword" ) ).sendKeys ( "password" );
        driver.findElement ( By.id ( "btnLogin" ) ).click ( );
        WebElement invalidCredentials = driver.findElement ( By.id ( "spanMessage" ) );

        if (!invalidCredentials.isDisplayed ( )) {
            System.out.println ( "Correct credentials. Test NOT Passed" );
        } else {
            System.out.println ( "Invalid credentials. Test Passed" );
        }
    }
    @AfterMethod
    public void closeBrowser ( ) {
        driver.quit ( );
    }
}
