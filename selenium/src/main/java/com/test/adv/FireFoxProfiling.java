package com.test.adv;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by nani on 2/13/2017.
 */
public class FireFoxProfiling {
    WebDriver driver;
    @BeforeClass
    public void openBrowser(){
        System.setProperty("webdriver.gecko.driver","C:\\Users\\nani\\Downloads\\geckodriver.exe");

        //creating instance of Firefox driver with default constructor
        //driver = new FirefoxDriver();

        //Get saved profile
        ProfilesIni obj = new ProfilesIni();
        FirefoxProfile myProfile = obj.getProfile("Selenium");


//        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
//        capabilities.setCapability(FirefoxDriver.PROFILE, myProfile);

        //
        DesiredCapabilities capabilities = new DesiredCapabilities().chrome();
        //Set the capablities
        capabilities.setVersion("56.0.2924.87");
        capabilities.setBrowserName("chrome");
        capabilities.setPlatform(Platform.WINDOWS);
        capabilities.setJavascriptEnabled(true);
//        capabilities.setCapability(ChromeOptions.CAPABILITY, options);

        // start the browser with the desired capabilities
        WebDriver driver = new ChromeDriver(capabilities);

        // launch firefox with your saved profile
        driver = new FirefoxDriver(capabilities);
    }

    @Test
    public void vefifyPageTitle(){
//        String title = driver.getTitle();
//        System.out.println("Title = "+title);

    }
}
