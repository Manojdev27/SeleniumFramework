package com.facebook.tests;


import com.facebook.pages.HomePage;
import com.facebook.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest{


    @DataProvider
    public static Object[][] getData() {
        return new Object[][]{
                {"manojkumardev27@gmail.com","Godhand27", "(6) Facebook"}
        };
    }

    @Test(description = "To Check whether the user can login to facebook site and check the homepage title",
    dataProvider = "getData")
    public void titleValidationTest(String username, String password, String expectedTitle){
        LoginPage loginPage = new LoginPage();
//        loginPage.loginToApplication(username,password);
//        HomePage homePage = new HomePage();
//        String actualTitle = homePage.getHomePageTitle();
        String actualTitle = loginPage.loginToApplication(username,password).getHomePageTitle();
//        System.out.println(DriverManager.getDriver().getTitle());
        Assert.assertEquals(actualTitle, expectedTitle);
    }
}
