package com.qa.testcases;

import com.qa.pageobject.AccountCreation;
import com.qa.pageobject.IndexPage;
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
    mp.enterCreateEmailAddress("neeleshpal11@gmail.com");
    mp.clickSubmitCreate();

    AccountCreation ac=new AccountCreation(driver);
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    ac.selectTitleMr();
//    ac.customerFirstName("Neelesh");
//    ac.customerlastName("kumar");
//    ac.passWord("Chalodelhi@12");

}

}
