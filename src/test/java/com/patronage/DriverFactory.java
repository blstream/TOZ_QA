package com.patronage;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.HashMap;
import java.util.Map;

public class DriverFactory {

    protected static WebDriver driver;

    public DriverFactory() {
        initialize();
    }

    public void initialize() {
        if (driver == null) {
            createNewDriverInstance();
        }
    }

    private void createNewDriverInstance() {
                ChromeOptions options = new ChromeOptions();
                options.addArguments("start-maximized");

                Map<String, Object> prefs = new HashMap<String, Object>();
                prefs.put("credentials_enable_service", false);
                options.setExperimentalOption("prefs", prefs);

                DesiredCapabilities capabilities = DesiredCapabilities.chrome();
                capabilities.setCapability(ChromeOptions.CAPABILITY, options);
                driver = new ChromeDriver(capabilities);
    }
/*
good but i can handle it without it
    public void setUrl() {
        if (url) {
            if (url.startsWith("http://") || url.startsWith("https://")) {
                driver.get(url)
            } else {
                driver.get("http://" + url)
            }
        }
    }
*/
    public WebDriver getDriver() {
        return driver;
    }

    public void destroyDriver() {
        // security ? :)
        if(driver !=null) {
            driver.quit();
            driver = null;
        }

    }

}
