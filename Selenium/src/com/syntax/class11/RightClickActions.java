package com.syntax.class11;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickActions {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/test/simple_context_menu.html");

        WebElement rightClickButton = driver.findElement(By.xpath("//span[text() = 'right click me']"));
        Actions action = new Actions(driver);
        action.contextClick(rightClickButton).perform();
//after right click locate and click on Edit button
        WebElement editOption = driver.findElement(By.xpath("//span[text() = 'Edit']"));
        action.click(editOption).perform();

//ACCEPT JAVASCRIPT/BROWSER ALERTS
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
}
