package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver" , "C:\\Users\\SK\\IntelliJ\\SeleniumBatch8\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.navigate().to("http://facebook.com");
        driver.navigate().back();
        Thread.sleep(1000);//1000 mean 1 second
        driver.navigate().forward();
        Thread.sleep(1000);
        driver.navigate().refresh();
        //driver.close();
        driver.quit();

    }
}
