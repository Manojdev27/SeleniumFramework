package com.facebook.tests;


import com.facebook.driver.DriverManager;
import com.facebook.pages.LoginPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class HomePageTest extends BaseTest{


    @DataProvider
    public static Object[][] getData() {
        return new Object[][]{
                {"manojkumardev27@gmail.com","Godhand27"}
        };
    }

    @Test(description = "To Check whether the user can login to facebook site and check the homepage title",
    dataProvider = "getData")
    public void titleValidationTest(String username, String password) throws InterruptedException {
        LoginPage loginPage = new LoginPage();
        loginPage.setTxtBoxUsername(username);
        loginPage.setTxtBoxPassword(password);
        loginPage.setBtnLogin();
        System.out.println(DriverManager.getDriver().getTitle());
        Assert.assertEquals(DriverManager.getDriver().getTitle(), "(5) Facebook");
    }
}
