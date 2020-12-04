package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
    /*Navigate to http://syntaxtechs.com/selenium-practice/index.php
    Click on start practicing
    click on simple form demo
    enter any text on first text box
    click on show message
     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://syntaxtechs.com/selenium-practice/index.php");
        driver.findElement(By.cssSelector("a[id = 'btn_basic_example']")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("a[class *= 'ite']")).click();
        driver.findElement(By.cssSelector("input[placeholder ^= 'Please']")).sendKeys("Hello");
        driver.findElement(By.cssSelector("button[onclick = 'showInput();']")).click();
        driver.findElement(By.cssSelector("input#sum1")).sendKeys("89");
        driver.findElement(By.cssSelector("input#sum2")).sendKeys("67");
        driver.findElement(By.cssSelector("button[onclick = 'return total()']")).click();
        Thread.sleep(2000);
        driver.quit();

    }
}
