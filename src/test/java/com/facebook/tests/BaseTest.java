package com.facebook.tests;


import com.facebook.driver.Driver;
import com.facebook.reports.ExtentReport;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.lang.reflect.Method;

public class BaseTest {

    @BeforeMethod
    public void setUp(){
        Driver.initDriver();
    }

    @AfterMethod
    public void tearDown(){

        Driver.quitDriver();
    }
}
