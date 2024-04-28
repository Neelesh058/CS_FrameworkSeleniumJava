package com.qa.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class myAccountPage {
    //1. create object of webdriver
    WebDriver ldriver;

    //pwd---Chalodelhi@123

    //constructor
    public myAccountPage(WebDriver rdriver)
    {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(id="email_create")
    WebElement createEmailId;

    @FindBy(id="SubmitCreate")
    WebElement SubmitCreate;

    public void enterCreateEmailAddress(String email){

        createEmailId.sendKeys(email);
    }

    public void clickSubmitCreate()
    {
        SubmitCreate.click();
    }
}
