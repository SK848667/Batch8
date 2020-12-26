package com.syntax.class2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependOnDemo {

    @Test(priority = 1)
    public void login() {
        System.out.println("i am login in");
        Assert.assertTrue(false);
    }

    @Test(dependsOnMethods = "login" ) //if login fails, this test method will get ignored
    public void addEmployee() {
        System.out.println("i am adding Employee");
    }

    @Test()
    public void test3() {
        System.out.println("i am Test 3");
    }

}
