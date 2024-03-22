package com.facebook.pages;

import com.facebook.driver.DriverManager;
import com.facebook.pages.pagecomponent.FooterMenuComponent;
import com.facebook.pages.pagecomponent.TopMenuComponent;

public class HomePage {

    private TopMenuComponent topMenuComponent;
    private FooterMenuComponent footerMenuComponent;

    public HomePage(){
        topMenuComponent = new TopMenuComponent();
        footerMenuComponent = new FooterMenuComponent();
    }
    public String getHomePageTitle(){
        return DriverManager.getDriver().getTitle();
    }

    public void clickOnProfile(){
        topMenuComponent.clickProfile();
    }

    public String footerText(){
       return footerMenuComponent.getFooterLabel();
    }
}
