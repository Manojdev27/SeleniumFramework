package com.facebook.tests;

import com.facebook.annotations.FrameworkAnnotation;
import com.facebook.pages.LoginPage;
import com.facebook.testdata.TestData;
import com.facebook.utils.DataProviderUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest{


//    @DataProvider
//    public static Object[][] getData() {
//        return new Object[][]{
//                {"manojkumardev27@gmail.com","Godhand27", "Facebook"}
//        };
//    }


    @Test(description = "To Check whether the user can login to facebook site and check the homepage title",
    dataProvider = "getData",dataProviderClass = DataProviderUtils.class)
    @FrameworkAnnotation
    public void titleValidationTest(TestData testData){

        LoginPage loginPage = new LoginPage();
//        loginPage.loginToApplication(username,password);
//        HomePage homePage = new HomePage();
//        String actualTitle = homePage.getHomePageTitle();
            String actualTitle = loginPage
                .loginToApplication(testData.username,testData.password)
                .getHomePageTitle();
//        System.out.println(DriverManager.getDriver().getTitle());
        Assert.assertEquals(actualTitle, testData.expectedTitle);
    }
}
