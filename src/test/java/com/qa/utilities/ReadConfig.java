package com.qa.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {

    Properties properties;

    String path = "C:\\Users\\a610948\\IdeaProjects\\CS_FrameworkSeleniumJava\\Configuration\\config.properties";
    public ReadConfig() throws IOException {
        properties = new Properties();
        FileInputStream fis=new FileInputStream(path);
        properties.load(fis);
    }

    public String getBaseUrl()
    {
        String value = properties.getProperty("baseUrl");

        if(value!=null)
            return value;
        else
            throw new RuntimeException("url not specified in config file.");

    }

    public String getBrowser()
    {
        String value = properties.getProperty("browser");

        if(value!=null)
            return value;
        else
            throw new RuntimeException("url not specified in config file.");

    }
}
