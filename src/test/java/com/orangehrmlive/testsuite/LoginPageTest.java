package com.orangehrmlive.testsuite;

import com.orangehrmlive.pages.HomePage;
import com.orangehrmlive.pages.LoginPage;
import com.orangehrmlive.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {
    //make obj of the class which we need
    HomePage homepage = new HomePage();
    LoginPage loginPage = new LoginPage();

    @Test
    public void userSholdLoginSuccessfullyWithValidCredentials(){
        loginPage.enterUserName("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLoginButton();
        String exptext = "Dashboard";
        String actText = homepage.getMassage();
        Assert.assertEquals(actText,exptext,"Not varify");

    }




}
