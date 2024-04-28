package com.qa.testcases;

import com.qa.pageobject.AccountCreation;
import com.qa.pageobject.IndexPage;
import com.qa.pageobject.MyAccount;
import com.qa.pageobject.myAccountPage;
import org.testng.annotations.*;

import java.io.IOException;
import java.util.concurrent.TimeUnit;


public class TC_MyAccountPageTest extends BaseClass {
    public TC_MyAccountPageTest() throws IOException {
    }

    @Test

public void verifyRegistrationandLogin() throws InterruptedException {

driver.get(url);

logger.info("url opened");

    IndexPage ip=new IndexPage(driver);
    ip.clickOnSignIn();

    myAccountPage mp=new myAccountPage(driver);
    mp.enterCreateEmailAddress("neeleshpal16@gmail.com");
    mp.clickSubmitCreate();

    AccountCreation ac=new AccountCreation(driver);
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    ac.selectTitleMr();
    ac.customerFirstName("Neelesh");
    ac.customerlastName("kumar");
    ac.passWord("Chalodelhi@12");
    ac.submitAcc();
    Thread.sleep(2000);


        MyAccount ma=new MyAccount(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        ma.addAddress();
        ma.enterAddress("Newyork");
        ma.enterCity("Texas");
        ma.selectState("Texas");
        ma.enterPostcode("12541");
        ma.selectCountry("United States");
        ma.enterHomePhone("12345678");
        ma.enterMobilePhone("12365455");
        ma.submitAddress();


}

}
