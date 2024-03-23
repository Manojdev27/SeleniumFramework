package com.facebook.pages.pagecomponent;

import com.facebook.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import static com.facebook.utils.SeleniumUtils.*;

public class TopMenuComponent {

//    @FindBy(xpath = "/html/body/div[1]/div/div[1]/div/div[2]/div[4]/div/div[1]/div[1]/ul/li[2]/span/div/a")
//    private WebElement LNK_FRIEND;

    public TopMenuComponent(){
        PageFactory.initElements(DriverManager.getDriver(),this);
    }
   private static final By LNK_PROFILE = By.xpath("/html/body/div[1]/div/div[1]/div/div[3]/div/div/div[1]/div[1]/div/div[1]/ul/li/div/a/div[1]/div[2]/div");

    public void clickProfile(String menu){
       click(LNK_PROFILE, menu);
    }

//    public void clickPIMMenu(){
//        SeleniumUtils.click(LNK_FRIEND);
//    }
}
