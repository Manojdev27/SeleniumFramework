package com.facebook.tests;

import com.facebook.driver.Driver;
import com.facebook.driver.DriverManager;
import com.facebook.pages.LoginPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;



public class PaymentTest extends BaseTest{

    @Test
    public void paymentTest(){
        LoginPage loginPage = new LoginPage();
        loginPage.setTxtBoxUsername("manojkumardev27@gmail.com");
        loginPage.setTxtBoxPassword("Godhand27");
        loginPage.setBtnLogin();
        Assert.assertEquals(DriverManager.getDriver().getTitle(), "(5) Facebook");
        System.out.println("Payment Test");
    }
}
