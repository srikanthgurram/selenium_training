package com.test.adv;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by srikanth on 7/2/17.
 */
public class AlertsPractice {
    String baseUrl = "http://www.seleniumframework.com/Practiceform/";
    WebDriver driver;

    @BeforeClass
    public void testSetup(){
        System.setProperty("webdriver.chrome.driver", "/home/srikanth/Downloads/softwares/drivers/chromedriver");
        //open browser
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl);
    }

    @Test
    public void verifyAlerts(){
        // Open Alert
        try{
            WebElement alertdiv = driver.findElement(By.cssSelector("" +
                    "div.wpb_raw_code.wpb_content_element.wpb_raw_html > " +
                            "div.wpb_wrapper > " +
                            "p > button#alert"));
            alertdiv.findElement(By.id("alert")).click();
        }catch (Exception e){
            e.printStackTrace();
        }

        //Switch to the Alert
        String alertMessage = driver.switchTo().alert().getText();
        System.out.println("Message displayed: "+alertMessage);
        Assert.assertTrue(alertMessage.contains("share this website"));

        //Accept the alert
        driver.switchTo().alert().accept();
    }
}
