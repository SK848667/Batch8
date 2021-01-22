package com.syntax.class3;



import java.io.File;
        import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
        import org.openqa.selenium.By;
        import org.openqa.selenium.JavascriptExecutor;
        import org.openqa.selenium.OutputType;
        import org.openqa.selenium.TakesScreenshot;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.chrome.ChromeDriver;
        import org.openqa.selenium.support.ui.ExpectedConditions;
        import org.openqa.selenium.support.ui.WebDriverWait;
        import org.testng.Assert;
        import org.testng.annotations.AfterMethod;
        import org.testng.annotations.BeforeMethod;
        import org.testng.annotations.DataProvider;
        import org.testng.annotations.Test;

public class ClassTask1 {

    public static WebDriver driver;
    public String usernameAdmin = "Admin";
    public String passwordAdmin = "Hum@nhrm123";


    @BeforeMethod(alwaysRun = true)
    public void openBrowser() {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @AfterMethod(alwaysRun = true)
    public void closeBrowser() {
        driver.quit();
    }

    @Test(dataProvider = "getData")
    public void addEmployee(String firstName, String lastName, String userName, String password, String screenshot)
            throws InterruptedException {
        driver.findElement(By.xpath("(//span[@class='form-hint']/preceding-sibling::input)[1]")).sendKeys(usernameAdmin);
        driver.findElement(By.xpath("(//span[@class='form-hint']/preceding-sibling::input)[2]"))
                .sendKeys(passwordAdmin);
        driver.findElement(By.xpath("//input[@name='Submit']")).click();

        WebElement pimLink = driver.findElement(By.id("menu_pim_viewPimModule"));
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].click();", pimLink);

        WebElement addEmpLnk = driver.findElement(By.id("menu_pim_addEmployee"));
        js.executeScript("arguments[0].click();", addEmpLnk);

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input#firstName")));

        driver.findElement(By.cssSelector("input#firstName")).sendKeys(firstName);
        driver.findElement(By.id("lastName")).sendKeys(lastName);
        driver.findElement(By.id("chkLogin")).click();
        driver.findElement(By.id("user_name")).sendKeys(userName);
        driver.findElement(By.id("user_password")).sendKeys(password);
        driver.findElement(By.id("re_password")).sendKeys(password);
        driver.findElement(By.xpath("//input[@value='Save']")).click();
        Thread.sleep(2000);

        String fullName = driver.findElement(By.xpath("//div[@id = 'profile-pic']/h1")).getText();
        Assert.assertEquals(fullName, firstName + " " + lastName);

        TakesScreenshot ts = (TakesScreenshot) driver;
        File sourceFile = ts.getScreenshotAs(OutputType.FILE);

        try {
            FileUtils.copyFile(sourceFile, new File(screenshot));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @DataProvider
    public Object[] getData() {

        String[][] data = {
                { "Mike", "virginia", "MikeV", "Syntax123!", "screenshots/HRMS/NewEmployee1.png" },
                { "Sabeen", "Bethel", "SabeenB", "Syntax123!", "screenshots/HRMS/NewEmployee2.png" },
                { "Ali", "Kursun", "AliKur", "Syntax123!!", "screenshots/HRMS/NewEmployee3.png" },
                { "Maria", "Skirich", "MariaS", "Syntax123!", "screenshots/HRMS/NewEmployee4.png" },
                { "Jack", "Plantin", "JackP", "Syntax123!", "screenshots/HRMS/NewEmployee5.png" } };
        return data;
    }
}