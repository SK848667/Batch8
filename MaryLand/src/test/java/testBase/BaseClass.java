package testBase;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import utils.configsReader;
import utils.constants;


import java.util.concurrent.TimeUnit;

public class BaseClass {



    public static WebDriver driver;



    public static void setUp() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");


        //driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(constants.IMPLICIT_WAIT, TimeUnit.SECONDS);
        PageInitializer.initializePageObjects();
//        configsReader.readProperties(constants.CONFIGURATION_FILEPATH);
//        switch (configsReader.getPropertyValue("browser").toLowerCase()) {
//            case "chrome":
//                WebDriverManager.chromedriver().setup();
//                driver = new ChromeDriver();
//                break;
//            case "firefox":
//                WebDriverManager.firefoxdriver().setup();
//                driver = new FirefoxDriver();
//                break;
//            default:
//                throw new RuntimeException("Invalid browser");
//        }
//        driver.get(configsReader.getPropertyValue("url"));
//        //driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(constants.IMPLICIT_WAIT, TimeUnit.SECONDS);
//        PageInitializer.initializePageObjects();

    }
    public static void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    public static void main(String[] args) {
        setUp();
    }
}
