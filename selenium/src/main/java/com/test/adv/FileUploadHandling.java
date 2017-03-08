package com.test.adv;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * Created by nani on 3/8/2017.
 */
public class FileUploadHandling {
    String baseUrl = "http://toolsqa.com/automation-practice-form/";
    WebDriver driver;

    @BeforeClass
    public void initalizeDriver(){
        System.setProperty("webdriver.gecko.driver","C:\\Users\\nani\\Downloads\\geckodriver.exe");
        // Open browser with profile
        driver=new FirefoxDriver();

        // Set implicit wait
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        // Maximize window
        driver.manage().window().maximize();
    }

    @Test
    public void verifyFileUpload() throws IOException {
        driver.get(baseUrl);

        WebElement uploadBtn = driver.findElement(By.xpath("//*[@id='photo']"));
        uploadBtn.sendKeys("C:\\Users\\nani\\Downloads\\New.java");

        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        //The below method will save the screen shot in d drive with name "screenshot.png"
        FileUtils.copyFile(scrFile, new File("C:\\Users\\nani\\Downloads\\screenshot_selenium.png"));
    }
}
