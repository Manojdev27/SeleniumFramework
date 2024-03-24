package com.facebook.tests;

import com.facebook.annotations.FrameworkAnnotation;
import com.facebook.pages.LoginPage;
import com.facebook.testdata.TestData;
import com.facebook.utils.DataProviderUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PaymentTest extends BaseTest{

    @Test(dataProvider = "getData" , description = "To check something", dataProviderClass = DataProviderUtils.class)
    @FrameworkAnnotation
    public void paymentTest(TestData testData){
        LoginPage loginPage = new LoginPage();
        String actualTitle = loginPage
                .loginToApplication(testData.username, testData.password)
                .getHomePageTitle();
        Assert.assertEquals(actualTitle, testData.expectedTitle);
        System.out.println("Payment Test");
        System.out.println(testData.username + " "+ testData.password+ " "+ testData.expectedTitle);
    }
}
