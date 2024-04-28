package com.qa.testcases;

import com.qa.pageobject.IndexPage;
import com.qa.pageobject.myAccountPage;
import org.testng.annotations.*;

import java.io.IOException;


public class TC_MyAccountPageTest extends BaseClass {
    public TC_MyAccountPageTest() throws IOException {
    }

    @Test

public void verifyRegistrationandLogin(){

driver.get(url);

logger.info("url opened");

    IndexPage ip=new IndexPage(driver);
    ip.clickOnSignIn();

    myAccountPage mp=new myAccountPage(driver);
    mp.enterCreateEmailAddress("neeleshpal11@gmail.com");
    mp.clickSubmitCreate();
}

}
