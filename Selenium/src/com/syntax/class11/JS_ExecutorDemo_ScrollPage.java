package com.syntax.class11;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JS_ExecutorDemo_ScrollPage {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://amazon.com/");
    //scroll down on 5 pixels
        JavascriptExecutor js =(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0, 500)");
        Thread.sleep(2000);
    //scroll up on 5 pixels
        js.executeScript("window.scrollBy(0, -500)");


    //scroll to specific element
        Thread.sleep(3000);
        WebElement backToTop = driver.findElement(By.xpath("//span[text() = 'Back to top']"));
        js.executeScript("arguments[0].scrollIntoView(true)", backToTop);
    }
}
