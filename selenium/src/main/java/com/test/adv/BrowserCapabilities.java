package com.test.adv;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by nani on 3/3/2017.
 */
public class BrowserCapabilities {
    String baseUrl = "http://www.seleniumframework.com/Practiceform/";
    WebDriver driver;


    public void testSetup(){
        //open browser
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl);
    }

    @Test
    public void verifyChromeCapabilities(){
        Map<String, String> mobileEmulation = new HashMap<String, String>();
        mobileEmulation.put("deviceName", "Apple iPhone 6");
        Map<String, Object> chromeOptions = new HashMap<String, Object>();
        chromeOptions.put("mobileEmulation", mobileEmulation);

        System.setProperty("webdriver.chrome.driver","C:\\Users\\nani\\Downloads\\chromedriver.exe");
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);

        WebDriver driver = new ChromeDriver(capabilities);
        driver.get("http://www.google.com");

    }

    @Test(enabled = false)
    public void verifyFirefoxProfiling(){
        //get the saved Firefox profile
        ProfilesIni profile = new ProfilesIni();
        FirefoxProfile myprofile = profile.getProfile("automation");

        //create browser capablity
        //DesiredCapabilities cap = DesiredCapabilities.firefox();

        //cap.setCapability(FirefoxDriver.PROFILE, myprofile);


        //set the firefox driver location
        //cap.setCapability(FirefoxDriver.BINARY,

        System.setProperty("webdriver.gecko.driver",
                "C:\\Users\\nani\\Downloads\\geckodriver-v0.14.0-win64\\geckodriver.exe");

        //load the profile through desired capablities

        //start the driver using the desired capablities
        WebDriver driver = new FirefoxDriver(myprofile);
        driver.manage().window().maximize();

//        driver.get("http://www.google.com");
    }
}
