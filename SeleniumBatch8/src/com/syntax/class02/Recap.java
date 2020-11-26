package com.syntax.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.sound.midi.Soundbank;

public class Recap {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://facebook.com");
        driver.manage().window().maximize();//open WEBPAGE in maximize screen
        //driver.manage().window().fullscreen();//open WEBPAGE in full screen(will disable close button
        String title =driver.getTitle();
        if(title.equalsIgnoreCase("Facebook - Log In or Sign Up")){
            System.out.println("Title is right");
        }else{
            System.out.println("Title is WRONG");
        }
    }
}
