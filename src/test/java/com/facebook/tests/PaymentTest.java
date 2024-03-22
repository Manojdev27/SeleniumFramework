package com.facebook.tests;

import com.facebook.driver.DriverManager;
import com.facebook.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;



public class PaymentTest extends BaseTest{

    @Test
    public void paymentTest(){
        LoginPage loginPage = new LoginPage();
        loginPage.loginToApplication("manojkumardev27@gmail.com", "Godhand27");
        Assert.assertEquals(DriverManager.getDriver().getTitle(), "(5) Facebook");
        System.out.println("Payment Test");
    }
}
