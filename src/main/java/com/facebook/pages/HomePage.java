package com.facebook.pages;

import com.facebook.driver.DriverManager;
import com.facebook.pages.pagecomponent.FooterMenuComponent;
import com.facebook.pages.pagecomponent.TopMenuComponent;

public class HomePage {

    private final TopMenuComponent topMenuComponent;
    private final FooterMenuComponent footerMenuComponent;

    public HomePage(){
        topMenuComponent = new TopMenuComponent();
        footerMenuComponent = new FooterMenuComponent();
    }
    public String getHomePageTitle(){
        return DriverManager.getDriver().getTitle();
    }

    public void clickOnProfile(){
        topMenuComponent.clickProfile("value");
    }

    public String footerText(){
       return footerMenuComponent.getFooterLabel();
    }
}
