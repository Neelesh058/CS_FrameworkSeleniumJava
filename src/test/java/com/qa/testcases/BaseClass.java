package com.qa.testcases;

import com.qa.utilities.ReadConfig;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;


import java.io.IOException;
import java.time.Duration;
import java.util.Arrays;

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

        switch (browser) {
            case "chrome":
                WebDriverManager.chromedriver().setup();

//                Chrome will open in incognito window
//                ChromeOptions options = new ChromeOptions();
//                options.addArguments("incognito");
//                DesiredCapabilities cap = DesiredCapabilities.chrome();
//                cap.setCapability(ChromeOptions.CAPABILITY, options);
//
                driver = new ChromeDriver();
                break;
            case "edge":
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
        }
        //for logging
        logger = LogManager.getLogger("MyStoreV1");

        //open url
        driver.get(url);
        driver.manage().window().maximize();
        logger.info("url opened");
    }


    @AfterClass
    public void tearDown() {
//        driver.close();
//        driver.quit();
    }
}

