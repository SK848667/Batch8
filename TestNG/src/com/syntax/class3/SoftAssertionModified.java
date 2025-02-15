package com.syntax.class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class SoftAssertionModified {

    //As and admin I should be able to login into HRMS
    //logo is displayed
    //user is successfully logged in

    WebDriver driver;

    @BeforeSuite (alwaysRun = true)//before the suite --> based on xml file
    public void beforeSuite(){
        System.out.println("Before suite annotation");
    }

    @AfterSuite(alwaysRun = true) //before the test
    public void afterSuite(){
        System.out.println("After suite annotation");
    }

    @BeforeTest (alwaysRun = true)//before the test --> based on xml file
    public void beforeTest(){
        System.out.println("Before test annotation");
    }

    @AfterTest(alwaysRun = true)
    public void afterTest(){
        System.out.println("After test annotation");
    }

    @BeforeClass(alwaysRun = true)
    public void beforeClass(){
        System.out.println("Before class annotation");
    }

    @AfterClass(alwaysRun = true)
    public void afterClass(){
        System.out.println("After class annotation");
    }

    @BeforeMethod(alwaysRun = true)  //enforce executio of precondition regardless to which group
    public void openAndNavigate() {
        System.out.println("Before method annotation");
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("http://hrmstest.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        //driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @AfterMethod(alwaysRun = true)
    public void closeBrowser() {
        System.out.println("After method annotation");
        driver.quit();
    }

    @Test( groups = "regression")
    public void logoAndValidLogin(){
        //verifying that logo is displayed
        WebElement element = driver.findElement(By.xpath("//div[@id = 'divLogo']//img"));
        //creting an object of soft assertion
        SoftAssert softAsert=new SoftAssert();
        softAsert.assertTrue(element.isDisplayed(),"Logo is not displayed");
        //entering valid credentials to login
        String username="Admin";
        driver.findElement(By.id("txtUsername")).sendKeys(username);
        driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
        driver.findElement(By.id("btnLogin")).click();
        //validating that we ar logged in
        WebElement welcomeMessage = driver.findElement(By.cssSelector("a#welcome"));
        softAsert.assertTrue(welcomeMessage.isDisplayed(), "Welcome message is not displayed");
        softAsert.assertEquals(welcomeMessage.getText(), "Welcome "+username, "Welcome text is not matching");
        System.out.println("End of the test case");
        softAsert.assertAll();
    }

    @Test (groups = {"smoke", "sprint2"})
    public void simpleTest(){
        System.out.println("Hello from simple test");
    }


}