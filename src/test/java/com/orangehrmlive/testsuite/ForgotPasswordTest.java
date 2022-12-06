package com.orangehrmlive.testsuite;

import com.orangehrmlive.pages.ForgotPasswordPage;
import com.orangehrmlive.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ForgotPasswordTest extends BaseTest {
     ForgotPasswordPage forgotPasswordPage = new ForgotPasswordPage();
    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully(){
        forgotPasswordPage.clickOnForgotButton();
        String expText = "Reset Password";
        String actText = forgotPasswordPage.verifyMassage();
        Assert.assertEquals(actText,expText,"varify massage");


    }
}
