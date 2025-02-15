package com.syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ImplicitWaitDemo {

    public static String url = "http://syntaxtechs.com/selenium-practice/index.php";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to(url);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); // managing timeouts and setting implicit wait for 20 seconds
        WebElement startPracticingButton = driver.findElement(By.id("btn_basic_example"));
        startPracticingButton.click();

    }
}
