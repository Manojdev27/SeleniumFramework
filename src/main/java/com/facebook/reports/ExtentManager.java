package com.facebook.reports;

import com.aventstack.extentreports.ExtentTest;

public class ExtentManager {

    private ExtentManager(){}

    private static final ThreadLocal<ExtentTest> threadLocal = new ThreadLocal<>();

   public static ExtentTest getExtentTest(){
        return threadLocal.get();
    }

     static void setExtentTest(ExtentTest extentTest){
        threadLocal.set(extentTest);
    }
}
