package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElements {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://facebook.com");
        driver.findElement(By.id("email")).sendKeys("systax");
        driver.findElement(By.id("pass")).sendKeys("systax123");
        driver.findElement(By.name("login")).click();
        //need extra time to open new page and then click on forgot password
        Thread.sleep(2000);
        //driver.findElement(By.linkText("Forgot Password?")).click();
        driver.findElement(By.partialLinkText("Forgot")).click();//if text long use partual text
        Thread.sleep(2000);
        driver.quit();

    }
}
