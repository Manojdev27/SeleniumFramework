package com.facebook.pages;

import com.facebook.driver.DriverManager;
import org.openqa.selenium.By;

public class LoginPage {
    By txtBoxUsername = By.xpath("//*[@id=\"email\"]");
    By txtBoxPassword = By.name("pass");
    By btnLogin = By.xpath("//button[text()='Log in']");

    public void setTxtBoxUsername(String username){
        DriverManager.getDriver().findElement(txtBoxUsername).sendKeys(username);
    }
    public void setTxtBoxPassword(String password){
        DriverManager.getDriver().findElement(txtBoxPassword).sendKeys(password);
    }
    public void setBtnLogin(){
        DriverManager.getDriver().findElement(btnLogin).click();
    }

}
