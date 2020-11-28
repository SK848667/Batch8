package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2 {

/*
navigate to fb.com
click on create new account
fill up all the textboxes
click on sign up button
close the pop up
close the browser
 */

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com");
        //driver.findElement(By.partialLinkText("Create New account")).click();
        driver.findElement(By.id("u_0_2")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys("firstname");
        driver.findElement(By.name("lastname")).sendKeys("lastname");
        driver.findElement(By.name("reg_email__")).sendKeys("email@email.com");
        driver.findElement (By.name ( "reg_email_confirmation__" ) ).sendKeys ("email@email.com");
        driver.findElement(By.id("password_step_input")).sendKeys("password");
        driver.findElement (By.id ("u_1_s") ).click ();
        Thread.sleep (2000 );
        driver.findElement ( By.id ( "u_1_9" ) ).click ();
        Thread.sleep (2000 );
        driver.quit();

    }
}
