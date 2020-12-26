package com.syntax.class1;

import org.testng.annotations.*;
/*
Task 1: Executing different test based TestNG annotations
Create class that will have:
Before and After Class annotation
Before and After Method annotation
2 methods with Test annotation
 */
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