package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class CommonMethods {
    protected static WebDriver driver;

    /**
     * this method will open a browser , set up configuration and navigate to the url
     */

@BeforeMethod(alwaysRun = true)
    public static void setUp() {

        ConfigsReader.readProperties("C:\\Users\\SK\\IntelliJ\\TestNG\\src\\configs\\configuration.properties");

        switch (ConfigsReader.getPropertyValue("browser").toLowerCase()) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
                driver = new ChromeDriver();
                break;
            case "firefox":
                System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
                driver = new FirefoxDriver();
                break;
            default:
                throw new RuntimeException("Invalid Browser");
        }
        driver.get(ConfigsReader.getPropertyValue("url"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    /**
     * this method will close any open browser
     */

    @AfterMethod(alwaysRun = true)
    public static void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

}
