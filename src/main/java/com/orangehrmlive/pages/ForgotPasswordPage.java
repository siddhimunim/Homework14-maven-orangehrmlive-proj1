package com.orangehrmlive.pages;

import com.orangehrmlive.utility.Utility;
import org.openqa.selenium.By;

public class ForgotPasswordPage extends Utility {
    By forgotPasswordLink =By.xpath("//div[@class='orangehrm-login-forgot']") ;
    By verifyResetPassword = By.xpath("//div[@class='orangehrm-card-container']/form/h6");
    public void clickOnForgotButton(){
        clickOnElement(forgotPasswordLink);
    }
    public String verifyMassage(){
        return getTextFromElement(verifyResetPassword);
    }
}
