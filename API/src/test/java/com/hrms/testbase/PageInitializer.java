package com.hrms.testbase;


import com.hrms.utils.apiCommonMethods;

public class PageInitializer {


    public static apiCommonMethods apiMethods;

    public static void initializePageObjects() {

        apiMethods=new apiCommonMethods();
    }
}