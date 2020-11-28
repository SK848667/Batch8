package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
    public static void main(String[] args) throws InterruptedException {
        /*
navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
fill out the forms
click on register
close the browser
         */
            System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.navigate().to("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
            driver.findElement(By.id("customer.firstName")).sendKeys("firstName");
            driver.findElement(By.name("customer.lastName")).sendKeys("lastName");
            driver.findElement(By.id("customer.address.street")).sendKeys("123 street");
            driver.findElement(By.id("customer.address.city")).sendKeys("city");
            driver.findElement(By.name("customer.address.state")).sendKeys("state");
            driver.findElement(By.id("customer.address.zipCode")).sendKeys("12345");
            driver.findElement(By.name("customer.phoneNumber")).sendKeys("555-123-4567");
            driver.findElement(By.name("customer.ssn")).sendKeys("111223333");
            driver.findElement(By.id("customer.username")).sendKeys("username");
            driver.findElement(By.id("customer.password")).sendKeys("password");
            driver.findElement(By.id("repeatedPassword")).sendKeys("password");
            Thread.sleep(2000);
            driver.findElement(By.className("button")).click();
            Thread.sleep(2000);
            driver.quit();

    }
}
