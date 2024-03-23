package com.facebook.pages;

import com.facebook.reports.ExtentLogger;
import org.openqa.selenium.By;

import static com.facebook.utils.SeleniumUtils.*;

public class LoginPage {
    private static final By TXTBOX_USERNAME = By.xpath("//*[@id=\"email\"]");
    private static final By TXTBOX_PASSWORD = By.name("pass");
    private static final By BTN_LOGIN = By.xpath("//button[text()='Log in']");

    public LoginPage setUsername(String username){
        sendKeys(TXTBOX_USERNAME,username,"Username");
        ExtentLogger.pass("Username is entered successfully");
        return this;
    }
    public LoginPage setPassword(String password){
        sendKeys(TXTBOX_PASSWORD,password,"Password");
        ExtentLogger.pass("Password is entered successfully");
        return this;
    }
    public HomePage setLogin(){
       click(BTN_LOGIN, "Login Button");
       ExtentLogger.info("Login is clicked successfully");
        return new HomePage();
    }

    public HomePage loginToApplication(String username, String password){
        return setUsername(username).setPassword(password)
                .setLogin();
    }
}
