package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebOrderTask {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
        driver.findElement(By.id("ctl00_MainContent_login_button")).click();
        String actualTitle =driver.getTitle();
        String expectedTitle="Web Orders";
        if(actualTitle.equalsIgnoreCase(expectedTitle)){
            System.out.println("Title is right");
        }else{
            System.out.println("Title is WRONG");
        }
        /*if(title.equalsIgnoreCase("Web Orders")){
            System.out.println("Title is right");
        }else{
            System.out.println("Title is WRONG");
        }*/
        Thread.sleep(1000);
        driver.findElement(By.id("ctl00_logout")).click();
        Thread.sleep(1000);
        driver.quit();
    }
}
