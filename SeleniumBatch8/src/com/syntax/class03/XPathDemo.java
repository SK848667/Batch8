package com.syntax.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathDemo {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        driver.findElement(By.xpath("//input[contains(@id,'username')]")).sendKeys("Tester");
        driver.findElement(By.xpath("//input[contains(@name,'pass')]")).sendKeys("test");
        driver.findElement(By.xpath("//input[contains(@type,'sub')]")).click();

        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@id='ctl00_logout']")).click();

        Thread.sleep(2000);
        driver.quit();
    }

}
