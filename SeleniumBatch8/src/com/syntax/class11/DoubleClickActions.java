package com.syntax.class11;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickActions {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/test/simple_context_menu.html");

        WebElement dblClickButton = driver.findElement(By.xpath("//button[@ondblclick = 'myFunction()']"));
        Actions action = new Actions(driver);
        action.doubleClick(dblClickButton).perform();

        //ACCEPT JAVASCRIPT/BROWSER ALERTS
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
}

