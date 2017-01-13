package com.test.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by srikanth on 13/1/17.
 */
public class XPaths {
    String baseUrl = "http://getbootstrap.com/";
    WebDriver driver;

    @BeforeClass
    public void testSetup(){
        // get the chromedriver instance
        System.setProperty("webdriver.chrome.driver",
                "/home/srikanth/Downloads/softwares/drivers/chromedriver");

        driver = new ChromeDriver();
        driver.get(baseUrl);
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

    @Test(enabled = false)
    public void verifyMenuLinks(){
        // using Absolute XPATH
        WebElement javaScriptLink = driver.findElement(
                By.xpath("html/body/header/div/nav/ul[1]/li[4]/a"));
        javaScriptLink.click();

        Assert.assertEquals(driver.getCurrentUrl(),
                "http://getbootstrap.com/javascript/");
    }

    @Test
    public void verifyFooterLinks(){
        WebElement examplesLink = driver.findElement(
                By.xpath("html/body/footer/div/ul/li[3]/a"));

        examplesLink.click();
        Assert.assertEquals(driver.getCurrentUrl(),
                "http://getbootstrap.com/getting-started/#examples");
    }
}
