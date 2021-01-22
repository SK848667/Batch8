package com.syntax.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW {
    /*
Navigate to http://syntaxtechs.com/selenium-practice/index.php
Click on start practicing
click on simple form demo
enter any text on first text box
click on show message
     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://syntaxtechs.com/selenium-practice/index.php");
        driver.findElement(By.xpath("//a[@id='btn_basic_example']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@class='list-group-item']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='user-message']")).sendKeys("Hello World !!!");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[text()='Show Message']")).click();
        Thread.sleep(2000);
        driver.quit();




    }
}
