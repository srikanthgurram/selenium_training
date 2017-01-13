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
public class Assignment1 {
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

    @Test
    public void verifyMenuLinks(){
        //open javascript menu link using CSS selector
        WebElement listItem = driver.findElement(
                By.cssSelector("ul.nav.navbar-nav > li:nth-child(4)"));
//                By.cssSelector("header > div.container > " +
//                        "nav.collapse.navbar-collapse > ul.nav.navbar-nav > " +
//                        " li:nth-child(4)"));


        // access the link directly by link text
//        driver.findElement(By.linkText("JavaScript")).click();

    // Access the link by using className
//        WebElement listItem = driver.findElement(
//                By.className("container.collapse.navbar-collapse.nav.navbar-nav"));

        listItem.findElement(By.linkText("JavaScript")).click();
        Assert.assertEquals(driver.getCurrentUrl(),
                "http://getbootstrap.com/javascript/");

    }
}
