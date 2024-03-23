package com.facebook.tests;


import com.facebook.driver.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

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
