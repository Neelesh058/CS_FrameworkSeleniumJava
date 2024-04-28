package com.qa.testcases;

import com.qa.utilities.ReadConfig;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;


import java.io.IOException;
import java.time.Duration;

public class BaseClass {

    ReadConfig readConfig = new ReadConfig();

    String url = readConfig.getBaseUrl();
    String browser = readConfig.getBrowser();
    public static WebDriver driver;
    public static Logger logger;

    public BaseClass() throws IOException {
    }
@BeforeClass
    public void setup() {

        //launch browser
        if (browser.equals(browser.toLowerCase())) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browser.equals(browser.toLowerCase())) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        } else if (browser.equals(browser.toLowerCase())) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else {
            driver = null;
        }
        //implicit wait of 10 secs
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //for logging
        logger = LogManager.getLogger("MyStoreV1");

        //open url
        driver.get(url);
        logger.info("url opened");
    }


    @AfterClass
    public void tearDown()
    {
        driver.close();
        driver.quit();
    }
}
