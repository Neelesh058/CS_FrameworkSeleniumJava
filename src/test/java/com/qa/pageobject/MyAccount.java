package com.qa.pageobject;

import com.qa.testcases.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;

public class MyAccount {
    WebDriver ldriver;

    public MyAccount(WebDriver rdriver) {

        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(xpath = "//span[text()='Add my first address']")
    WebElement address;

    public void addAddress() {
        address.click();
    }

    @FindBy(id="address1")
    WebElement address1;

    public void enterAddress(String address)
    {
        address1.sendKeys(address);
    }

    @FindBy(id="city")
    WebElement city;

    public void enterCity(String cityName)
    {
        city.sendKeys(cityName);
    }

    @FindBy(id="id_state")
    WebElement state;

    public void selectState(String text)
    {
        Select obj = new Select(state);
        obj.selectByVisibleText(text);
    }

    @FindBy(id="postcode")
    WebElement postcode;
    public void enterPostcode(String postcodeData)
    {
        postcode.sendKeys(postcodeData);
    }

    @FindBy(id="id_country")
    WebElement country;

    public void selectCountry(String text)
    {
        Select obj = new Select(country);
        obj.selectByVisibleText(text);
    }

    @FindBy(id="phone")
    WebElement phone;

    public void enterHomePhone(String ph)
    {
        phone.sendKeys(ph);
    }

    @FindBy(id="phone_mobile")
    WebElement phone_mobile;

    public void enterMobilePhone(String mobile)
    {
        phone_mobile.sendKeys(mobile);
    }

    @FindBy(id="submitAddress")
    WebElement save;

    public void submitAddress()
    {
        save.click();

    }


}
