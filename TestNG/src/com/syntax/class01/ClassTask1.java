package com.syntax.class01;

import org.testng.annotations.*;

public class ClassTask1 {
    @BeforeClass
    public void classEnterence() {
        System.out.println("Enter inside class");
    }
    @AfterClass
    public void classQuit() {
        System.out.println("Quit the class");
    }
    @BeforeMethod
    public void methodEnterence() {
        System.out.println("Enter inside the method @Test");
    }
    @AfterMethod
    public void meyhodQuit() {
        System.out.println("Quit the method @Test");
    }
    @Test
    public void testMethod1() {
        System.out.println("Calling the first test");
    }
    @Test
    public void testMethod2() {
        System.out.println("Calling the second test");
    }
}