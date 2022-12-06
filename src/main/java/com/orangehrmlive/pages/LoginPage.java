package com.orangehrmlive.pages;

import com.orangehrmlive.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
//enter all login field//
    By userName = By.name("username");
    By password = By.name("password");
    By loginButton = By.xpath("//button[@type='submit']");




    public void enterUserName (String name){
        sendTextToElement(userName,name);
    }
    public void enterPassword(String password1){
        sendTextToElement(password,password1);
    }
    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }



}
