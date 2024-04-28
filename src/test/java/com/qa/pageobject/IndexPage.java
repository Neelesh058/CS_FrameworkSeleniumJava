package com.qa.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IndexPage {

    WebDriver ldriver;
    public IndexPage(WebDriver rdriver){
        ldriver=rdriver;
        PageFactory.initElements(rdriver,this);
    }

    //identify webelements
    @FindBy(linkText = "Sign in")
    WebElement signIn;

    //identify action on webelement
    public void clickOnSignIn() {
        signIn.click();
    }

}
