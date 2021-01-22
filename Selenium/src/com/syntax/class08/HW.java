package com.syntax.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HW {
    /*
go to https://the-internet.herokuapp.com/dynamic_controls
click on checkbox and click on remove
verify the text
click on enable verify the textbox is enabled
enter text and click disable
verify the textbox is disabled
Build functions for opening and closing browser
     */

    public static String url = "https://the-internet.herokuapp.com/dynamic_controls";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to(url);
        WebElement chech= driver.findElement(By.xpath("//input [@type='checkbox']"));
        chech.click();
        //
        WebElement removeButton = driver.findElement(By.xpath("//button[contains(text(),'Remove')]"));
        removeButton.click();
        //
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='message']")));
        String text=driver.findElement(By.xpath("//p[@id='message']")).getText();
        System.out.println(text);
        //
        WebElement enableButton = driver.findElement(By.xpath("//button[contains(text(),'Enable')]"));
        enableButton.click();
        //
        WebDriverWait wait2 = new WebDriverWait(driver, 20);
        wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='message']")));
        WebElement inpute = driver.findElement(By.xpath("//input[@type='text']"));
        inpute.click();
        //
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hello World!!!");
        //
        WebElement disableButton = driver.findElement(By.xpath("//button[contains(text(),'Disable')]"));
        disableButton.click();
        //
        WebDriverWait wait3 = new WebDriverWait(driver, 20);
        wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='message']")));
        String text2=driver.findElement(By.xpath("//p[@id='message']")).getText();
        System.out.println(text2);

        driver.quit();


    }
}
