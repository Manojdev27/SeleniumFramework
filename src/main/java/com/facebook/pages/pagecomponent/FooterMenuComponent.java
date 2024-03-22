package com.facebook.pages.pagecomponent;

import com.facebook.driver.DriverManager;
import org.openqa.selenium.By;

public class FooterMenuComponent {

    By labelFooterMessage = By.xpath("/html/body/div[1]/div/div[1]/div/div[3]/div/div/div[1]/div[1]/div/div[2]/footer/span/ul/li[2]");

    public String getFooterLabel(){
        return DriverManager.getDriver().findElement(labelFooterMessage).getText();
    }
}
