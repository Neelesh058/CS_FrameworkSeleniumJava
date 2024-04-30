package com.qa.testcases;

import com.qa.pageobject.*;
import org.testng.Assert;
import org.testng.annotations.*;

import java.io.IOException;
import java.util.concurrent.TimeUnit;


public class TC_MyAccountPageTest extends BaseClass {
    public TC_MyAccountPageTest() throws IOException {
    }

    @Test(enabled = false)

public void verifyRegistrationandLogin() throws InterruptedException {



        IndexPage ip = new IndexPage(driver);
        ip.clickOnSignIn();

        myAccountPage mp = new myAccountPage(driver);
        mp.enterCreateEmailAddress("neeleshpal04@gmail.com");
        mp.clickSubmitCreate();

        AccountCreation ac = new AccountCreation(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        ac.selectTitleMr();
        ac.customerFirstName("Neelesh");
        ac.customerlastName("kumar");
        ac.passWord("Chalodelhi@12");
        ac.submitAcc();
        Thread.sleep(2000);


        MyAccount ma = new MyAccount(driver);
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

        RegisteredUserAccount rua = new RegisteredUserAccount(driver);
        String title = driver.getTitle();
        Assert.assertEquals(title, "Addresses - My Shop");


}
@Test
public void verifyLogin() throws IOException {


                logger.info("***************TestCase Verify Login starts*****************");

                IndexPage ip = new IndexPage(driver);
                ip.clickOnSignIn();
                logger.info("Clicked on sign in link");

                myAccountPage myAcpg = new myAccountPage(driver);
                myAcpg.enterEmailAddress("cs923@gmail.com");
                logger.info("Entered email address");

                myAcpg.enterPassword("cs923");
                logger.info("Entered password");

                myAcpg.clickSignIn();
                logger.info("Clicked on sign in link..");


        RegisteredUserAccount regUser = new RegisteredUserAccount(driver);
                String userName = regUser.getUserName();


                if(userName.equals("Prachi Gupta"))
                {
                        logger.info("VerifyLogin - Passed");
                        captureScreenShot(driver,"verifyLogin");
                        Assert.assertTrue(true);
                }
                else
                {
                        logger.info("VerifyLogin - Failed");
                        captureScreenShot(driver,"VerifyLogin");
                        Assert.assertTrue(false);

                }

                logger.info("***************TestCase Verify Login ends*****************");


        }




}
