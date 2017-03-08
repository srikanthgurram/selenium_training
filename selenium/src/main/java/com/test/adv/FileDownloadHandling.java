package com.test.adv;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by nani on 3/8/2017.
 */
public class FileDownloadHandling {
    String baseUrl = "";
    WebDriver driver;

    @BeforeClass
    public void initalizeDriver(){
        // Create a profile
        FirefoxProfile profile=new FirefoxProfile();
        // Set preferences for file type
        profile.setPreference("browser.helperApps.neverAsk.openFile", "application/octet-stream");
        System.setProperty("webdriver.gecko.driver","C:\\Users\\nani\\Downloads\\geckodriver.exe");

        // Open browser with profile
        driver=new FirefoxDriver(profile);

        // Set implicit wait
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        // Maximize window
        driver.manage().window().maximize();
    }

    @Test
    public void verifyFileDownload(){
        String baseUrl = "http://toolsqa.com/automation-practice-form/";
        driver.get(baseUrl);
        driver.findElement(By.linkText("Test File to Download")).click();
    }

}
