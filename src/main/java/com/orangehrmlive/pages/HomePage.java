package com.orangehrmlive.pages;

import com.orangehrmlive.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    //store locators and get massage

    By dashBoard = By.xpath("//header/div[1]/div[1]/span[1]/h6[1]");
    public String getMassage(){
        return getTextFromElement(dashBoard);
    }


}
