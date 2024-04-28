package com.qa.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountCreation {

    WebDriver ldriver;

    public AccountCreation(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
    }


    @FindBy(id = "uniform-id_gender1")
    WebElement titleMr;

    public void selectTitleMr() {
        titleMr.click();
        System.out.println(titleMr.isSelected());
    }

    @FindBy(id="customer_firstname")
    WebElement customerfirstName;

    public void customerFirstName(String fname){
        customerfirstName.sendKeys(fname);
    }
    @FindBy(id="customer_lastname")
    WebElement customerlastName;

    public void customerlastName(String lname){
        customerlastName.sendKeys(lname);
    }


    @FindBy(id="passwd")
    WebElement password;

    public void passWord(String pwd){
        password.sendKeys(pwd);
    }

    @FindBy(id="submitAccount")
    WebElement submit;

    public void submitAcc(){
        submit.click();


    }


}
