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

    @Test(enabled = true)
    public void verifyMenuLinks(){
        /**
         *  using Absolute XPATH
        */
        WebElement javaScriptLink = driver.findElement(
                By.xpath("html/body/header/div/nav/ul[1]/li[4]/a"));
        /**
         * Relative XPATH
         */
    /*
        //body/header/div/nav/ul/li[4]/a
        //header/div/nav/ul/li[4]/a
        //a[@href='../javascript/']
        //nav[@class='collapse navbar-collapse']/ul/li[4]/a
        //nav[@id='bs-navbar']/ul/li[4]/a
    	.//nav[@id='bs-navbar']/ul[1]/li[4]/a
        //header[@id='top']/div/nav/ul/li[4]/a
        .//nav[@id='bs-navbar' and @class='collapse navbar-collapse']
    */
        driver.findElement(
                By.xpath("//header/div/nav/ul/li[4]/a")).click();

        Assert.assertEquals(driver.getCurrentUrl(),
                "http://getbootstrap.com/javascript/");
    }

    @Test(enabled = false)
    public void verifyFooterLinks(){
        /**
         * Absoulte XPATH
         */
        driver.findElement(
                By.xpath("html/body/footer/div/ul/li[3]/a")).click();
        /**
         * Relative XPATH
         *
         */
        /*
            //body/footer/div/ul/li[3]/a
            //footer/div/ul/li[3]/a
            //footer[@class='bs-docs-footer']/div/ul/li[3]/a
            //ul[@class='bs-docs-footer-links']/li[3]/a
            //a[@href=\"../getting-started/#examples\"]
         */

        driver.findElement(
                By.xpath("//footer/div/ul/li[3]/a")).click();

        Assert.assertEquals(driver.getCurrentUrl(),
                "http://getbootstrap.com/getting-started/#examples");
    }


}
