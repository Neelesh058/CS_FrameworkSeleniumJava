package com.qa.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class RegisteredUserAccount {

    WebDriver ldriver;

    public RegisteredUserAccount(WebDriver rdriver) {

        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
    }


}
